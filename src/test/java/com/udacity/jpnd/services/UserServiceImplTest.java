package com.udacity.jpnd.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserServiceImplTest {

    @ParameterizedTest
    @ValueSource(strings = {"Fizz", "Buzz", "FizzBuzz"})
    public void fancyBusinessFakeFizzBuzz_getsFizzBuzzString_returnsSameString(String returnString) {
        SalesService salesService = new FakeSalesService(returnString);
        UserService userService = new UserServiceImpl(salesService);
        assertEquals(returnString, userService.fancyBusiness(1));
    }
}
