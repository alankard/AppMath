package com.example.appmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText n1;
    private EditText n2;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1=(EditText)findViewById(R.id.nm_1);
        n2=(EditText)findViewById(R.id.nm_2);
        res=(TextView)findViewById(R.id.txt_resultado);
    }
    int nu1,nu2,suma,resta,multi,divi;
    public void Sumar(View view){

        nu1=Integer.parseInt(n1.getText().toString());
        nu2=Integer.parseInt(n2.getText().toString());

        suma = nu1+nu2;
        res.setText("Resultado:"+suma);
    }
    public void Restar(View view){
        nu1=Integer.parseInt(n1.getText().toString());
        nu2=Integer.parseInt(n2.getText().toString());

        resta=nu1-nu2;
        res.setText("Resultado:"+resta);
    }
    public void Multiplicar(View view) {
        nu1=Integer.parseInt(n1.getText().toString());
        nu2=Integer.parseInt(n2.getText().toString());

        multi=nu1*nu2;
        res.setText("Resultado:"+multi);
    }
    public void Dividir(View view){
        nu1=Integer.parseInt(n1.getText().toString());
        nu2=Integer.parseInt(n2.getText().toString());

        divi=nu1/nu2;
        res.setText("Resultado:"+divi);
    }
}