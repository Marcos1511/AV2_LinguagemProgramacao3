package br.usj.AV2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity implements View.OnClickListener {

    EditText horasTrabalhadas;
    EditText salarioHora;


    Button botaoGerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horasTrabalhadas = findViewById(R.id.inputNum1);
        salarioHora = findViewById(R.id.inputNum2);

        botaoGerar = findViewById(R.id.button);
        botaoGerar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Double ht = Double.parseDouble(horasTrabalhadas.getText().toString());
        Double sh = Double.parseDouble(salarioHora.getText().toString());
        Double vHE = sh * 1.5;
        Double total;

        if (ht > 160) {
            total = (ht * sh) + (vHE*(ht-160));
        } else {
            total = (ht * sh);
        }

        Toast.makeText(this, "O salário do funcionário será de R$ "+total, Toast.LENGTH_LONG).show();
    }
}