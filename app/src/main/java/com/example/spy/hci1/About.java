package com.example.spy.hci1;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.gc.materialdesign.views.ButtonRectangle;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class About extends AppCompatActivity {
    public Button but;
    public PieChart pieChart;
    public String num2;
    public TextView txt1;
    public  int num;
    public double per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        txt1=(TextView)findViewById(R.id.textView6);

        Bundle extras = getIntent().getExtras();
        if (extras != null) { num = extras.getInt("num"); }
        else { num=9; }
        per=(num/10)*100;
        //Double d = new Double(per);

        //int i = d.intValue();
        String i = String.valueOf(per);

        //String i="Hello";
        txt1.setText(i);


        /*
        this.pieChart = pieChart;
        pieChart.setUsePercentValues(true);
        pieChart.getDescription().setEnabled(true);
        pieChart.setExtraOffsets(5,10,5,5);
        pieChart.setDragDecelerationFrictionCoef(0.9f);
        pieChart.setTransparentCircleRadius(61f);
        pieChart.setHoleColor(Color.WHITE);
        pieChart.animateY(1000, Easing.EasingOption.EaseInOutCubic);
        ArrayList<PieEntry> yValues = new ArrayList<>();
        yValues.add(new PieEntry(34f,"Ilala"));
        yValues.add(new PieEntry(56f,"Temeke"));
        yValues.add(new PieEntry(66f,"Kinondoni"));
        yValues.add(new PieEntry(45f,"Kigamboni"));

        PieDataSet dataSet = new PieDataSet(yValues, "Desease Per Regions");
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData pieData = new PieData((dataSet));
        pieData.setValueTextSize(10f);
        pieData.setValueTextColor(Color.YELLOW);
        pieChart.setData(pieData);
        //PieChart Ends Here
        */
        but =(Button) findViewById(R.id.button2);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //startActivityForResult(new Intent(android.provider.Settings.ACTION_WIFI_SETTINGS));

                Intent i=new Intent(android.provider.Settings.ACTION_ACCESSIBILITY_SETTINGS);
                startActivity(i);

            }
        });

    }

}

