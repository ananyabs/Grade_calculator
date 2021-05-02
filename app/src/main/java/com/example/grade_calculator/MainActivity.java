package com.example.grade_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2,ed3,ed4;
    Button btn1,btn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1=findViewById(R.id.stname);
        ed2=findViewById(R.id.cie);
        ed3=findViewById(R.id.see);
        ed4=findViewById(R.id.grade);

        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                markscal();
            }
        });

    }

    public void markscal()
    {
        int m1,m2;
        double avg,total;
        String grade;

        m1=Integer.parseInt(ed2.getText().toString());
        m2=Integer.parseInt(ed3.getText().toString());
         total=m1+m2;
         avg=total/2;

         if(avg>=90)
         {
             ed4.setText("S");
         }

         else if(avg>=80){
             ed4.setText("A");
         }

         else if(avg>=70){
             ed4.setText("B");
         }
         else if(avg>=60){
             ed4.setText("C");
         }

         else if(avg>=50){
             ed4.setText("D");
         }

         else if(avg>=40){
             ed4.setText("E");
         }

         else
        {
            ed4.setText("F");
        }

    }
    public void clear()
    {
        ed1.setText("");
        ed2.setText("");
        ed3.setText("");
        ed4.setText("");
        ed1.requestFocus();

    }
}