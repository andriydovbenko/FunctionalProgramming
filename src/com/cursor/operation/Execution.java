package com.cursor.operation;

import com.cursor.operation.film.FilmsCollection;
import com.cursor.operation.prime.SquareRootAuditor;
import com.cursor.operation.user.UsersData;

public class Execution {

    public void start() {
        SquareRootAuditor.findSquareRoot();

        UsersData usersData = new UsersData();
        usersData.showAllUsers();
        usersData.filterUsers();

        FilmsCollection filmsCollection = new FilmsCollection();
        filmsCollection.findAveragePriceByGenre();
    }
}