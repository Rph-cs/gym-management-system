package br.com.gymmanagement.enums;

public enum ModalidadeAula {
    SPINNING("Spinning"),
    FUNCIONAL("Funcional"),
    YOGA("Yoga");
    
    private final String nomeExibicao;
    
    ModalidadeAula (String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }

    @Override
    public String toString() {
        return nomeExibicao;
    }
}
