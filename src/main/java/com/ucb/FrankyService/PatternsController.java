package com.ucb.FrankyService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patterns")
public class PatternsController {

    PatternsService patternsService;
    public PatternsController(PatternsService patternsService) {
        this.patternsService = patternsService;
    }

    @GetMapping()
    public ResponseEntity<PatternResponseDto> getPatternByName(@RequestBody PatternRequestDto patternRequestDto) {
        Pattern pattern = patternsService.findByName(patternRequestDto.name());
        PatternResponseDto patternResponseDto = new PatternResponseDto(
                pattern.getName(),
                pattern.getCategory(),
                pattern.getFeatures(),
                pattern.getAdvantages(),
                pattern.getDisadvantages(),
                pattern.getApplication()
        );
        return ResponseEntity.ok(patternResponseDto);
    }
}
