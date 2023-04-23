package com.apps.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private Spinner spinner ;
    private Operacion operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= findViewById(R.id.txt_valor1);
        et2= findViewById(R.id.txt_valor2);
        tv1= findViewById(R.id.txt_resultado);
        spinner = findViewById(R.id.spinner);
        operacion = new Operacion();
        String [] operaciones = operacion.getOperadores();
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, operaciones);

        spinner.setAdapter(adapter);
    }

    //Metodo para el boton calcular

    public void Calcular(View view){
        try {
            int valor1 = Integer.parseInt(et1.getText().toString());
            int valor2 = Integer.parseInt(et2.getText().toString());
            String seleccion = spinner.getSelectedItem().toString();
            int resultado = operacion.Calcular(valor1,valor2,seleccion);
            tv1.setText(String.valueOf(resultado));
        }catch (Error e){
            Toast.makeText(this,e.getMessage(), Toast.LENGTH_SHORT).show();
        } catch (DivisionPorCeroException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }
}