package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.Payload;
import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflowHandler;
import com.dxc.dcmp.camunda.engine.model.handlers.WorkflowParameters;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EventsService {
    @GetMapping(path = "starts")
    public List<StartWorkflowHandler> startsWorkflowList() {
        Payload payload = new Payload("customerId", "foo");
        WorkflowParameters workflowParameters = new WorkflowParameters("start.v1", payload);

        return List.of(
                new StartWorkflowHandler("startEvent", workflowParameters)
        );
    }
}
