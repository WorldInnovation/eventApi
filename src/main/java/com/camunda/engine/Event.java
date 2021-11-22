package com.camunda.engine;

public class Event {
    private Long id;
    private String name;
    private boolean enabled;
    private String topic;

    public Event() {
    }

    public Event(String name, boolean enabled, String topic) {
        this.name = name;
        this.enabled = enabled;
        this.topic = topic;
    }
}

/*
public class Payload{
    public String customerId;
    public String foo;
}

public class WorkflowParameters{
    public String workflow_name;
    public Payload payload;
}

public class Action{
    public String type;
    public WorkflowParameters workflow_parameters;
}



{
  "name": "event-handler-customer-created",
  "enabled": true,
  "topic": "dcmp.customer.created",
  "actions": [
    {
      "type": "start_workflow",
      "workflow_parameters": {
        "workflow_name": "start.v4",
        "payload": {
          "customerId": ".workflow_parameters.payload.customerId",
          "foo": ".workflow_parameters.payload.foo"
        }
      }
    }
  ]
}
*/
