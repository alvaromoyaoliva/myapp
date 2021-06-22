package com.example.myapplication.presenters;

import com.example.myapplication.views.ILoginView;

import static java.lang.Boolean.TRUE;

public class LoginPresenter implements ILoginPresenter{

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void login (String username, String password) {
        boolean loginsuccess = TRUE;
        if(loginsuccess)
            loginView.loginresult("Login exitoso");
        else
            loginView.loginresult("Error, intente nuevamente");
    }
}
