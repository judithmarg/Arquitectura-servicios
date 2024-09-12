package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;

import java.util.List;

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
    void delete() {
        WorkflowService workflowService = new WorkflowService();
       boolean resp =  workflowService.delete(new Workflow("gitflowcito", "description"));
        assertEquals(false,resp);
    }

    @Test
    void delete2() {
        WorkflowService workflowService = new WorkflowService();

        workflowService.create(new Workflow("     feauture-branch     ", "description2"));

        boolean resp =  workflowService.delete(new Workflow("feauture-branch", "description2"));
        assertEquals(true,resp);
    }

    @Test
    void update() {
    }
}