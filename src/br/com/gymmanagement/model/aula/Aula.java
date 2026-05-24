package br.com.gymmanagement.model.aula;

import br.com.gymmanagement.model.aluno.Aluno;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public abstract class Aula {
    private String nome;
    private String instrutor;
    private int capacidadeMaxima;
    private List<Aluno> alunosAgendados;
    
    public Aula(String nome, String instrutor, int capacidadeMaxima) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosAgendados = new ArrayList<>();
    }
    
}
