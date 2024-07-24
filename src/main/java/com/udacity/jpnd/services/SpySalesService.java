package com.udacity.jpnd.services;

import java.util.ArrayList;
import java.util.List;

public class SpySalesService implements SalesService {
    //tracks number of calls and the parameters used
    private int numFizzBuzzCalled;
    private List<Integer> parameters = new ArrayList<>();
    @Override
    public String fizzBuzz(int i) {
        numFizzBuzzCalled++;
        parameters.add(i);
        return null;
    }
    public int getNumFizzBuzzCalled() { return numFizzBuzzCalled; }
    public List<Integer> getParameters() { return parameters; }
}