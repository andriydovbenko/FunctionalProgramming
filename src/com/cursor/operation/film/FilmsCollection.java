package com.cursor.operation.film;

import com.cursor.operation.film.list.Film;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmsCollection {
    private List<com.cursor.operation.film.Film> filmsToday = new ArrayList<>();
    private List<com.cursor.operation.film.Film> filmsTomorrow = new ArrayList<>();

    public FilmsCollection() {
        createCollection();
    }

    private void createCollection() {
        filmsToday.add(new com.cursor.operation.film.Film(Film.THUNDERBALL.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.SPECTRE.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.SLAPSTICK.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.ACEVENTURA.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.MERTOPOLIS.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.WIZARD.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.UNFORGIVEN.getGenreAndPrice()));
        filmsToday.add(new com.cursor.operation.film.Film(Film.LITTLEMAN.getGenreAndPrice()));

        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.DIAMONDS.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.TWICE.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.MADWORLD.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.THEMASK.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.HORIZONT.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.KINGKONG.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.HUD.getGenreAndPrice()));
        filmsTomorrow.add(new com.cursor.operation.film.Film(Film.PURSUED.getGenreAndPrice()));
    }

    public void findAveragePriceByGenre() {
        Stream.concat(filmsToday.stream(), filmsTomorrow.stream()).
                collect(Collectors.groupingBy(com.cursor.operation.film.Film::getGenre))
                .forEach(this::showAveragePriceByPrice);
    }

    private void showAveragePriceByPrice(String key, List<com.cursor.operation.film.Film> value) {
        System.out.println("\nFilms genre: " + key);
        System.out.println("Average ticket's price =");
        System.out.println(value.stream()
                .mapToDouble(com.cursor.operation.film.Film::getTicketPrice)
                .average().orElse(0));
        System.out.println("amount: " + value.size());
    }
}