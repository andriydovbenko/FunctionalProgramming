package com.cursor.operation.users;

import com.cursor.operation.enums.Email;
import com.cursor.operation.enums.Team;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class UsersData {
    private final int YEAR = 2019;
    private final int MONTH = 12;
    private final int DAY = 14;
    private List<User> userList = new ArrayList<>();

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
        Map<String, List<User>> listf = userList.stream()
                .filter(login -> login.getLoginDate().getDayOfMonth() >= (DAY - 7))
                .collect(Collectors.groupingBy(User::getTeam));
        listf.forEach((key, value) -> {
            System.out.println("\nTeam: " + key);
            System.out.print("emails:\n");
            value.forEach(User -> System.out.println(User.getEmail()));
        });
    }
}