package com.udacity.jpnd.services;

public class UserServiceImpl implements UserService {
    SalesService salesService;

    public UserServiceImpl(SalesService salesService) {
        this.salesService = salesService;
    }

    @Override
    public String fancyBusiness(int n) {
        String result = salesService.fizzBuzz(n); //gets the fizzBuzz value
        switch(result) { //then does something else with it
            case "Fizz":
            case "Buzz":
            case "FizzBuzz":
                return result;
            default:
                return Integer.parseInt(result) % 2 == 0 ? "Baz" : "Cat";
        }
    }
}