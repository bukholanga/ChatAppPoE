package chatapp;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TEST 1: Valid Registration ===");
        Registration validReg = new Registration("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        String regResult = validReg.registerUser();
        System.out.println(regResult);

        // Only log in if registration is fully successful
        if (regResult.contains("Username successfully captured") &&
            regResult.contains("Password successfully captured") &&
            regResult.contains("Cell number successfully captured")) {

            Login validLogin = new Login(validReg.getUsername(), validReg.getPassword(), validReg.getFirstName(), validReg.getLastName());
            validLogin.loginUser("kyl_1", "Ch&&sec@ke99!");
            System.out.println(validReg.registerUser());
            System.out.println("Registration successful! Welcome, " + validReg.getFirstName() + " " + validReg.getLastName() + ".");

        }

        System.out.println("\n=== TEST 2: Invalid Login (Wrong Password) ===");
        Login loginAttempt = new Login(validReg.getUsername(), validReg.getPassword(), validReg.getFirstName(), validReg.getLastName());
        loginAttempt.loginUser("kyl_1", "wrongPassword");
        System.out.println(loginAttempt.returnLoginStatus());

        System.out.println("\n=== TEST 3: Invalid Registration (Bad Username) ===");
        Registration badUsernameReg = new Registration("Amy", "Lee", "amy", "Ch&&sec@ke99!", "+27838968976");
        System.out.println(badUsernameReg.registerUser());

        System.out.println("\n=== TEST 4: Invalid Registration (Weak Password) ===");
        Registration badPasswordReg = new Registration("Tom", "Brown", "tom_1", "1234", "+27838968976");
        System.out.println(badPasswordReg.registerUser());

        System.out.println("\n=== TEST 5: Invalid Registration (Bad Cell Number) ===");
        Registration badCellReg = new Registration("Luna", "Ray", "lun_1", "Ch&&sec@ke99!", "0841234567");
        System.out.println(badCellReg.registerUser());
    }
}
