package edu.unl.cc.domain.exception;

public class AlreadyEntityException extends Exception {
    public AlreadyEntityException() {
        this("Entidad ya existe");
    }

    public AlreadyEntityException(String message) {
        super(message);
    }

    public AlreadyEntityException(String message, Throwable cause) {
        super(message, cause);
    }
}
