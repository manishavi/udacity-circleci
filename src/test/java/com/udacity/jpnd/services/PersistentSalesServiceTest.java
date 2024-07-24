package com.udacity.jpnd.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PersistentSalesServiceTest {
    @Mock
    private SalesRepository salesRepository;
    private PersistentSalesService persistentSalesService;

    @BeforeEach
    void init(){
        persistentSalesService =new PersistentSalesService(salesRepository);
    }

    @RepeatedTest(15)
//    @Test
    void persistentSalesService_fizzBuzz_saveToDatabase(RepetitionInfo repetitionInfo) {
        int i = repetitionInfo.getCurrentRepetition();
        String result = persistentSalesService.fizzBuzz(i);

//        //check for specific value
        verify(salesRepository).saveResults(i, result);
//
//        //checks that any string is saved for the current integer
//        verify(salesRepository).saveResults(i, anyString());
            //fail if saveResults not called exactly 2 times
//            verify(salesRepository, times(2)).saveResults(i, anyString());

    //fail if saveResults called more than 10 times
//            verify(salesRepository, atMost(10)).saveResults(i, anyString());

    //fail if saveResults not called 3 or more times
//            verify(salesRepository, atLeast(3)).saveResults(i, anyString());

    }
}