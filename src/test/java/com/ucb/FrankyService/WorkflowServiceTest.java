package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkflowServiceTest {



    @Test
    void testGetWorkflow() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "description"));
        workflowService.create(new Workflow("feauture-branch", "description2"));
        assertEquals( 2,workflowService.obtainList().size());
    }

    @Test
    void deleteNonexistentWorkflow() {
        WorkflowService workflowService = new WorkflowService();
        boolean resp =  workflowService.delete("gitflowcito");
        assertFalse(resp);
    }

    @Test
    void deleteExistentWorkflow() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "description"));
        workflowService.create(new Workflow("     feauture-branch     ", "description2"));
        boolean response =  workflowService.delete("gitflowcito");
        assertTrue(response);
    }

    @Test
    void update() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "description"));

        Workflow otherWorkflow = new Workflow("feauture-branch", "description2");
        assertTrue(workflowService.update("gitflowcito", otherWorkflow));
    }
}