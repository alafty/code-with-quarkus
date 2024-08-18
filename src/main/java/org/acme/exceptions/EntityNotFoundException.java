package org.acme.exceptions;

import org.acme.enumerator.EntityType;

public class EntityNotFoundException extends EntityException {
    static String messageTemplate = "Entity not found: %s";

    public EntityNotFoundException(EntityType entityType, String message) {
        super(String.format(messageTemplate, message, entityType));
    }
}