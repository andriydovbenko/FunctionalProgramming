package com.cursor.operation;

import com.cursor.operation.film.FilmsCollection;
import com.cursor.operation.prime.PrimeNumberAuditor;
import com.cursor.operation.user.UsersData;

public class Execution {

    public void start() {
        new PrimeNumberAuditor().checkNumber(1);
        new PrimeNumberAuditor().checkNumber(5);
        new PrimeNumberAuditor().checkNumber(-10);

        UsersData usersData = new UsersData();
        usersData.showAllUsers();
        usersData.filterUsers();

        FilmsCollection filmsCollection = new FilmsCollection();
        filmsCollection.findAveragePriceByGenre();
    }
}