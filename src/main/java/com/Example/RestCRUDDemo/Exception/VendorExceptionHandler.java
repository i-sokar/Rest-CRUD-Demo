package com.Example.RestCRUDDemo.Exception;

import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class VendorExceptionHandler {

    @ExceptionHandler(value = {VendorNotFound.class})
    public ResponseEntity<Object> handleVendorNotFoundException(@NotNull VendorNotFound vendorNotFound){

        VendorException vendorException= new VendorException(
                vendorNotFound.getMessage(),
                vendorNotFound.getCause(),
                HttpStatus.NOT_FOUND
        );
        return new ResponseEntity<>(vendorException,HttpStatus.NOT_FOUND);
    }
}
