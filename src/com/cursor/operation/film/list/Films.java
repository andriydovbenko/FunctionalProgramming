package com.cursor.operation.film.list;

public enum Films {

    THUNDERBALL("Action", "20.20"),
    SPECTRE("Action", "18.60"),
    DIAMONDS("Action", "22.50"),
    TWICE("Action", "16.30"),
    SLAPSTICK("Comedy", "23.30"),
    ACEVENTURA("Comedy", "16.20"),
    MADWORLD("Comedy", "24.80"),
    THEMASK("Comedy", "21.70"),
    MERTOPOLIS("Fantasy", "19.60"),
    WIZARD("Fantasy", "15.20"),
    HORIZONT("Fantasy", "16.60"),
    KINGKONG("Fantasy", "17.80"),
    UNFORGIVEN("Western", "18.40"),
    LITTLEMAN("Western", "19.80"),
    HUD("Western", "17.50"),
    PURSUED("Western", "14.50");

    private String[] genreAndPrice;

    Films(String genre, String price) {
        this.genreAndPrice = new String[]{genre, price};
    }

    public String[] getGenreAndPrice() {
        return genreAndPrice;
    }
}