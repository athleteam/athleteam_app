package com.example.stemm_.athleteam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.button6);
        login.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                EditText inputPass = (EditText) findViewById(R.id.editText);
                EditText inputUser = (EditText) findViewById(R.id.editText2);
                String pass = inputPass.getText().toString();
                String user = inputUser.getText().toString();
                if (user.equals("root") && pass.equals("toor")) {
                    Intent myIntent = new Intent(view.getContext(), MainActivity.class);
                    startActivityForResult(myIntent, 0);
                }
                else
                {
                    inputPass.setText("");
                    inputUser.setText("");
                }
            }
        });
    }
}
