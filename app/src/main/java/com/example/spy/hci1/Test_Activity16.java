package com.example.spy.hci1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.gc.materialdesign.widgets.Dialog;

public class Test_Activity16 extends AppCompatActivity {

    private ImageButton btnNext, btnBack, btnHome;
    private Button btnCheck;
    private EditText inputEd;
    private LinearLayout hiddenlayout;
    private RelativeLayout mainLayout;
    public String num2;
    public  int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_16);

        Bundle extras = getIntent().getExtras();
        if (extras != null) { num = extras.getInt("num"); }
        else { num=9; }

        btnBack = (ImageButton)findViewById(R.id.backBtn15);
        btnHome = (ImageButton)findViewById(R.id.homeBtn15);
        btnNext = (ImageButton)findViewById(R.id.nextBtn15);
        mainLayout = (RelativeLayout)findViewById(R.id.mainLayout15);

        btnCheck = (Button)findViewById(R.id.checkBtn15);
        inputEd = (EditText) findViewById(R.id.input15);
        hiddenlayout = (LinearLayout)findViewById(R.id.showLayout15);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test_Activity16.this,Test_Activity15.class));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Test_Activity17.class);
                i.putExtra("num", num);
//startActivity(i);
                startActivityForResult(i,0);
                //startActivity(new Intent(Test_Activity16.this,Test_Activity17.class));
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test_Activity16.this,MainActivity.class));
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputstr = inputEd.getText().toString();

                if (inputstr.equals("16"))
                {
                    Dialog dialog = new Dialog( Test_Activity16.this,"Congratz", "You have identified correctly");
                    dialog.show();
                    Toast.makeText(Test_Activity16.this,"Correct Answer",Toast.LENGTH_SHORT).show();
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
