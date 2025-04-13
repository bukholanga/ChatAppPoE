package chatapp;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST 1: Valid Registration ===");
        Registration validReg = new Registration("Kyle", "Smith", "kyl_1", "Ch&&sec@ke99!", "+27838968976");
        System.out.println(validReg.registerUser());

        Login validLogin = new Login(validReg.getUsername(), validReg.getPassword(), validReg.getFirstName(), validReg.getLastName());
        validLogin.loginUser("kyl_1", "Ch&&sec@ke99!");
        System.out.println(validLogin.returnLoginStatus());

        System.out.println("\n=== TEST 2: Invalid Login (Wrong Password) ===");
        validLogin.loginUser("kyl_1", "wrongPassword");
        System.out.println(validLogin.returnLoginStatus());

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
