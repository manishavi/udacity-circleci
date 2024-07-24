package com.udacity.jpnd.services;

public class DummySalesService implements SalesService {
    SalesService salesService;
    public  DummySalesService(SalesService salesService) {
        this.salesService = salesService;
    }

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

    public String flashyAction(){
        return "";
    }

    @Override
    public String fizzBuzz(int i) {
        return "";
    }
}
