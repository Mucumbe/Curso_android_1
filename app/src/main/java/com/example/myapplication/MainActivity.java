package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void numeroAleatorio(View view){
        Random nA= new Random();

        int numero=nA.nextInt(11);
        System.out.println("kkkkkk"+numero);
        String informacao="O núnero selecionado é: ";
        TextView aleatorioTexto=findViewById(R.id.nAleatorio);
        aleatorioTexto.setText(informacao+numero);
    }
   // public void alterarTexto(View view){
       // TextView texto= findViewById(R.id.aterarTexto);
        //texto.setText("Blandino Mucumbe");
    //}
}