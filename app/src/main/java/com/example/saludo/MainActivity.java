package com.example.saludo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtSaludoJava;
    Button btnCambiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCambiar=findViewById(R.id.btnCambiar);


        txtSaludoJava = findViewById(R.id.txtSaludo);

       //txtSaludoJava.setText("Esto se cambia desde la clase java");
    }

    public void cambiarTexto(View v){
        String valorTextoInicial = btnCambiar.getText().toString();
        String valorTextoView = txtSaludoJava.getText().toString();


        if (btnCambiar.getText().equals("Cambiar Texto")){
            txtSaludoJava.setText("Esto se cambia desde la clase java");
            btnCambiar.setText("Volver");
        }else{
            btnCambiar.setText("Cambiar Texto");
            txtSaludoJava.setText("Hola");
        }

    }

}