package com.cursor.operation;

import com.cursor.operation.lambda.PrimeNumber;
import com.cursor.operation.users.UsersData;

public class Execution {
    public void start() {
        int numberFirst = 1;
        int numberSecond = 61;
        int numberThird = -5;
        System.out.println("Number: " + numberFirst + " is prime? =" + new PrimeNumber().isPrime(numberFirst));
        System.out.println("Number: " + numberSecond + " is prime? =" + new PrimeNumber().isPrime(numberSecond));
        System.out.println("Number: " + numberThird + " is prime? =" + new PrimeNumber().isPrime(numberThird));

        UsersData usersData = new UsersData();
        usersData.showAllUsers();
        usersData.filterUser();
    }
}
