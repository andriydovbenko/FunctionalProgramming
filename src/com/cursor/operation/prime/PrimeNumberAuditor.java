package com.cursor.operation.prime;

import java.util.stream.IntStream;

public class PrimeNumberAuditor {

    public void checkNumber(int number) {
        PrimeNumber isPrimeOrNot = num -> number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
        System.out.println("The number: " + number + " is prime? = " + isPrimeOrNot.isPrime(number));
    }
}