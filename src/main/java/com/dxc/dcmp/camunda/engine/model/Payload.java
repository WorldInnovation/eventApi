package com.dxc.dcmp.camunda.engine.model;

public class Payload {
    private String customerId;
    private String foo;

    public Payload() {
    }

    public Payload(String customerId, String foo) {
        this.customerId = customerId;
        this.foo = foo;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFoo() {
        return foo;
    }
}
