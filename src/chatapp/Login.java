package chatapp;

public class Login {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private boolean isLoggedIn = false;

    public Login(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean loginUser(String inputUsername, String inputPassword) {
        if (this.username.equals(inputUsername) && this.password.equals(inputPassword)) {
            isLoggedIn = true;
            return true;
        }
        return false;
    }

    public String returnLoginStatus() {
        if (isLoggedIn) {
            return "Welcome " + firstName + " " + lastName + " It is great to see you again.";
        }
        return "Username or password incorrect, please try again.";
    }
}
