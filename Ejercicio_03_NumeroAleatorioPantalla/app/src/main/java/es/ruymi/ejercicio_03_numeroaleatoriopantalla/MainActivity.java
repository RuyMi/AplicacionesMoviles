package es.ruymi.ejercicio_03_numeroaleatoriopantalla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textoResultado;
    Button botonAleatorio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botonAleatorio = findViewById(R.id.botonAleatorio);
        textoResultado = findViewById(R.id.texto);

        botonAleatorio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                double numeroAleatorio =  (Math.random() * 100);
                textoResultado.setText(String.valueOf(numeroAleatorio));
            }
        });
    }
}