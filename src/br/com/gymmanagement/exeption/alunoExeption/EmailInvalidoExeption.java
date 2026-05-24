package br.com.gymmanagement.exeption.alunoExeption;

public class EmailInvalidoExeption extends RuntimeException {
    public EmailInvalidoExeption(String message) {
        super(message);
    }
}
