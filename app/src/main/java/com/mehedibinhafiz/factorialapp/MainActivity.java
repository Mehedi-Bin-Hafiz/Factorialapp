package com.mehedibinhafiz.factorialapp;

import androidx.annotation.IntRange;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,ab;
    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=findViewById(R.id.btn1);
        edt1=findViewById(R.id.edt1);
        ab=findViewById(R.id.ab);
    }
    public void facto(View view){
        String num = edt1.getText().toString();
        int innum = Integer.valueOf(num);
        int i,fac=1;
        for(i=1;i<=innum;i++){
            fac=fac*i;
        }
        String v = String.valueOf(fac);
        edt1.setText(v);

    }
}
