package com.dxc.dcmp.camunda.engine.model.handlers;

public class StartWorkflowHandler {
    private Long id;
    private String type;
    private WorkflowParameters workflowParameters;

    public StartWorkflowHandler() {
    }

    public StartWorkflowHandler(String type, WorkflowParameters workflowParameters) {
        this.type = type;
        this.workflowParameters = workflowParameters;
    }

    public String getType() {
        return type;
    }

    public WorkflowParameters getWorkflowParameters() {
        return workflowParameters;
    }
}
