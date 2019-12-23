package com.cursor.operation.enums;

public enum Films {

    THUNDERBALL("Action", "20.20"),
    SPECTRE("Action", "18.60"),
    DIAMONDS("Action", "22.55"),
    TWICE("Action", "16.30"),
    SLAPSTICK("Comedy", "23.30"),
    ACEVENTURA("Comedy", "16.25"),
    MADWORLD("Comedy", "24.80"),
    THEMASK("Comedy", "21.70"),
    MERTOPOLIS("Fantasy", "19.60"),
    WIZARD("Fantasy", "15.20"),
    HORIZONT("Fantasy", "16.60"),
    KINGKONG("Fantasy", "17.80"),
    UNFORGIVEN("Western", "18.44"),
    LITTLEMAN("Western", "19.88"),
    HUD("Western", "17.55"),
    PURSUED("Western", "14.50");

    private String[] genreAndPrice;

    Films(String genre, String price) {
        this.genreAndPrice = new String[]{genre, price};
    }

    public String[] getGenreAndPrice() {
        return genreAndPrice;
    }
}