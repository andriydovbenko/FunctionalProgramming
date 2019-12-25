package com.cursor.operation.user;

import com.cursor.operation.user.information.personal.Email;
import com.cursor.operation.user.information.general.Team;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class UsersData {
    private final int YEAR = 2019;
    private final int MONTH = 12;
    private final int DAY = 14;
    private List<User> userList = new ArrayList<>();
    private Map<String, List<User>> usersGroupedByTeam;

    public UsersData() {
        createListOfUsers();
    }

    public void createListOfUsers() {
        userList.add(new User(Email.PETRO.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_LAD.getTeam()));
        userList.add(new User(Email.BARON.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_RAB.getTeam()));
        userList.add(new User(Email.AGATA.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_RIM.getTeam()));
        userList.add(new User(Email.BARTEK.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_LAD.getTeam()));
        userList.add(new User(Email.BOGDAN.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_RAB.getTeam()));
        userList.add(new User(Email.DAN.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_RIM.getTeam()));
        userList.add(new User(Email.MICOLAJ.getEmail(),
                LocalDate.of(YEAR, MONTH, new Random().nextInt(DAY) + 1), Team.TEAM_LAD.getTeam()));
    }

    public void showAllUsers() {
        System.out.println("\nUser's list:");
        userList.forEach(x -> System.out.println("email: " + x.getEmail() +
                " team: " + x.getTeam() + " last logged: " + x.getLoginDate()));
    }

    public void filterUsers() {
        System.out.println("\nEmails of user who logged less than week age grouped by team:");
        this.usersGroupedByTeam = userList.stream()
                .filter(login -> login.getLoginDate().getDayOfMonth() >= (DAY - 7))
                .collect(Collectors.groupingBy(User::getTeam));
        showUsersGroupedByTeam();
    }

    private void showUsersGroupedByTeam() {
        usersGroupedByTeam.forEach((key, value) -> {
            System.out.println("\nTeam: " + key);
            System.out.print("emails:\n");
            value.forEach(User -> System.out.println(User.getEmail()));
        });
    }
}