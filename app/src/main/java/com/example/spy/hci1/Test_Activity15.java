package com.example.spy.hci1;

import android.content.Context;
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

public class Test_Activity15 extends AppCompatActivity {

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
        setContentView(R.layout.activity_test_15);
        Bundle extras = getIntent().getExtras();
        if (extras != null) { num = extras.getInt("num"); }
        else { num=9; }
        //num = Integer.decode(num2);
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
                startActivity(new Intent(Test_Activity15.this,TestActivity12.class));
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Test_Activity16.class);
                i.putExtra("num", num);
//startActivity(i);
                startActivityForResult(i,0);
               // startActivity(new Intent(Test_Activity15.this,Test_Activity16.class));
            }
        });
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Test_Activity15.this,MainActivity.class));
            }
        });
        //Dialog dialog = new Dialog(Context context,"hello", "Hello");
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputstr = inputEd.getText().toString();

                if (inputstr.equals("15"))
                {
                    Dialog dialog = new Dialog( Test_Activity15.this,"Congratz", "You have identified correctly");
                    dialog.show();
                    Toast.makeText(Test_Activity15.this,"Correct Answer",Toast.LENGTH_SHORT).show();
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
