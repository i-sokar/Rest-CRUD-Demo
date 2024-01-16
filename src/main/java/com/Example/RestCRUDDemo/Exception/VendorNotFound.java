package com.Example.RestCRUDDemo.Exception;

public class VendorNotFound extends  RuntimeException{
    public VendorNotFound(String message) {
        super(message);
    }

    public VendorNotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
