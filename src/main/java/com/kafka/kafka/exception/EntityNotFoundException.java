package com.kafka.kafka.exception;


import org.springframework.web.bind.annotation.ControllerAdvice;


public class EntityNotFoundException extends Exception {
private String message;
    public EntityNotFoundException(String message) {
        super(message);
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
}
