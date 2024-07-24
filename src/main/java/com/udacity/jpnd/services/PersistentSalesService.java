package com.udacity.jpnd.services;

public class PersistentSalesService implements SalesService {

    private SalesRepository salesRepository;

    public PersistentSalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @Override
    public String fizzBuzz(int i) {
        String retVal = fizzBuzzInternal(i);
        salesRepository.saveResults(i, retVal); //verify THIS method
        return retVal;
    }


    private String fizzBuzzInternal(int i) {
        if(i%15 == 0){
            return "FizzBuzz";
        } else if (i%3 == 0) {
            return "Fizz";
        } else if (i%5 == 0) {
            return "Buzz";
        } else {
            return ""+ i;
        }
    }
}
