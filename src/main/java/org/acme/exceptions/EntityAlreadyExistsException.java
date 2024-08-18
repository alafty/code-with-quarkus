package org.acme.exceptions;

import org.acme.enumerator.EntityType;

public class EntityAlreadyExistsException extends EntityException {
    static String messageTemplate = "Entity already exists: %s";

    public EntityAlreadyExistsException(EntityType entityType, String message) {
        super(String.format(messageTemplate, message, entityType));
    }
}