package com.modusbox.mule;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
 
@Path("/helloworld")
public class HelloWorldResource {
 
    @POST
    @Produces("text/plain")
    @Path("/{name}")
    public String sayHelloWithUri(@PathParam("name") String name) {
    	System.out.println(name);
        return "Hello " + name;
    }
}

