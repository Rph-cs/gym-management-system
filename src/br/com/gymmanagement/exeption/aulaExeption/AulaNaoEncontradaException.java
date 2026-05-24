package br.com.gymmanagement.exeption.aulaExeption;

public class AulaNaoEncontradaException extends RuntimeException {
    public AulaNaoEncontradaException(String message) {
        super(message);
    }
}
