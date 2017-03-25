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

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent transferSport = new Intent(getApplicationContext(), ActivityList.class);

        Button frisbee = (Button) findViewById(R.id.button2);
        frisbee.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent myIntent = new Intent(view.getContext(), AddOrSee.class);
                startActivityForResult(myIntent, 0);
                transferSport.putExtra("sport", "frisbee");
                startActivity(transferSport);
            }
        });

        Button soccer = (Button) findViewById(R.id.button4);
        soccer.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent myIntent = new Intent(view.getContext(), AddOrSee.class);
                startActivityForResult(myIntent, 0);
                transferSport.putExtra("sport", "soccer");
                startActivity(transferSport);
            }
        });

        Button basketball = (Button) findViewById(R.id.button3);
        basketball.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent myIntent = new Intent(view.getContext(), AddOrSee.class);
                startActivityForResult(myIntent, 0);
                transferSport.putExtra("sport", "basketball");
                startActivity(transferSport);
            }
        });
    }
}
