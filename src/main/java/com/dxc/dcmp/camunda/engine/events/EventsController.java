package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflow;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("v1/events")
public class EventsController {

    private final EventsService eventsService;

    public EventsController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    @GetMapping(path = "starts")
    public List<StartWorkflow> starts() {
        return eventsService.startsWorkflowList();
    }

    @PostMapping(path = "item")
    public void add(@RequestBody StartWorkflow startWorkflow) {
        eventsService.add(startWorkflow);
    }
}
