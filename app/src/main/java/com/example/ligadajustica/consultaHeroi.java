package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.ligadajustica.MainActivity.list;

public class consultaHeroi extends AppCompatActivity {

    TextView txtConsultaNome;
    TextView txtConsultaCodNome;
    TextView txtConsultaEspecie;
    TextView txtConsultaVulne;
    TextView txtConsultaNivel;
    TextView txtConsultaEquipa;
    TextView txtDescricaoConsulMem;
    TextView txtFinaConsulMem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_heroi);
        txtConsultaNome = (TextView) findViewById(R.id.txtConsultaNomeVilao);
        txtConsultaCodNome = (TextView) findViewById(R.id.txtConsultaCodNome);
        txtConsultaEspecie = (TextView) findViewById(R.id.txtConsultaEspecie);
        txtConsultaVulne = (TextView) findViewById(R.id.txtConsultaVulne);
        txtConsultaNivel = (TextView) findViewById(R.id.txtConsultaNivel);
        txtConsultaEquipa = (TextView) findViewById(R.id.txtConsultaEquipa);
        txtDescricaoConsulMem = (TextView) findViewById(R.id.txtDescricaoConsulMem);
        txtFinaConsulMem = (TextView) findViewById(R.id.txtFinaConsulMem);

        Intent intentRecebedora = getIntent();
        Bundle parametros = intentRecebedora.getExtras();

        String nome = getIntent().getStringExtra("chave_nome");
        String codNome = getIntent().getStringExtra("chave_cod");
        String especie = getIntent().getStringExtra("chave_especie");
        String vulne = getIntent().getStringExtra("chave_vulne");
        String nivel = getIntent().getStringExtra("chave_nivel");

        txtConsultaNome.setText(nome);
        txtConsultaCodNome.setText(codNome);
        txtConsultaEspecie.setText(especie);
        txtConsultaVulne.setText(vulne);
        txtConsultaNivel.setText(nivel);
        for (equipamentoGet e : list ) {
            txtConsultaEquipa.setText(e.getNome());
            txtDescricaoConsulMem.setText(e.getDescricao());
            txtFinaConsulMem.setText(e.getFina());
        }
    }


    public void VoltarMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}