package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class consultaEquipamento extends AppCompatActivity {
    TextView txtConsulNomeEq;
    TextView txtConsulDescricaoEq;
    TextView txtConsulFinEq;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_equipamento);
        txtConsulNomeEq = (TextView) findViewById(R.id.txtConsulNomeEq);
        txtConsulDescricaoEq = (TextView) findViewById(R.id.txtConsulDescricaoEq);
        txtConsulFinEq = (TextView) findViewById(R.id.txtConsulFinEq);

        Intent intentRecebedora = getIntent();
        Bundle parametros = intentRecebedora.getExtras();
        String nome = getIntent().getStringExtra("chave_nomeEq");
        String descriocao = getIntent().getStringExtra("chave_descricao");
        String finalidade = getIntent().getStringExtra("chave_finalidade");

        txtConsulNomeEq.setText(nome);
        txtConsulDescricaoEq.setText(descriocao);
        txtConsulFinEq.setText(finalidade);


    }


    public void voltarMenu(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}