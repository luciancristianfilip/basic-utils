package org.basic.utils;

public enum HttpStatusCode {
    
    SUCCESS(200),
    REDIRECT(300),
    CLIENT_ERROR(400),
    SERVER_ERROR(500)
    ;

    private final int statusCode;

    HttpStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    
    public int getStatusCode() {
        return statusCode;
    }

    @Override
    public String toString() {
        return "HttpStatusCode is [" + statusCode + "].";
    }
}
