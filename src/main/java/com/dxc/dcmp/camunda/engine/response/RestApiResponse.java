package com.dxc.dcmp.camunda.engine.response;

public class RestApiResponse {
    private int status;
    private String messages;
    private Object data;

    public RestApiResponse(int status, String messages, Object data) {
        this.status = status;
        this.messages = messages;
        this.data = data;
    }

    public RestApiResponse(int status, String messages) {
        this.status = status;
        this.messages = messages;
    }

    public int getStatus() {
        return status;
    }

    public String getMessages() {
        return messages;
    }

    public Object getData() {
        return data;
    }
}
