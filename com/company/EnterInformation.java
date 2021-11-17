package com.company;

import java.util.Scanner;

public class EnterInformation {
    private String birthday;
    private String secretAsk;
    private String secretAnsver;
    private String email;
    private String lastOrderNumber;
    private String favoriteColour;

    public EnterInformation() {
        System.out.println("Введі ть день народження");
        Scanner input = new Scanner(System.in);
        String birthday = input.nextLine();
        this.birthday = birthday;
        input = new Scanner(System.in);

        System.out.println("Введіть email");
        String email = input.nextLine();
        this.email = email;
        input = new Scanner(System.in);

        System.out.println("Введіть secretAsk");
        String secretAsk = input.nextLine();
        this.secretAsk = secretAsk;
        input = new Scanner(System.in);

        System.out.println("Введіть secretAnsver");
        String secretAnsver = input.nextLine();
        this.secretAsk = secretAnsver;
        input = new Scanner(System.in);

        System.out.println("Введіть lastOrderNumber");
        String lastOrderNumber = input.nextLine();
        this.lastOrderNumber = lastOrderNumber;
        input = new Scanner(System.in);

        System.out.println("Введіть lastOrderNumber");
        String favoriteColour = input.nextLine();
        this.favoriteColour = favoriteColour;
        input = new Scanner(System.in);
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSecretAsk() {
        return secretAsk;
    }

    public String getSecretAnsver() {
        return secretAnsver;
    }

    public String getEmail() {
        return email;
    }

    public String getLastOrderNumber() {
        return lastOrderNumber;
    }

    public String getFavoriteColour() {
        return favoriteColour;
    }
}
