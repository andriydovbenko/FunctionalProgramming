package com.cursor.operation.lambda;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeNumber {

    public boolean isPrime(int number) {
        IntPredicate isPrimeOrNot = num -> number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
        return isPrimeOrNot.test(number);
    }
}