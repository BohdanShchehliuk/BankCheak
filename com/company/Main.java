package com.company;

public class Main {

    public static void main(String[] args) {
        UserLoginPassword userLoginPassword = new UserLoginPassword();
        EnterLoginPassword enterLoginPassword = new EnterLoginPassword();
        if (userLoginPassword.getLoginRegistration().equals(enterLoginPassword.getEnterLogin()) &&
                userLoginPassword.getPassword().equals(enterLoginPassword.getEnterPassword())) {
            System.out.println("Welcome");
        } else {

            if (Cheack.cheack()>100) {
                System.out.println("Welcome");
            } else {
                System.out.println("Sorry. Enter is forbiden");
            }
        }


        // write your code here
    }
}
