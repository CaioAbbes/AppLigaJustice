package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.ligadajustica.MainActivity.list;

public class consultaVilao extends AppCompatActivity {
    TextView txtConsultaNomeVilao;
    TextView txtCodNomeConsul;
    TextView txtEspecieConsulVilao;
    TextView txtVulneConsul;
    TextView txtNivelConsul;
    TextView txtEquipaConsul;
    TextView txtHeroiRivalConsul;
    TextView txtDataAtaqueConsul;
    TextView txtEsconderijoConsul;
    TextView txtConsulDescEq;
    TextView txtFinaConsulEq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_vilao);
        txtConsultaNomeVilao = (TextView) findViewById(R.id.txtConsultaNomeVilao);
        txtCodNomeConsul = (TextView) findViewById(R.id.txtCodNomeConsul);
        txtEspecieConsulVilao = (TextView) findViewById(R.id.txtEspecieConsulVilao);
        txtVulneConsul = (TextView) findViewById(R.id.txtVulneConsul);
        txtNivelConsul = (TextView) findViewById(R.id.txtNivelConsul);
        txtEquipaConsul = (TextView) findViewById(R.id.txtEquipaConsul);
        txtHeroiRivalConsul = (TextView) findViewById(R.id.txtHeroiRivalConsul);
        txtDataAtaqueConsul = (TextView) findViewById(R.id.txtDataAtaqueConsul);
        txtEsconderijoConsul = (TextView) findViewById(R.id.txtEsconderijoConsul);
        txtConsulDescEq = (TextView) findViewById(R.id.txtConsulDescEq);
        txtFinaConsulEq = (TextView) findViewById(R.id.txtFinaConsulEq) ;

        Intent intentRecebedora = getIntent();
        Bundle parametros = intentRecebedora.getExtras();

        String nome = getIntent().getStringExtra("chave_nome");
        String codNome = getIntent().getStringExtra("chave_codnome");
        String especie = getIntent().getStringExtra("chave_especie");
        String vulne = getIntent().getStringExtra("chave_vulne");
        String nivel = getIntent().getStringExtra("chave_nivel");
        String heroi = getIntent().getStringExtra("chave_heroi");
        String data = getIntent().getStringExtra("chave_data");
        String esconderijo = getIntent().getStringExtra("chave_esconderijo");

        txtConsultaNomeVilao.setText(nome);
        txtCodNomeConsul.setText(codNome);
        txtEspecieConsulVilao.setText(especie);
        txtVulneConsul.setText(vulne);
        txtNivelConsul.setText(nivel);
        for (equipamentoGet e : list ) {
            txtEquipaConsul.setText(e.getNome());
            txtConsulDescEq.setText(e.getDescricao());
            txtFinaConsulEq.setText(e.getFina());
        }

        txtHeroiRivalConsul.setText(heroi);
        txtDataAtaqueConsul.setText(data);
        txtEsconderijoConsul.setText(esconderijo);
    }


    public void VoltarMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}