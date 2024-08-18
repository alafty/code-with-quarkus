package org.acme.controllers;

import org.acme.dto.CourseDTORequest;
import org.acme.dto.CourseDTOResponse;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/courses")
public class CourseController {


    @GET
    public CourseDTOResponse getCourse()
    {
        return CourseDTOResponse.builder()
                .credit(2)
                .description("Course gamd moot")
                .build();
    }

    @POST
    public CourseDTOResponse addCourse(CourseDTORequest courseDTORequest)
    {
        return CourseDTOResponse.builder()
                .credit(2)
                .description("Course gamd moot")
                .build();
    }
    
}
