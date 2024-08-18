package org.acme.controllers;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/courses")
public class CourseController {


    @GET
    public String getCourse()
    {
        return "Da course gamd mooot";
    }

    @POST
    public String addCourse()
    {
        return "el course added";
    }
    
}
