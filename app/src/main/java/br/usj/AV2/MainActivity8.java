package br.usj.AV2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity8 extends AppCompatActivity implements View.OnClickListener {

    EditText valorSalario;
    EditText valorVendas;


    Button botaoGerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valorSalario = findViewById(R.id.inputNum1);
        valorVendas = findViewById(R.id.inputNum2);

        botaoGerar = findViewById(R.id.button);
        botaoGerar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Double vs = Double.parseDouble(valorSalario.getText().toString());
        Double vv = Double.parseDouble(valorVendas.getText().toString());

        Double total;

        if (vv < 1500) {
            total = vs + ((vv*3)/100);
        } else {
            total = vs + 45 + (((vv-1500)*5)/100);
        }

        Toast.makeText(this, "O salário ao final será de R$ "+total, Toast.LENGTH_LONG).show();
    }
}