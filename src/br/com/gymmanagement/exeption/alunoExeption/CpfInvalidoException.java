package br.com.gymmanagement.exeption.alunoExeption;

public class CpfInvalidoException extends RuntimeException {
    public CpfInvalidoException(String message) {
        super(message);
    }
}
