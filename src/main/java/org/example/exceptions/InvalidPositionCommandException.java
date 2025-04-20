package org.example.exceptions;

public class InvalidPositionCommandException extends RuntimeException {
    public InvalidPositionCommandException(String message) {
        super(message);
    }
}
