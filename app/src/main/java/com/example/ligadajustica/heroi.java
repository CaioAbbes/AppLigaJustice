package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.ligadajustica.MainActivity.list;

public class heroi extends AppCompatActivity {
    Button btnCadastrarMembro;
    EditText txtNome;
    EditText txtCodinome;
    EditText txtEspecie;
    EditText txtVulnerabilidades;
    EditText txtNivelAcesso;
    EditText txtEquipamento;
    equipamento equipamento = new equipamento();
    ListView dropsonwmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroi);
        btnCadastrarMembro = (Button) findViewById(R.id.btnCadastrarMembro);
        txtNome = (EditText) findViewById(R.id.txtNome);
        txtCodinome = (EditText) findViewById(R.id.txtCodNome);
        txtEspecie = (EditText) findViewById(R.id.txtEspecie);
        txtVulnerabilidades = (EditText) findViewById(R.id.txtVulnerabilidades);
        txtNivelAcesso = (EditText) findViewById(R.id.txtNivelAcesso);
        dropsonwmenu = (ListView) findViewById(R.id.listView);
        //  txtEquipamento = (EditText) findViewById(R.id.txtEquipamentoVilao);


        ArrayList<String> list3 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list3);
        dropsonwmenu.setAdapter(adapter);

        for (equipamentoGet e : list ) {
            list3.add(e.getNome());
        }


    }

    public void cadastrarHeroi(View view) {
        String nome = txtNome.getText().toString();
        String codNome = txtCodinome.getText().toString();
        String especie = txtEspecie.getText().toString();
        String vulnerabilidade = txtVulnerabilidades.getText().toString();
        String nivelAcesso = txtNivelAcesso.getText().toString();
//        String equipamento = txtEquipamento.getText().toString();

        Intent intentEnviadora = new Intent(heroi.this, consultaHeroi.class);


        intentEnviadora.putExtra("chave_nome",txtNome.getText().toString());
        intentEnviadora.putExtra("chave_cod",txtCodinome.getText().toString());
        intentEnviadora.putExtra("chave_especie",txtEspecie.getText().toString());
        intentEnviadora.putExtra("chave_vulne",txtVulnerabilidades.getText().toString());
        intentEnviadora.putExtra("chave_nivel",txtNivelAcesso.getText().toString());
        startActivity(intentEnviadora);
        finish();
    }

    public void consultarHerois(View view) {
        Intent intent = new Intent(this, consultaHeroi.class);
        startActivity(intent);
    }
}