package com.company;

public class UserInformation {

    private String birthday = "23.12.1989"; //10%  birthday - ДЕНЬ НАРОДЖЕННЯ
    private String secretAsk = "Зріст"; //20%  secretAsk - СЕКРЕТНЕ ЗАПИТАННЯ
    private String secretAnsver = "189"; //20% secretAnsver - ВІДПОВІДЬ
    private String email = "vova@gmail.com"; //10%  email - ПОШТА
    private String lastOrderNumber = "1256"; //10%  lastOrderNumber - ОСТАННЄ ЗАМОВЛЕННЯ
    private String favoriteColour = "red"; //10% favoriteColour - ОЛЮБЛЕНИЙ КОЛІР


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
