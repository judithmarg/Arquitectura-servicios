package com.ucb.FrankyService;

public record UpdateWorkflow(
        String originalName,
        String updateName,
        String updateDescription
) {
}
