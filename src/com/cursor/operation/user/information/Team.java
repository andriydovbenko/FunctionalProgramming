package com.cursor.operation.user.information;

public enum Team {

    TEAM_RAB("Research and development"),
    TEAM_LAD("Learning and development"),
    TEAM_RIM("Remote infrastructure management");

    private String team;

    Team(String team) {
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}