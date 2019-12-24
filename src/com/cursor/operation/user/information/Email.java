package com.cursor.operation.user.information;

public enum Email {
    PETRO("petro@gmail.com"),
    BARON("baron@gmail.com"),
    AGATA("agata@gmail.com"),
    BARTEK("bartek@gmail.com"),
    BOGDAN("bogdan@gmail.com"),
    DAN("dan164@gmail.com"),
    MICOLAJ("micolaj@gmail.com");

    private String email;

    Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}