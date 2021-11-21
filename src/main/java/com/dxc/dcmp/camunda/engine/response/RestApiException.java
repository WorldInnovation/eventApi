package com.dxc.dcmp.camunda.engine.response;

public class RestApiException extends RuntimeException{
    public RestApiException(String message) {
        super(message);
    }
}
