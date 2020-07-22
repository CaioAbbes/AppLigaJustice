package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.ligadajustica.MainActivity.list;

public class equipamento extends AppCompatActivity {
    EditText nomeTxt;
    EditText descricaoTxt;
    EditText finalidadeTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipamento);
        nomeTxt = (EditText) findViewById(R.id.txtNomeEquipa);
        descricaoTxt = (EditText) findViewById(R.id.txtDescricaoEquipa);
        finalidadeTxt = (EditText) findViewById(R.id.txtFinalidadeEquipa);

    }


    public void cadastrarEquipa(View view){
        equipamento equipamento = new equipamento();
        vilao vilao = new vilao();
        String nome = nomeTxt.getText().toString();
        String descricao = descricaoTxt.getText().toString();
        String finalidade = finalidadeTxt.getText().toString();

        Intent intentEnviadora = new Intent(equipamento.this, consultaEquipamento.class);

        intentEnviadora.putExtra("chave_nomeEq",nomeTxt.getText().toString());
        intentEnviadora.putExtra("chave_descricao",descricaoTxt.getText().toString());
        intentEnviadora.putExtra("chave_finalidade",finalidadeTxt.getText().toString());

        startActivity(intentEnviadora);
        finish();
        //list.add(equipamento);


        equipamentoGet get = new equipamentoGet(nome,descricao,finalidade);

        list.add(get);

    }




    public void consultarEquipa(View view ){
        Intent intent = new Intent(this, consultaEquipamento.class);
        startActivity(intent);

    }

}