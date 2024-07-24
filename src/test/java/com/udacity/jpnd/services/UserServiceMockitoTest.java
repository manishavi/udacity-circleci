package com.udacity.jpnd.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserServiceMockitoTest {
    private UserService userService;

    @Mock
    private SalesService salesService;

    @BeforeEach
    void init() {
        userService = new UserServiceImpl(salesService);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Fizz", "Buzz", "FizzBuzz"})
    public void fancyBusinessFakeFizzBuzz_getsFizzBuzzString_returnsSameString(String returnString) {
        when(salesService.fizzBuzz(1)).thenReturn(returnString);
        assertEquals(returnString, userService.fancyBusiness(1));
    }

    @Test
    public void fancyBusiness_getsEvenNumber_returnsBaz() {
//        when(salesService.fizzBuzz(anyInt())).thenReturn("2");
        // verify that no matter what number we pass into fancyBusiness,
        // we'll return "Baz" if fizzbuzz yields an even number
        for(int i = 0; i < 100; i++) {
            when(salesService.fizzBuzz(anyInt())).thenReturn("2");
            Assertions.assertEquals("Baz", userService.fancyBusiness(i));
        }
    }


}
