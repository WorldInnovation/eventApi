package com.dxc.dcmp.camunda.engine;

import com.dxc.dcmp.camunda.engine.model.Payload;
import com.dxc.dcmp.camunda.engine.model.StartWorkflow;
import com.dxc.dcmp.camunda.engine.model.WorkflowParameters;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@SpringBootApplication
@RestController
public class RestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

	@GetMapping(path = "starts")
	public List<StartWorkflow> startWorkflow() {
		Payload payload = new Payload("customerId", "foo");
		WorkflowParameters workflowParameters = new WorkflowParameters("start.v1", payload);

		return List.of(
				new StartWorkflow("startEvent", workflowParameters)
		);
	}
}
