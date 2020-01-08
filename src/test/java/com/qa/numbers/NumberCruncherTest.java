package com.qa.numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NumberCruncherTest {
    @Test
    public void find_highest_number_in_array_of_one(){
        //arrange
        int input[] = {3};
        int expResult =3;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expResult, result);
    }
    @Test
    public void find_highest_number_in_array_of_two(){
        //arrange
        int input[] = {13,4};
        int expResult = 13;
        NumberCruncher cut = new NumberCruncher();

        //act
        int result = cut.findHighestNumber(input);

        //assert
        assertEquals(expResult, result);
    }

}
