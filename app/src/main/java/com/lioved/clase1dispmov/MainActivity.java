package com.lioved.clase1dispmov;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView ImagenEstado;
    EditText txtAltura;
    EditText txtPeso;
    Button btnCalcularIMC;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImagenEstado = findViewById(R.id.imageView);
        txtAltura = findViewById(R.id.EditTextAltura);
        txtPeso = findViewById(R.id.EditTextPeso);
        btnCalcularIMC = findViewById(R.id.btnCalcular);
        btnCalcularIMC.setOnClickListener(this);
        txtPeso.setOnClickListener(this);
        txtAltura.setOnClickListener(this);
    }

    public Double calcularImc(double peso, double altura){
        double imc=0;
        imc = peso / (altura*altura);
        return imc;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCalcular: {
                Double peso = Double.parseDouble(txtPeso.getText().toString());
                Double altura = Double.parseDouble(txtAltura.getText().toString());
                Double imc = calcularImc(peso, altura);
                Toast.makeText(this,"su imc es: "+ imc, Toast.LENGTH_LONG).show();

            }
        }
    }
}