package org.acme.exceptions;

public class CreditExceededLimitException extends BussinesLogicException {
    static String message = "Credit exceeded limit";

    public CreditExceededLimitException() {
        super(message);
    }
}