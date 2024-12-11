package org.acme.exceptions;

public class RequestNotAuthorizedException extends SecurityException {
    static String message = "Request not authorized";

    public RequestNotAuthorizedException() {
        super(message);
    }
}