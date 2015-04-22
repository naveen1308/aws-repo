package com.modusbox.mule;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

 
@Path("/hello")
public class HelloResource {
 
    @GET
    @Produces("text/plain")
    public String getMsg(){
        return "REST and be well.";
        //return Response.status(Status.OK).entity("Rest and be well.").build();
 
    }
 
} 