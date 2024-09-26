package com.ucb.FrankyService;

public record PatternResponseDto(
        String name,
        String category,
        String[] features,
        String[] pros,
        String[] cons,
        String[] application
) {
}
