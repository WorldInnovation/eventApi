package com.dxc.dcmp.camunda.engine.events;

import com.dxc.dcmp.camunda.engine.model.handlers.StartWorkflow;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("v1/events")
public class StartEventController {

    private final StartEventService eventsService;

    public StartEventController(StartEventService eventsService) {
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

    @RequestMapping (path = "item/{startWorkflowId}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long startWorkflowId) {
        eventsService.delete(startWorkflowId);
    }

   @PutMapping (path = "item")
    public void update(@RequestBody StartWorkflow startWorkflow) {
        eventsService.update(startWorkflow);
    }

}
