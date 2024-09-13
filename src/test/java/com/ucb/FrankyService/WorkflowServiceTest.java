package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkflowServiceTest {



    @Test
    void testGetWorkflow() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "Tiene rama develop, release, hotfix"));
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
        workflowService.create(new Workflow("gitflowcito", "Tiene rama develop, release, hotfix"));
        workflowService.create(new Workflow("     feauture-branch     ", "description2"));
        boolean response =  workflowService.delete("gitflowcito");
        assertTrue(response);
    }

    @Test
    void updateSimple() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "Tiene rama develop, release, hotfix"));

        Workflow otherWorkflow = new Workflow("feauture-branch", "description2");
        assertTrue(workflowService.update("gitflowcito", otherWorkflow));
    }

    @Test
    void updateWithSpacesInName() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "Tiene rama develop, release, hotfix"));
        workflowService.create(new Workflow("     feauture-branch     ", "Basado en ramas para cada funcionalidad"));

        Workflow otherWorkflow = new Workflow("    feauture-branch   ", "Cada rama se crea por una funcionalidad");
        assertTrue(workflowService.update("feauture-branch", otherWorkflow));

    }

    @Test
    void deleteWithSpacesInName() {
        WorkflowService workflowService = new WorkflowService();
        workflowService.create(new Workflow("gitflowcito", "Tiene rama develop, release, hotfix"));
        workflowService.create(new Workflow("     centralized    ", "Solo se trabaja en la main"));

        assertTrue(workflowService.delete("    centralized"));
    }
}