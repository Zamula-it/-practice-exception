package org.itstep.task01.exeption;
public class EmptyException extends ListException{
    public EmptyException() {
    }
    public EmptyException(String message) {
        super(message);
    }
    public EmptyException(String message, Throwable cause) {
        super(message, cause);
    }
    public EmptyException(Throwable cause) {
        super(cause);
    }
    public EmptyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}