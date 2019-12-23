package com.cursor.operation.film;

public class Film {
    private float ticketPrice;
    private String genre;

    public Film(float ticketPrice, String genre) {
        this.ticketPrice = ticketPrice;
        this.genre = genre;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public String getGenre() {
        return genre;
    }
}