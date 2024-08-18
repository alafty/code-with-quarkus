package org.acme.exceptions;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ControllerAdvice implements ExceptionMapper<Exception>{
    
    @Override
    public Response toResponse(Exception e)
    {
        return Response.status(Response.Status.BAD_REQUEST).entity(new Error(e.getMessage())).build();
    }
}
