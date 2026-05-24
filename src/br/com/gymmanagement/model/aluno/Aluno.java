package br.com.gymmanagement.model.aluno;

import br.com.gymmanagement.enums.StatusAluno;
import br.com.gymmanagement.exeption.alunoExeption.CpfInvalidoException;
import br.com.gymmanagement.exeption.alunoExeption.EmailInvalidoExeption;

public class Aluno {
    private String cpf;
    private String nome;
    private String email;
    private StatusAluno status;
    
    public Aluno(String cpf, String nome, String email) {
        if (cpf.length() != 11) {
            throw new CpfInvalidoException("CPF inválido. Cpf deve conter apenas 11 dígitos");
        }

        if (email == null || email.trim().isEmpty() || !email.contains("@")) {
            throw new EmailInvalidoExeption("O email não está no formato válido");
        }


        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.status = StatusAluno.ATIVO;
    }

    public String getCpf() {
        return cpf;
    }
}
