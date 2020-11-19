package br.usj.AV2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10 extends AppCompatActivity implements View.OnClickListener {

    EditText saldoEstoque;
    EditText saldoMax;
    EditText saldoMin;

    Button botaoGerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saldoEstoque = findViewById(R.id.inputNum1);
        saldoMax = findViewById(R.id.inputNum2);
        saldoMin = findViewById(R.id.inputNum3);

        botaoGerar = findViewById(R.id.button);
        botaoGerar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Integer se = Integer.parseInt(saldoEstoque.getText().toString());
        Integer vmax = Integer.parseInt(saldoMax.getText().toString());
        Integer vmin = Integer.parseInt(saldoMin.getText().toString());

        String message;
        int media = (vmax + vmin)/2;

        if (se >= media) {
            message = "não precisa efetuar compra";
        } else {
            message = "precisa EFETUAR COMPRA!!";
        }


        Toast.makeText(this, "O saldo atual do estoque é de "+se+" itens, neste caso "+message, Toast.LENGTH_LONG).show();
    }
}