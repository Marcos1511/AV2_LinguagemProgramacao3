package br.usj.AV2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener {

    EditText carrosVendidos;
    EditText totalVendas;
    EditText salario;
    EditText comissaoCarro;

    Button botaoGerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        carrosVendidos = findViewById(R.id.inputNum1);
        totalVendas = findViewById(R.id.inputNum2);
        salario = findViewById(R.id.inputNum3);
        comissaoCarro = findViewById(R.id.inputNum4);

        botaoGerar = findViewById(R.id.button);
        botaoGerar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Double cv = Double.parseDouble(carrosVendidos.getText().toString());
        Double tv = Double.parseDouble(totalVendas.getText().toString());
        Double sa = Double.parseDouble(salario.getText().toString());
        Double cc = Double.parseDouble(comissaoCarro.getText().toString());

        Double total = sa + ((tv*5)/100) + (cc*cv);
//        Double total = (va+(va*(45/100))+(va*(28/100)));

        Toast.makeText(this, "Neste mês, o salário do vendedor será de R$ "+total, Toast.LENGTH_LONG).show();
    }
}