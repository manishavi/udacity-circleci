package com.udacity.jpnd.services;

import java.util.HashMap;
import java.util.Map;

public class MockSalesService implements SalesService{
    //stores responses for inputs
    private Map<Integer, String> returnValues = new HashMap<>();
    @Override
    public String fizzBuzz(int i) {
        return returnValues.getOrDefault(i, null);
    }
    //allows users to customize return values programmatically
    public void setReturnForInput(int i, String val) {
        returnValues.put(i, val);
    }
}
