package com.apps.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.txt_valor1);
        et2= (EditText) findViewById(R.id.txt_valor2);
        tv1= (TextView) findViewById(R.id.txt_resultado);
        rb1= (RadioButton) findViewById(R.id.rb_sumar);
        rb2= (RadioButton) findViewById(R.id.rb_restar);

    }

    //Metodo para el boton calcular

    public void Calcular(View view){
        int valor1 = Integer.parseInt(et1.getText().toString());
        int valor2 = Integer.parseInt(et2.getText().toString());

        if(rb1.isChecked()){
            int suma = valor1 + valor2;
            tv1.setText(String.valueOf(suma));
        }else if(rb2.isChecked()){
            int resta = valor1 - valor2;
            tv1.setText(String.valueOf(resta));
        }
    }
}