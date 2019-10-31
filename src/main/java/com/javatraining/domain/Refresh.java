package com.javatraining.domain;

public class Refresh extends Authentification implements IAuth {
    private String password;
    private String email;

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
