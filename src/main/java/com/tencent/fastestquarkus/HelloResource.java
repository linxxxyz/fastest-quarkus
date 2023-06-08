package com.tencent.fastestquarkus;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author linxing
 * @date 2023/6/8
 */
@Path("/hello")
public class HelloResource {

    @GET
    @Path("/name/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello(@PathParam("name") String name){
        return "你好 " + name;
    }
}
