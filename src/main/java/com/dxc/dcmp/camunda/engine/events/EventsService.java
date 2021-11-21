package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.Payload;
import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflow;
import com.dxc.dcmp.camunda.engine.model.handlers.WorkflowParameters;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class EventsService {

    public List<StartWorkflow> startsWorkflowList() {
        Payload payload = new Payload("customerId", "foo");
        WorkflowParameters workflowParameters = new WorkflowParameters("start.v1", payload);

        return List.of(
                new StartWorkflow("startEvent", workflowParameters)
        );
    }

    public void add(StartWorkflow startWorkflow){
        System.out.println(startWorkflow);
    }
}
