package br.com.gymmanagement.service;

import br.com.gymmanagement.exeption.alunoExeption.AlunoJaCadastradoException;
import br.com.gymmanagement.model.aluno.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();
    
    public void cadastrarAluno(String cpf, String nome, String email) {
        for (Aluno a : alunos) {
            if (a.getCpf().equals(cpf)) {
                throw new AlunoJaCadastradoException("CPF já cadastrado");
            }
        }

        alunos.add(new Aluno(cpf, nome, email));
    }
}
