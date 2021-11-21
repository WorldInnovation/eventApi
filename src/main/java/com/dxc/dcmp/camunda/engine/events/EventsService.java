package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.Payload;
import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflow;
import com.dxc.dcmp.camunda.engine.model.handlers.WorkflowParameters;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService {

    private final StartWorkflowRepository startWorkflowRepository;

    public EventsService(StartWorkflowRepository startWorkflowRepository) {
        this.startWorkflowRepository = startWorkflowRepository;
    }

    public List<StartWorkflow> startsWorkflowList() {
        return startWorkflowRepository.findAll();
    }

    public void add(StartWorkflow startWorkflow){
        startWorkflowRepository.save(startWorkflow);
    }
}
