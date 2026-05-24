package br.com.gymmanagement.enums;

public enum StatusAluno {
    ATIVO("Ativo"),
    INATIVO("Inativo");

    private final String nomeExibicao;

    StatusAluno(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
