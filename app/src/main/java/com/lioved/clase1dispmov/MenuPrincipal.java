package com.lioved.clase1dispmov;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button btnCalculadoraImc;
    private Button btnConversorUnidades;
    private Button btnCalculadoraGeneral;
    private EditText txtNombre;
    private String nombreusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        Intent intent = getIntent();
        nombreusuario = intent.getStringExtra("NOMBREUSUARIO");
        btnCalculadoraImc = findViewById(R.id.btnCalcularImc);
        btnConversorUnidades = findViewById(R.id.btnConversor);
        btnCalculadoraGeneral = findViewById(R.id.btnCalculadora);
        txtNombre = findViewById(R.id.txtNombreUsuario);
        btnCalculadoraImc.setOnClickListener(this);
        btnCalculadoraGeneral.setOnClickListener(this);
        btnConversorUnidades.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.btnCalcularImc:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("NOMBREUSUARIO", txtNombre.getText().toString());
                Toast.makeText(this, "Entro por medio de la calculadora IMC", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;

            case R.id.btnConversor:
                intent = new Intent(this, Conversor.class);
                intent.putExtra("nombreUsuario", txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entro por medio del Conversor", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnCalculadora:
                intent = new Intent(this, Calculadora.class);
                intent.putExtra("nombreUsuario", txtNombre.getText().toString());
                startActivity(intent);
                Toast.makeText(this, "Entro por medio de la calculadora", Toast.LENGTH_SHORT).show();
                break;
        }
        }
    }

