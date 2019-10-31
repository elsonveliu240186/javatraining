package com.javatraining.domain;

public class Credentials extends Authentification implements IAuth {
    private String email;
    private String password;

    @Override
    public String getPass() {
        return this.password;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
