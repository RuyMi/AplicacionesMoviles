package com.example.ejercicio_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultadoFinal;
    EditText numero_1, numero_2;
    Button botonSuma, botonResta, botonMultiplicacion, botonDivision;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero_1 = findViewById(R.id.numero1);
        numero_2 = findViewById(R.id.numero2);
        botonSuma = findViewById(R.id.botonSuma);
        botonResta = findViewById(R.id.botonResta);
        botonMultiplicacion = findViewById(R.id.botonMultiplicacion);
        botonDivision = findViewById(R.id.botonDivision);
        resultadoFinal = findViewById(R.id.resultado);

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res1 = numero_1.getText().toString();
                String res2 = numero_2.getText().toString();

                int num1 = Integer.parseInt(res1);
                int num2 = Integer.parseInt(res2);

                int suma = num1 + num2;

                String resSuma = String.valueOf(suma);

                resultadoFinal.setText(resSuma);
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res1 = numero_1.getText().toString();
                String res2 = numero_2.getText().toString();

                int num1 = Integer.parseInt(res1);
                int num2 = Integer.parseInt(res2);

                int resta = num1 - num2;

                String resResta = String.valueOf(resta);

                resultadoFinal.setText(resResta);
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res1 = numero_1.getText().toString();
                String res2 = numero_2.getText().toString();

                int num1 = Integer.parseInt(res1);
                int num2 = Integer.parseInt(res2);

                int multiplicacion = num1 * num2;

                String resMultiplicacion = String.valueOf(multiplicacion);

                resultadoFinal.setText(resMultiplicacion);
            }
        });

        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String res1 = numero_1.getText().toString();
                String res2 = numero_2.getText().toString();

                double num1 = Double.parseDouble(res1);
                double num2 = Double.parseDouble(res2);

                double division = num1 / num2;

                String resDivision = String.valueOf(division);

                resultadoFinal.setText(resDivision);
            }
        });




    }
}