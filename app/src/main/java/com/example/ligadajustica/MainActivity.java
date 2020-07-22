package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<equipamentoGet> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastraHeroi(View view) {
        Intent intent = new Intent(this, heroi.class);
        startActivity(intent);
    }

    public void cadastraVilao(View view) {
        Intent intent = new Intent(this, vilao.class);
         startActivity(intent);
    }

    public void cadastraEquipa(View view){
        Intent intent = new Intent(this, equipamento.class);
        startActivity(intent);

    }

}