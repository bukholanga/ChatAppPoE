package chatapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== USER REGISTRATION ===");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your username (must contain '_' and be 5 characters max): ");
        String username = scanner.nextLine();

        System.out.print("Enter your password (must be strong): ");
        String password = scanner.nextLine();

        System.out.print("Enter your cell number (start with +27): ");
        String cellPhone = scanner.nextLine();

        Registration user = new Registration(firstName, lastName, username, password, cellPhone);
        String regResult = user.registerUser();
        System.out.println("\n" + regResult);

        if (regResult.contains("Username successfully captured") &&
            regResult.contains("Password successfully captured") &&
            regResult.contains("Cell number successfully captured")) {

            System.out.println("\nRegistration successful! Welcome, " + firstName + " " + lastName + ".");

            System.out.println("\n=== LOGIN ===");
            System.out.print("Enter username: ");
            String loginUser = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            Login login = new Login(user.getUsername(), user.getPassword(), user.getFirstName(), user.getLastName());
            login.loginUser(loginUser, loginPass);
            System.out.println(login.returnLoginStatus());

            // Additional login test with wrong password
            System.out.println("\n=== LOGIN TEST: Wrong Password ===");
            login.loginUser(loginUser, "Wrong123!");
            System.out.println(login.returnLoginStatus());
        }

        scanner.close();
    }
}