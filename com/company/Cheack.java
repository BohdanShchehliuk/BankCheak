package com.company;

public class Cheack {

    public static int cheack () {
        int sum =0;
        System.out.println("You typed wrong login or password. Try to recovery access");
        UserLoginPassword userLoginPassword = new UserLoginPassword();
        EnterLoginPassword enterLoginPassword = new EnterLoginPassword();
        UserInformation userInformation = new UserInformation();
        EnterInformation enterInformation = new EnterInformation();

        if (userLoginPassword.getLoginRegistration().equals(enterLoginPassword.getEnterLogin())) {
            sum = sum +50;
        };
            if (userLoginPassword.getPassword().equals(enterLoginPassword.getEnterPassword())) {
                sum = sum +50;
            }
        if (userInformation.getBirthday().equals(enterInformation.getBirthday())) {
            sum = sum +10;
        }
        if (userInformation.getEmail().equals(enterInformation.getEmail())) {
            sum = sum +10;
        }
        if (userInformation.getSecretAnsver().equals(enterInformation.getSecretAsk())) {
            sum = sum +20;
        } if (userInformation.getSecretAnsver().equals(enterInformation.getSecretAsk())) {
            sum = sum +20;
        }
        if (userInformation.getSecretAnsver().equals(enterInformation.getSecretAnsver())) {
            sum = sum +10;
        }
        if (userInformation.getEmail().equals(enterInformation.getEmail())) {
            sum = sum +10;
        }
        if (userInformation.getFavoriteColour().equals(enterInformation.getFavoriteColour())) {
            sum = sum +10;
        }
        System.out.printf("Your number is %d .", sum);
        return sum;
    }
}
