package com.company;

public class Main {

    

    public static int downNumbers(int numberOne, int numberTwo, int numberThree) {
        return numberOne - numberTwo - numberThree;
    }

    public static int dividedNumbers(int numberOne, int numberFour) {
        return numberOne / numberFour;
    }

    public static int downNumbers(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int  multiplyNumbers(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int calculateSum(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
	    System.out.println(downNumbers(3,2));
	    System.out.println(multiplyNumbers(3,5));
	    System.out.println(calculateSum(4,2));
	    System.out.println(dividedNumbers(4,2));
	    System.out.println(downNumbers(4,2,2));
    }
}
