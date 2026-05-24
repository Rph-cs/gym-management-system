package br.com.gymmanagement.model.aula;

import br.com.gymmanagement.enums.ModalidadeAula;

public class AulaColetiva extends Aula {
    
    private ModalidadeAula modalidade;
    public AulaColetiva(String nome, String instrutor, int capacidadeMaxima) {
        super(nome, instrutor, capacidadeMaxima);
    }
}
