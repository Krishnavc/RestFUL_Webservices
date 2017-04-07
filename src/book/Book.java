package book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;	
	
//annotations
@Path("/book")
public class Book {

		@GET
		@Produces(MediaType.TEXT_XML)           //XML.JSON
		public String sayHelloXML(){
			
			String response = "<?xml version = '1.0'?>" + "<hello>Hello XML</hello>";
			return response;
				
		}
		/*
		@GET
		@Produces(MediaType.APPLICATION_JSON)           //XML.JSON
		public String sayHelloJSON(){
			
			String response = null;
			return response;
		}*/
}

