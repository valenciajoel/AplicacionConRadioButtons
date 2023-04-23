package com.apps.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= findViewById(R.id.txt_valor1);
        et2= findViewById(R.id.txt_valor2);
        tv1= findViewById(R.id.txt_resultado);
        rb1= findViewById(R.id.rb_sumar);
        rb2= findViewById(R.id.rb_restar);
        rb3 = findViewById(R.id.rb_multiplicar);
        rb4= findViewById(R.id.rb_dividir);

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
        }else if(rb3.isChecked()){
            int resta = valor1 * valor2;
            tv1.setText(String.valueOf(resta));
        }else if(rb4.isChecked()){

            if(valor2 == 0){
                Toast.makeText(this, "No se puede dividir entre 0 ", Toast.LENGTH_SHORT).show();
            }else {
                int division = valor1 / valor2;
                tv1.setText(String.valueOf(division));
            }
        }
    }
}