package com.codedifferently;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
       String evenNumber = "";
       for(int i = start; i < stop; i++){
           if(i % 2 == 0){
               evenNumber += i;
           }
       }

        return evenNumber;
    }

    public static String getOddNumbers(int start, int stop) {
        String oddNumber = "";
        for(int i = start; i < stop; i+=2){
            if(i % 2 != 2){
                oddNumber += i;
            }
        }
        return oddNumber;
    }

    public static String getSquareNumbers(int start, int stop, int step) {
        String squareNum = "";
        for(int i = start; i < stop; i += step){
            squareNum += (i * i);
        }
        return squareNum;
    }

    public static String getRange(int stop) {
        String rangeStart = "";
        for(int i = 0; i < stop; i++){
            rangeStart += i;
        }
        return rangeStart;
    }

    public static String getRange(int start, int stop) {
        String rangeStartStop = "";
        for(int i = start; i < stop; i++){
            rangeStartStop += i;
        }
        return rangeStartStop;
    }

    public static String getRange(int start, int stop, int step) {
        String rangeStep = "";
        for(int i = start; i < stop; i += step){
            rangeStep += i;
        }
        return rangeStep;
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String expNum = "";
        for(int i = start; i < stop; i += step){
            expNum += (int)Math.pow(i, exponent) + "";
        }
        return expNum;
    }
}
