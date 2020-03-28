package br.com.projeto.calculamedia.controller;

public class AlunoControl {

    public Double calculaMedia(Double nota1, Double nota2) {
        return (nota1 + nota2) / 2;
    }

    public boolean isAprovado(Double media) {
        if (media >= 7) {
            return true;
        }
        return false;
    }
}
