package com.lioved.clase1dispmov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Conversor extends AppCompatActivity implements View.OnClickListener {

    EditText datoUno;
    Button btnGrToKg;
    Button btnMlToM;
    Button btnMlL;
    Button btnStoH;
    EditText total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);

        datoUno = findViewById(R.id.editTextDatoUno);
        btnGrToKg = findViewById(R.id.btnGrKg);
        btnMlToM = findViewById(R.id.btnMKm);
        btnMlL = findViewById(R.id.btnMlL);
        btnStoH = findViewById(R.id.btnSH);
        total = findViewById(R.id.editTextTextResultado);
        datoUno.setOnClickListener(this);
        btnGrToKg.setOnClickListener(this);
        btnMlToM.setOnClickListener(this);
        btnMlL.setOnClickListener(this);
        btnStoH.setOnClickListener(this);
        total.setOnClickListener(this);
    }

    public double mk(double uno){
        double metrosAKilometros = 0;
        metrosAKilometros = uno / 1000;
        return metrosAKilometros;
    }

    public double grToKg(double uno){
        double gramosAkilogramos = 0;
        gramosAkilogramos = uno / 1000;
        return gramosAkilogramos;
    }

    public double sToH(double uno){
        double segundosAhoras = 0;
        segundosAhoras = uno / 3600;
        return segundosAhoras;
    }

    public double MlToL(double uno){
        double mililitrosAlitros = 0;
        mililitrosAlitros = uno / 1000;
        return mililitrosAlitros;
    }


    @Override
    public void onClick(View v) {
        DecimalFormat df = new DecimalFormat();
        switch (v.getId()) {
            case R.id.btnMKm: {
                Double numOne = Double.parseDouble(datoUno.getText().toString());
                Double metrosAkm = Double.valueOf(df.format(mk(numOne)));
                Toast.makeText(this, "La conversion en kilometros es: " + metrosAkm, Toast.LENGTH_LONG).show();
                total.setText(" " + metrosAkm);
                break;
            }
            case R.id.btnGrKg: {
                Double numOne = Double.parseDouble(datoUno.getText().toString());
                Double GraAKilogra = Double.valueOf(df.format(grToKg(numOne)));
                Toast.makeText(this, "La conversion en kilogramos es: " + GraAKilogra, Toast.LENGTH_LONG).show();
                total.setText(" " + GraAKilogra);
                break;
            }
            case R.id.btnMlL: {
                Double numOne = Double.parseDouble(datoUno.getText().toString());
                Double MiliLitroALitro = Double.valueOf(df.format(MlToL(numOne)));
                Toast.makeText(this, "La conversion en litros es: " + MiliLitroALitro, Toast.LENGTH_LONG).show();
                total.setText(" " + MiliLitroALitro);
                break;
            }
            case R.id.btnSH: {
                Double numOne = Double.parseDouble(datoUno.getText().toString());
                Double segundosAhoras = Double.valueOf(df.format(sToH(numOne)));
                Toast.makeText(this, "La conversion en horas es: " + segundosAhoras, Toast.LENGTH_LONG).show();
                total.setText(" " + segundosAhoras);
                break;
            }
        }
    }
}