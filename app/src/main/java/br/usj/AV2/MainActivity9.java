package br.usj.AV2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity implements View.OnClickListener {

    EditText numConta;
    EditText saldoAtual;
    EditText valorDebitos;
    EditText valorCreditos;

    Button botaoGerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numConta = findViewById(R.id.inputNum1);
        saldoAtual = findViewById(R.id.inputNum2);
        valorDebitos = findViewById(R.id.inputNum3);
        valorCreditos = findViewById(R.id.inputNum4);

        botaoGerar = findViewById(R.id.button);
        botaoGerar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Integer nc = Integer.parseInt(numConta.getText().toString());
        Double sa = Double.parseDouble(saldoAtual.getText().toString());
        Double vd = Double.parseDouble(valorDebitos.getText().toString());
        Double vc = Double.parseDouble(valorCreditos.getText().toString());

        String message;
        Double total = sa - vd + vc;

        if (total > 0) {
            message = "Saldo positivo";
        } else {
            message = "Saldo NEGATIVO";
        }


        Toast.makeText(this, "A conta Nº "+nc+"está com saldo atual de R$ "+total+", devido a isto, com "+message, Toast.LENGTH_LONG).show();
    }
}