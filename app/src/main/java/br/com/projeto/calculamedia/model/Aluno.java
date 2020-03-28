package br.com.projeto.calculamedia.model;

public class Aluno {

    private String nome;
    private Double media;
    private String situacao;


    public Aluno() {
    }

    public Aluno(String nome, Double media, String situacao) {
        this.nome = nome;
        this.media = media;
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
