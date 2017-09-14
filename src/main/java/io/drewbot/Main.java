package io.drewbot;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("My project runs");
        String firstInput = input("What is your first number?");
        String secondInput = input("What is your second number?");

        double output = getDivisionResult(firstInput, secondInput);
        System.out.println(output);
    }

    public static double getDivisionResult(String firstInput, String secondInput) {
        return Double.parseDouble(firstInput) / Double.parseDouble(secondInput);
    }

    public static String input(String prompt) {
        System.out.println(prompt);
        String output = scanner.nextLine();
        return output;
    }
}
