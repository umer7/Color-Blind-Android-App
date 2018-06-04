package com.example.spy.hci1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.gc.materialdesign.widgets.Dialog;

import com.gc.materialdesign.views.ButtonRectangle;


public class test1 extends AppCompatActivity {
    public Button ex;
    public ImageButton home;
    public  RadioGroup option1;
    private RadioButton optionButton;
    public int num=10;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
       // public ButtonRectangle ex;

        ex =(Button) findViewById(R.id.button);
        home =(ImageButton) findViewById(R.id.imageButton);
        option1=(RadioGroup) findViewById(R.id.radioButton);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });


        ex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int selectedId = option1.getCheckedRadioButtonId();
                optionButton = (RadioButton) findViewById(selectedId);
                String optxt= (String) optionButton.getText();
//change here wtr number
if (optxt.equals("Number 07"))
{
    Dialog dialog = new Dialog(test1.this, "Verified","Those with normal vison can see this"  );
    dialog.show();
}
else
{
    Dialog dialog = new Dialog(test1.this, "Warning","The Majority of color blind people can not see this  number carefully"  );
    dialog.show();
}


            }
        });


    }
}
