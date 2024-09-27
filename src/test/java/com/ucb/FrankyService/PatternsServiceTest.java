package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.*;

class PatternsServiceTest {

    @Test
    void findPattern() throws CategoryException {
        //arrange
        PatternsRepository repository = new PatternsRepository();
        PatternsService patternsService = new PatternsService(repository);
        String[] comparator = new String[]{"Replace direct object construction calls",
                "Calls to a factory method",
                "Objects returned by a factory method are often referred to as products."
        };

        //act
        Pattern patternResult = patternsService.findPattern("Factory Method", "Creational");

        //assert
        assertThat(patternResult.getFeatures()).isEqualTo(comparator);
    }

    @Test
    void findPatternDoesNotExist() {
        //arrange
        PatternsRepository repository = new PatternsRepository();
        PatternsService patternsService = new PatternsService(repository);

        //assert
        assertThatExceptionOfType(CategoryException.class)
                .isThrownBy(() ->
                        //act
                        patternsService.findPattern("Adapter", "Creational"));
    }
}