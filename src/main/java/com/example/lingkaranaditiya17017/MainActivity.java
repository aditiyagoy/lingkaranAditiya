package com.example.lingkaranaditiya17017;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText eTR, eTD;
    private Button bTHitung;
    private TextView tVLuas, tVKeliling;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eTR =findViewById(R.id.eTR);
        bTHitung = findViewById(R.id.bT_Hitung);
        tVKeliling = findViewById(R.id.tVKeliling);
        tVLuas = findViewById(R.id.tVLuas);
        bTHitung.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.bT_Hitung){
            String r = eTR.getText().toString().trim();
            boolean isEmptyFields = false;
            if (TextUtils.isEmpty(r)){
                isEmptyFields = true;
                eTR.setError("Isikan Jari Jari");
            }
            if (!isEmptyFields){
                double phi = 3.14;
                double jari = Double.parseDouble(r);
                double diameter = 2*jari;
                double keliling = phi*diameter;
                double luas = phi*jari*jari;
                tVKeliling.setText("Keliling Lingkaran = "+String.valueOf(keliling));
                tVLuas.setText("Luas Lingkaran = "+String.valueOf(luas));
            }
        }
    }
}