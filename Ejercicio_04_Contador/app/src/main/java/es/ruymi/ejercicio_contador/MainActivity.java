package es.ruymi.ejercicio_contador;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botonSumar, botonRestar;
    TextView numero;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
        botonSumar =  findViewById(R.id.botonSumar);
        botonRestar = findViewById(R.id.botonRestar);

        botonRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int res = Integer.parseInt((String) numero.getText());
                res = res - 1;
                numero.setText(String.valueOf(res));
            }
        });

        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int res = Integer.parseInt((String) numero.getText());
                res = res + 1;
                numero.setText(String.valueOf(res));
            }
        });
    }
}