package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.example.ligadajustica.MainActivity.list;

public class vilao extends AppCompatActivity {
    EditText txtNomeVilao;
    EditText txtCodNomeVilao;
    EditText txtEspecieVilao;
    EditText txtVuneVilao;
    EditText txtNivelVilao;
    EditText txtEquipaVilao;
    EditText txtHeroiRival;
    EditText txtDataFight;
    EditText txtEsconderijo;
    ListView dropsonwmenu;
    TextView lblTeste1;
    TextView lblTeste2;
    TextView lblTeste3;
    equipamento equipamento = new equipamento();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vilao);
        txtNomeVilao = (EditText) findViewById(R.id.txtNomeVilao);
        txtCodNomeVilao = (EditText) findViewById(R.id.txtCodNomeVilao);
        txtEspecieVilao = (EditText) findViewById(R.id.txtEspecieVilao);
        txtVuneVilao = (EditText) findViewById(R.id.txtVuneVilao);
        txtNivelVilao = (EditText) findViewById(R.id.txtNivelVilao);
        txtHeroiRival = (EditText) findViewById(R.id.txtHeroiRival);
        txtDataFight = (EditText) findViewById(R.id.txtDataFight);
        txtEsconderijo = (EditText) findViewById(R.id.txtEsconderijo);
        dropsonwmenu = (ListView) findViewById(R.id.listView);
        lblTeste1 = (TextView) findViewById(R.id.lblTeste1);
        lblTeste2 = (TextView) findViewById(R.id.lblTeste2);
        lblTeste3 = (TextView) findViewById(R.id.lblTeste3);


        ArrayList<String> list2 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list2);
        dropsonwmenu.setAdapter(adapter);

        for (equipamentoGet e : list ) {
            list2.add(e.getNome());
        }

    }


    public void cadastrarVilao(View view) {
        String nome = txtNomeVilao.getText().toString();
        String codNome = txtCodNomeVilao.getText().toString();
        String especie = txtEspecieVilao.getText().toString();
        String vulne = txtVuneVilao.getText().toString();
        String nivel = txtNivelVilao.getText().toString();
        String heroi = txtHeroiRival.getText().toString();
        String dataFight = txtDataFight.getText().toString();
        String esconderijo = txtEsconderijo.getText().toString();

        Intent intentEnviadora = new Intent(vilao.this, consultaVilao.class);

        intentEnviadora.putExtra("chave_nome", txtNomeVilao.getText().toString());
        intentEnviadora.putExtra("chave_codnome", txtCodNomeVilao.getText().toString());
        intentEnviadora.putExtra("chave_especie", txtEspecieVilao.getText().toString());
        intentEnviadora.putExtra("chave_vulne", txtVuneVilao.getText().toString());
        intentEnviadora.putExtra("chave_nivel", txtNivelVilao.getText().toString());
        intentEnviadora.putExtra("chave_heroi", txtHeroiRival.getText().toString());
        intentEnviadora.putExtra("chave_data", txtDataFight.getText().toString());
        intentEnviadora.putExtra("chave_esconderijo", txtEsconderijo.getText().toString());
        startActivity(intentEnviadora);
        finish();
    }


    public void consultarVilao(View view) {
        Intent intent = new Intent(this, consultaVilao.class);
        startActivity(intent);
    }


}