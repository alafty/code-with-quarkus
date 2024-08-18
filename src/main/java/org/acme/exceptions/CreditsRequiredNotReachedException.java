package org.acme.exceptions;

public class CreditsRequiredNotReachedException extends BussinesLogicException {
    static String message = "Credits required not reached";

    public CreditsRequiredNotReachedException() {
        super(message);
    }
}
