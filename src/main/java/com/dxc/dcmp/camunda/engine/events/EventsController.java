package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflowHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventsController {

    private final EventsService eventsService;

    public EventsController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    @GetMapping(path = "starts")
    public List<StartWorkflowHandler> startsWorkflowList() {
        return eventsService.startsWorkflowList();
    }
}
