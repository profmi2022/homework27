package org.example;

public class User {

    private final String login;
    private final String email;

    public User() {
        this.login = "login";
        this.email = "mail@mail.mail";
    }

    public User(String login, String email) {
        if(isValid(login, email)) {
            this.login = login;
            this.email = email;
        }else {
            throw new IllegalArgumentException();
        }
    }

    private static boolean isValid(String login, String email){
        return login != null
                && !login.isEmpty()
                && email != null
                && email.contains("@")
                && email.contains(".")
                && !login.equals(email);
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
