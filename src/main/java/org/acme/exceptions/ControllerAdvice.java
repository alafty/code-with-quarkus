package org.acme.exceptions;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class ControllerAdvice implements ExceptionMapper<Exception>{

    public Response toResponse(CreditExceededLimitException e)
    {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new Error(e.getMessage()))
                .build();
    }

    public Response toResponse(CreditsRequiredNotReachedException e)
    {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new Error(e.getMessage()))
                .build();
    }

    public Response toResponse(EntityAlreadyExistsException e)
    {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new Error(e.getMessage()))
                .build();
    }
    
    public Response toResponse(EntityNotFoundException e)
    {
        return Response.status(Response.Status.NOT_FOUND)
                .entity(new Error(e.getMessage()))
                .build();
    }

    public Response toResponse(RequestNotAuthorizedException e)
    {
        return Response.status(Response.Status.UNAUTHORIZED)
                .entity(new Error(e.getMessage()))
                .build();
    }
    
    @Override
    public Response toResponse(Exception e)
    {
        return Response.status(Response.Status.BAD_REQUEST).entity(new Error(e.getMessage())).build();
    }
}
