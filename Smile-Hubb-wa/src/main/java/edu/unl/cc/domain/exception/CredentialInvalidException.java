package edu.unl.cc.domain.exception;

public class CredentialInvalidException extends RuntimeException {
    public CredentialInvalidException() {
        super("Credenciales Invalidas");
    }

    public CredentialInvalidException(String message) {
        super(message);
    }

    public CredentialInvalidException(String message, Throwable cause) {
        super(message, cause);
    }
}
