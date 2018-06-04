package com.example.spy.hci1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.gc.materialdesign.widgets.Dialog;

public class TestActivity12 extends AppCompatActivity {

    private ImageButton btnNext, btnBack, btnHome;
    private Button btnCheck;
    private EditText inputEd;
    private LinearLayout hiddenlayout;
    private RelativeLayout mainLayout;
    public int num2;
    public  int num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test12);

        btnBack = (ImageButton)findViewById(R.id.backBtn12);
        btnHome = (ImageButton)findViewById(R.id.homeBtn12);
        btnNext = (ImageButton)findViewById(R.id.nextBtn12);

        btnCheck = (Button)findViewById(R.id.checkBtn12);
        inputEd = (EditText) findViewById(R.id.input12);
        hiddenlayout = (LinearLayout)findViewById(R.id.showLayout12);
        mainLayout = (RelativeLayout)findViewById(R.id.mainLayout12);
        Bundle extras = getIntent().getExtras();
        if (extras != null) { num = extras.getInt("num"); }
        else { num=9; }
       // Integer.parseInt(num2.toString());


        //num = Integer.decode(num2);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity12.this,TestActivity8.class));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Test_Activity15.class);
                i.putExtra("num", num);
//startActivity(i);
                startActivityForResult(i,0);
                //startActivity(new Intent(TestActivity8.this,TestActivity12.class));
               // startActivity(new Intent(TestActivity12.this,Test_Activity15.class));
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TestActivity12.this,MainActivity.class));
            }
        });
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputstr = inputEd.getText().toString();

                if (inputstr.equals("12"))
                {
                    Dialog dialog = new Dialog(TestActivity12.this,"Congratz", "You have identified correctly");
                    dialog.show();
                    Toast.makeText(TestActivity12.this,"Correct Answer",Toast.LENGTH_SHORT).show();
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
