package com.ucb.FrankyService;

public record TranslateRequestDto(
        String message,
        Language source,
        Language target
) {
}
