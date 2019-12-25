package com.cursor.operation.prime;

public class SquareRootAuditor {

    public static void findSquareRoot() {
        SquareRoot squareRoot = Math::sqrt;
        int number = 25;
        System.out.println("Square root from " + number + " = " + squareRoot.findSquareRoot(number));
    }
}