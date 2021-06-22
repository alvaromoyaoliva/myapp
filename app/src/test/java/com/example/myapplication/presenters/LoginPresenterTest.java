package com.example.myapplication.presenters;

import com.example.myapplication.views.ILoginView;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class LoginPresenterTest {
    @Mock
    ILoginView loginView;
    @InjectMocks
    LoginPresenter loginPresenter;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLogin() throws Exception {
        loginPresenter.login("username", "password");
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme