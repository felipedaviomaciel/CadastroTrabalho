package com.example.aluno.fazer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText comida;
    private Button button;
    private Button apagar;
    private TextView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        comida = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.buttonCadastrar);
        apagar = (Button) findViewById(R.id.buttonApagar);
        lista = (TextView) findViewById(R.id.lista);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nomeC = comida.getText().toString();
                String cadastros = lista.getText().toString() +"\n"+nomeC;



                if (){
                    Toast.makeText(MainActivity.this, "Cadastrado com sucesso!", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Erro!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
