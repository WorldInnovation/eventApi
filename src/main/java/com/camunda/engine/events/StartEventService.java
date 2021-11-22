package com.camunda.engine.events;

import com.camunda.engine.model.handlers.StartWorkflow;
import com.camunda.engine.response.RestApiException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StartEventService {

    private final StartWorkflowRepository startWorkflowRepository;

    public StartEventService(StartWorkflowRepository startWorkflowRepository) {
        this.startWorkflowRepository = startWorkflowRepository;
    }

    public List<StartWorkflow> startsWorkflowList() {
        return startWorkflowRepository.findAll();
    }

    public void add(StartWorkflow startWorkflow) {
        if (startWorkflowRepository.findStartWorkflowByCustomerId(startWorkflow.getCustomerId()).isPresent()){
            throw new RestApiException("CustomerId has been hold");
        }
        startWorkflowRepository.save(startWorkflow);
    }

    public void delete(Long startWorkflowId) {
        startWorkflowRepository.deleteById(startWorkflowId);
    }

    public void update(StartWorkflow startWorkflow) {
        Optional<StartWorkflow> row = startWorkflowRepository.findById(startWorkflow.getId());
        if (row.isPresent()) {
            StartWorkflow item = row.get();
            if (!startWorkflow.getWorkflowName().isEmpty()) {
                item.setWorkflowName(startWorkflow.getWorkflowName());
            }
            if (!startWorkflow.getType().isEmpty()) {
                item.setType(startWorkflow.getType());
            }
            if (startWorkflow.getCustomerId() != null) {
                item.setCustomerId(startWorkflow.getCustomerId());
            }
            if (!startWorkflow.getFoo().isEmpty()) {
                item.setFoo(startWorkflow.getFoo());
            }
            startWorkflowRepository.save(item);
        }
    }
}
