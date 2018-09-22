package com.demo.socissproblem6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText numberA,numberB;
    TextView tvResult;
    int c=0;
    Button btn_sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA=findViewById(R.id.edt_number_a);
        numberB=findViewById(R.id.edt_number_b);
        tvResult=findViewById(R.id.tv_result);
        btn_sum= findViewById(R.id.btn_sum);
        customBTN();
    }
    //cach3:
    void customBTN() {
        btn_sum.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        switch (id) {
            case R.id.btn_sum:
                c=Integer.valueOf(numberA.getText().toString())
                        + Integer.valueOf(numberB.getText().toString());
                tvResult.setText("Kết quả: "+Integer.toString(c));
                break;
        }
    }

//    //cach1:
//    public void sumAB(View view) {
//        c=Integer.valueOf(numberA.getText().toString())
//                + Integer.valueOf(numberB.getText().toString());
//        tvResult.setText("Kết quả: "+Integer.toString(c));
//
//    }

    //cach2:
//    void customBTN(){
//        btn_sum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                c=Integer.valueOf(numberA.getText().toString())
//                        + Integer.valueOf(numberB.getText().toString());
//                tvResult.setText("Kết quả: "+Integer.toString(c));
//            }
//        });
//    }



}
