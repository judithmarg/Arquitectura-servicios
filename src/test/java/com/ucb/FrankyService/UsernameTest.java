package com.ucb.FrankyService;

import org.junit.jupiter.api.Test;

import javax.naming.InvalidNameException;

import static org.assertj.core.api.AssertionsForClassTypes.*;

class UsernameTest {

    @Test
    void convertsToLowerCase() throws InvalidNameException {

        //arrange
        var username = new Username("Judith");

        //act
        String actual = username.asLowerCase();

        //assert
        assertThat(actual).isEqualTo("judith");
    }

    @Test
    void acceptsMinimumLengthName() {
        assertThatNoException()
                .isThrownBy(()->new Username("Abcd"));
    }

    @Test
    void rejectsShortName() {
        assertThatExceptionOfType(InvalidNameException.class)
                .isThrownBy(
                        ()-> new Username("Roberto Carlos")
                );
    }
}