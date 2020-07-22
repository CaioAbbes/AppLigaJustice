package com.example.ligadajustica;

public class equipamentoGet {

    public String nome;
    public String descricao;
    public String fina;

    public equipamentoGet(String nome, String descricao, String fina) {
        this.nome = nome;
        this.descricao = descricao;
        this.fina = fina;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getFina() {
        return fina;
    }

}
