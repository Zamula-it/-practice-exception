package org.itstep.task02;
class Exept extends Exception{
    public Exept() {
    }
    public Exept(String message) {
        super(message);
    }
    public Exept(String message, Throwable cause) {
        super(message, cause);
    }
    public Exept(Throwable cause) {
        super(cause);
    }
    public Exept(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}