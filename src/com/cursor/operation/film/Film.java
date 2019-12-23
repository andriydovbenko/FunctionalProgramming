package com.cursor.operation.film;

public class Film {
    private double ticketPrice;
    private String genre;

    public Film(String[] genreAndPrice) {
        this.genre = genreAndPrice[0];
        this.ticketPrice = Double.parseDouble(genreAndPrice[1]);
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getGenre() {
        return genre;
    }
}