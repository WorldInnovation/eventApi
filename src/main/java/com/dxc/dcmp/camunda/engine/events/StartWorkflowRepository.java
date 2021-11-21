package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflow;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StartWorkflowRepository extends JpaRepository<StartWorkflow, Long> {
    Optional<StartWorkflow> findStartWorkflowByCustomerId(String customerId);
}
