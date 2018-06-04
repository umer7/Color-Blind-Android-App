package com.example.spy.hci1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.gc.materialdesign.widgets.Dialog;

public class TestActivity8 extends AppCompatActivity {

    private ImageButton btnNext, btnBack, btnHome;
    private Button btnCheck;
    private EditText inputEd;
    private LinearLayout hiddenlayout;
    private RelativeLayout mainLayout;
    public  int num=10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test8);

        btnBack = (ImageButton)findViewById(R.id.backBtn8);
        btnHome = (ImageButton)findViewById(R.id.homeBtn8);
        btnNext = (ImageButton)findViewById(R.id.nextBtn8);

        btnCheck = (Button)findViewById(R.id.checkBtn8);
        inputEd = (EditText) findViewById(R.id.input8);
        hiddenlayout = (LinearLayout)findViewById(R.id.showLayout8);
        mainLayout = (RelativeLayout)findViewById(R.id.mainLayout8);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity8.this,MainActivity.class));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),TestActivity12.class);
                i.putExtra("num", num);
//startActivity(i);
                startActivityForResult(i,0);
                //startActivity(new Intent(TestActivity8.this,TestActivity12.class));
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity8.this,MainActivity.class));
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputstr = inputEd.getText().toString();

                if (inputstr.equals("8"))
                {
                    Dialog dialog = new Dialog( TestActivity8.this,"Congratz", "You have identified correctly");
                    dialog.show();
                    Toast.makeText(TestActivity8.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    num=num-1;
                    mainLayout.setVisibility(View.INVISIBLE);
                    hiddenlayout.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
