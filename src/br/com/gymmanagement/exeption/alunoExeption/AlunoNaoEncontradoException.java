package br.com.gymmanagement.exeption.alunoExeption;

public class AlunoNaoEncontradoException extends RuntimeException {
    public AlunoNaoEncontradoException(String message) {
        super(message);
    }
}
