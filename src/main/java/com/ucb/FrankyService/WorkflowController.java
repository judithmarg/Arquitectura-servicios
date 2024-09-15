package com.ucb.FrankyService;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/work-flow")
public class WorkflowController {

    WorkflowService workflowService;

    public WorkflowController(WorkflowService workflowService) {
        this.workflowService = workflowService;
    }

    @GetMapping()
    public List list() {
        return workflowService.obtainList();
    }

    @PostMapping()
    public void save(
            @RequestBody WorkflowDto workflowDto
    ) {
        Workflow workflow = new Workflow(
                workflowDto.name(),
                workflowDto.description()
        );
        this.workflowService.create(
                workflow
        );

    }

    @PutMapping("/update")
    public void update(
            @RequestBody UpdateWorkflow updateWorkflow
    ){
        Workflow workflow = new Workflow(
                updateWorkflow.updateName(),
                updateWorkflow.updateDescription()
        );
        this.workflowService.update(updateWorkflow.originalName(), workflow);
    }

    @DeleteMapping("/delete/{name}")
    public void delete(
            @PathVariable String name
    ){
        this.workflowService.delete(name);
    }
}
