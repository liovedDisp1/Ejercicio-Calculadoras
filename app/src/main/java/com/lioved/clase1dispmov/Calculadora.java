package com.lioved.clase1dispmov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    EditText numberOne;
    EditText numberTwo;
    Button btnSuma;
    Button btnResta;
    Button btnMulti;
    Button btnDiv;
    EditText resultado;

    private String nombreUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        Intent intent = getIntent();
        nombreUsuario = intent.getStringExtra("nombreUsuario");
        numberOne = findViewById(R.id.editTextTextNumeroUno);
        numberTwo = findViewById(R.id.editTextTextNumeroDos);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMulti = findViewById(R.id.btnMultiplicar);
        btnDiv = findViewById(R.id.btnDividir);
        resultado = findViewById(R.id.editTextTotal);
        numberOne.setOnClickListener(this);
        numberTwo.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnResta.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);

        Toast.makeText(this, "Bienvenido a su calculo " + nombreUsuario, Toast.LENGTH_SHORT).show();
    }

    public double Sumar(double datoUno, double datoDos){
        double suma = 0;
        suma = datoUno + datoDos;
        return suma;
    }

    public double Restar(double datoUno, double datoDos){
        double resta = 0;
        resta = datoUno - datoDos;
        return resta;
    }

    public double Multiplicar(double datoUno, double datoDos){
        double multiplicar = 0;
        multiplicar = datoUno * datoDos;
        return multiplicar;
    }

    public double Dividir(double datoUno, double datoDos) {
        double dividir = 0;
        dividir = datoUno / datoDos;
        return dividir;
    }


    @Override
    public void onClick(View v) {

        DecimalFormat df=new DecimalFormat();
        switch (v.getId()){
            case R.id.btnSuma:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double sumar = Double.valueOf(df.format(Sumar(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la suma es: "+ sumar, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ sumar);
                break;
            }
            case R.id.btnResta:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double restar = Double.valueOf(df.format(Restar(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la resta es: "+ restar, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ restar);
                break;
            }
            case R.id.btnMultiplicar:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double multiplicar = Double.valueOf(df.format(Multiplicar(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la suma es: "+ multiplicar, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ multiplicar);
                break;
            }
            case R.id.btnDividir:{
                Double numOne = Double.parseDouble(numberOne.getText().toString());
                Double numTwo = Double.parseDouble(numberTwo.getText().toString());
                Double dividir = Double.valueOf(df.format(Dividir(numOne, numTwo)));
                Toast.makeText(this, "El resultado de la suma es: "+ dividir, Toast.LENGTH_LONG).show();
                resultado.setText(" "+ dividir);
                break;
            }
        }

    }
}