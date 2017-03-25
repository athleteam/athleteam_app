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

public class CreateGame extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_game);

        final Intent transferLocation = new Intent(getApplicationContext(), ActivityList.class);
        final Intent transferDate = new Intent(getApplicationContext(), ActivityList.class);
        final Intent transferTime = new Intent(getApplicationContext(), ActivityList.class);
        final Intent transferDescription = new Intent(getApplicationContext(), ActivityList.class);
        final Intent transferSkill = new Intent(getApplicationContext(), ActivityList.class);
        final Intent transferAge = new Intent(getApplicationContext(), ActivityList.class);


        Button submit = (Button) findViewById(R.id.button7);
        submit.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {

                EditText inputLocation = (EditText) findViewById(R.id.editText3);
                EditText inputDate = (EditText) findViewById(R.id.editText9);
                EditText inputTime = (EditText) findViewById(R.id.editText8);
                EditText inputDescription = (EditText) findViewById(R.id.editText7);
                EditText inputSkill = (EditText) findViewById(R.id.editText6);
                EditText inputAge = (EditText) findViewById(R.id.editText5);
                String locat = inputLocation.getText().toString();
                String date = inputDate.getText().toString();
                String time = inputTime.getText().toString();
                String desc = inputDescription.getText().toString();
                String skill = inputSkill.getText().toString();
                String age = inputAge.getText().toString();

                transferLocation.putExtra("location", locat);
                startActivity(transferLocation);
                transferDate.putExtra("date", date);
                startActivity(transferDate);
                transferTime.putExtra("time", time);
                startActivity(transferTime);
                transferDescription.putExtra("description", desc);
                startActivity(transferDescription);
                transferSkill.putExtra("skill", skill);
                startActivity(transferSkill);
                transferAge.putExtra("age", age);
                startActivity(transferAge);

                Intent myIntent = new Intent(view.getContext(), ActivityList.class);
                startActivityForResult(myIntent, 0);

            }
        });
    }
}
