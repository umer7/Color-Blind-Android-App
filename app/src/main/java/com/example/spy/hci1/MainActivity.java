package com.example.spy.hci1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.gc.materialdesign.views.ButtonRectangle;

public class MainActivity extends AppCompatActivity {
public ButtonRectangle test1;
    public ButtonRectangle ex;
    public ButtonRectangle ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test1 =(ButtonRectangle) findViewById(R.id.test);
        test1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,TestActivity8.class);
                startActivity(i);

            }
        });

        ex =(ButtonRectangle) findViewById(R.id.Exercise);
        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),exercise.class);
                startActivity(i);

            }
        });

        ab =(ButtonRectangle) findViewById(R.id.about);
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),About.class);
                startActivity(i);

            }
        });
    }
}
