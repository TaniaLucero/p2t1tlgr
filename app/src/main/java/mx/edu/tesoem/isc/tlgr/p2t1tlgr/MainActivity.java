package mx.edu.tesoem.isc.tlgr.p2t1tlgr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText valor1, valor2;
    TextView res;
    RadioButton suma, resta, mult, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.val1);
        valor2 = (EditText) findViewById(R.id.val2);
        res = (TextView) findViewById(R.id.txtres);

        suma = (RadioButton) findViewById(R.id.rbsuma);
        resta = (RadioButton) findViewById(R.id.rbresta);
        mult = (RadioButton) findViewById(R.id.rbmult);
        div = (RadioButton) findViewById(R.id.rbdiv);

        getSupportActionBar().hide();
    }

    public void Sumar (View view)
    {
        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();

        int numero1 = Integer.parseInt(val1);
        int numero2 = Integer.parseInt(val2);
        int suma = numero1 + numero2;

        String resultado = String.valueOf(suma);
        res.setText(" "+resultado);
    }

    public void Resta (View view)
    {

        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();

        int numero1 = Integer.parseInt(val1);
        int numero2 = Integer.parseInt(val2);
        int resta = numero1 - numero2;

        String resultado = String.valueOf(resta);
        res.setText(" "+resultado);

    }

    public void Multiplicar(View view)
    {

        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();

        int numero1 = Integer.parseInt(val1);
        int numero2 = Integer.parseInt(val2);
        int multi = numero1 * numero2;

        String resultado = String.valueOf(multi);
        res.setText(" "+resultado);

    }

    public void Dividir(View view)
    {

        String val1 = valor1.getText().toString();
        String val2 = valor2.getText().toString();

        float numero1 = Float.parseFloat(val1);
        float numero2 = Float.parseFloat(val2);
        double division = numero1 / numero2;

        String resultado = String.valueOf(division);
        res.setText(" "+resultado);

    }
}
