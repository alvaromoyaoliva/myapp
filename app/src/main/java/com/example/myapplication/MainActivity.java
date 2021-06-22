package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.myapplication.presenters.ILoginPresenter;
import com.example.myapplication.presenters.LoginPresenter;
import com.example.myapplication.views.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText username;
    private EditText password;
    private Button login;
    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.usernametext);
        password = findViewById(R.id.passwordtext);
        login = findViewById(R.id.botonlogin);
        loginPresenter = new LoginPresenter(this);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.login(username.getText().toString(),password.getText().toString());
            }
        });
    }


    @Override
    public void loginresult(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
    }
}