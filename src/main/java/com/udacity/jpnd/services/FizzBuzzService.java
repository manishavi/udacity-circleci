package com.udacity.jpnd.services;

public class FizzBuzzService
{
    public String fizzBuzz(int i) {
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
