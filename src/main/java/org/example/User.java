package org.example;

public class User {

    private final String login;
    private final String email;

    public User() {
        this.login = "login";
        this.email = "mail@mail.mail";
    }

    public User(String login, String email) {
        this.login = login;
        this.email = email;
    }

    public boolean isValid(){
        return this.login != null
                && !this.login.isEmpty()
                && this.email != null
                && !this.email.isEmpty()
                && this.email.contains("@")
                && this.email.contains(".")
                && !this.login.equals(this.email);

    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }
}
