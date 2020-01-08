package com.qa.numbers;

public class NumberCruncher {
    int findHighestNumber(int[] input){
        if(input[0]>input[1]){
            return input[0];
        }
        else{
            return input[1];
        }
    }
}
