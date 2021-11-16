package com.example.ej12eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private Button buttonCambiar;
    private RadioButton rbtPesetas;
    private RadioButton rbtEuros;
    private EditText  inputText;
    private TextView    textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCambiar = findViewById(R.id.btnCambiar);
        rbtPesetas = findViewById(R.id.rbtPesetas);
        inputText = findViewById(R.id.textInput);
        rbtEuros = findViewById(R.id.rbtEuros);

        textResultado = findViewById(R.id.tvResultado);

        buttonCambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!inputText.getText().toString().isEmpty()){
                    DecimalFormat df = new DecimalFormat("#0.00");
                    Double resultado;
                    if ( rbtEuros.isChecked()){
                        resultado = (Double.parseDouble(inputText.getText().toString())) /166.386;
                    }else{
                        resultado = (Double.parseDouble(inputText.getText().toString()))* 166.386;
                    }
                        df.format(resultado);
                        textResultado.setText(String.valueOf(df.format(resultado)));


                }
            }
        });







    }
}