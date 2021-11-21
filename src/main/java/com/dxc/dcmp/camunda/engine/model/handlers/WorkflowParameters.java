package com.dxc.dcmp.camunda.engine.model.handlers;

public class WorkflowParameters {
    private String workflowName;
    private Payload payload;

    public WorkflowParameters() {
    }

    public WorkflowParameters(String workflowName, Payload payload) {
        this.workflowName = workflowName;
        this.payload = payload;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public Payload getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return "WorkflowParameters{" +
                "workflowName='" + workflowName + '\'' +
                ", payload=" + payload +
                '}';
    }
}
