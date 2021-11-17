package com.company;

import java.util.Scanner;

public class EnterLoginPassword {
    public String enterLogin;
    public String enterPassword;

    public EnterLoginPassword() {
        System.out.println("Введ іть логін");
        Scanner input = new Scanner(System.in);
        String enterLogin = input.nextLine();
        this.enterLogin = enterLogin;
        System.out.println("Введіть пароль");
        Scanner in = new Scanner(System.in);
        String enterPassword = in.nextLine();
        this.enterPassword = enterPassword;
    }

      public String getEnterLogin() {
        return enterLogin;
    }

    public String getEnterPassword() {
        return enterPassword;
    }
}




