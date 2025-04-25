package br.com.AmigoFiel.enums;

public enum Especializacao {
    CLINICO_GERAL("Clinico geral"),
    CIRURGIAO("Castração, remoção de tumeros, ortopedia"),
    ANESTESISTA("Responsavel pela anestesia e monitoramento durante cirurgias"),
    CARDIOLOGISTA("Cardiologista"),
    ODONTOLOGISTA("Odontologista"),
    NUTRICIONISTA("Nutricionista"),
    OUTRA("Outra");

    private final String descricao;

    Especializacao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Especializacao fromDescricao(String descricao) {
        for (Especializacao c : values()) {
            if (c.descricao.equalsIgnoreCase(descricao.trim())) {
                return c;
            }
        }
        throw new IllegalArgumentException("Especializacao desconhecida: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
