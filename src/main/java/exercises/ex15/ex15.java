package exercises.ex15;
import java.util.Scanner;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erik Dokken
 */
public class ex15 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        ex15 example15 = new ex15();

        String passInput = example15.passwordInput();
        String passwordCheck = example15.passwordCheck(passInput);

        //Output
        example15.printOutput(passwordCheck);
    }

    private void printOutput(String passwordCheck) {
        System.out.print(passwordCheck);
    }

    private String passwordCheck(String passInput) {
        if(passInput.equals("adc$123"))
        {
            return "Welcome!";
        } else {
            return "I don't know you.";
        }
    }

    private String passwordInput() {
        System.out.print("What is the password? ");
        String password = in.nextLine();
        return password;
    }
}
