package br.com.gymmanagement.model.planos;

public abstract class Plano {
    private String nome;
    private double precoMensal;
    private int limiteAulasMes;
    
    public abstract String getDescricao();
}
