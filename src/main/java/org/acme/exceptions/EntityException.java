package org.acme.exceptions;

public class EntityException extends RuntimeException {
    public EntityException(String message) {
        super(message);
    }
}