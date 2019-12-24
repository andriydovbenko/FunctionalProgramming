package com.cursor.operation.film;

import com.cursor.operation.film.list.Films;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilmsCollection {
    private List<Film> filmsToday = new ArrayList<>();
    private List<Film> filmsTomorrow = new ArrayList<>();
    private Map<String, List<Film>> groupedMapOfFilmsByGenre;

    public FilmsCollection() {
        createCollection();
    }

    private void createCollection() {
        filmsToday.add(new Film(Films.THUNDERBALL.getGenreAndPrice()));
        filmsToday.add(new Film(Films.SPECTRE.getGenreAndPrice()));
        filmsToday.add(new Film(Films.SLAPSTICK.getGenreAndPrice()));
        filmsToday.add(new Film(Films.ACEVENTURA.getGenreAndPrice()));
        filmsToday.add(new Film(Films.MERTOPOLIS.getGenreAndPrice()));
        filmsToday.add(new Film(Films.WIZARD.getGenreAndPrice()));
        filmsToday.add(new Film(Films.UNFORGIVEN.getGenreAndPrice()));
        filmsToday.add(new Film(Films.LITTLEMAN.getGenreAndPrice()));

        filmsTomorrow.add(new Film(Films.DIAMONDS.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.TWICE.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.MADWORLD.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.THEMASK.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.HORIZONT.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.KINGKONG.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.HUD.getGenreAndPrice()));
        filmsTomorrow.add(new Film(Films.PURSUED.getGenreAndPrice()));
    }

    public void findAveragePriceByGenre() {
        this.groupedMapOfFilmsByGenre = Stream.concat(filmsToday.stream(), filmsTomorrow.stream()).
                collect(Collectors.groupingBy(Film::getGenre));
        showAveragePriceByPrice();
    }

    private void showAveragePriceByPrice() {
        groupedMapOfFilmsByGenre.forEach((key, value) -> {
            System.out.println("\nFilms genre: " + key);
            System.out.println("Average ticket's price =");
            System.out.println(value.stream()
                    .mapToDouble(Film::getTicketPrice)
                    .average().orElse(0));
            System.out.println("amount: " + value.size());
        });
    }
}