package br.jus.tjms.primefaces.entidade;

public enum TipoServidor {
    CONCURSADO("Concursado"),
    MEMBRO("Membro"),
    TERCEIRIZADO("Terceirizado");


    TipoServidor(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    public String getDescricao() {
        return descricao;
    }
}
