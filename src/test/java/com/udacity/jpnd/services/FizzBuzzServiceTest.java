package com.udacity.jpnd.services;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static junit.framework.Assert.assertEquals;

public class FizzBuzzServiceTest {
    FizzBuzzService fizzBuzzService;

    @BeforeEach
    void init() {
        fizzBuzzService = new FizzBuzzService();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9, 33})
    public void fizzBuzz_multipleThreeNotFive_returnsFizz(int n){
        assertEquals("Fizz", fizzBuzzService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    public void fizzBuzz_multipleFiveNotThree_returnsBuzz(int n){
        assertEquals("Buzz", fizzBuzzService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 225, 3375})
    public void fizzBuzz_multipleThreeANDFive_returnsFizzBuzz(int n){
        assertEquals("FizzBuzz", fizzBuzzService.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 41, 43})
    public void fizzBuzz_notMultipleThreeOrFive_returnsFizzBuzz(int n){
        assertEquals(Integer.toString(n), fizzBuzzService.fizzBuzz(n));
    }
}
