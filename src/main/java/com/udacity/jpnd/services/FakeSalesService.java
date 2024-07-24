package com.udacity.jpnd.services;

public class FakeSalesService implements SalesService{
    private String returnValue;

    public FakeSalesService(String returnValue) {
        this.returnValue = returnValue;
    }

    @Override
    public String fizzBuzz(int i) {
        return returnValue;
    }
}
