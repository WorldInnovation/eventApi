package com.dxc.dcmp.camunda.engine.model;

public class StartWorkflow {
    private Long id;
    private String type;
    private WorkflowParameters workflowParameters;

    public StartWorkflow() {
    }

    public StartWorkflow(String type, WorkflowParameters workflowParameters) {
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
