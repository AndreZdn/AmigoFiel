package br.com.AmigoFiel.enums;

public enum Especializacao {
    MEDICAMENTO("Medicamento"),
    SKIN_CARE("Skin Care"),
    HIGIENE_PESSOAL("Higiene Pessoal"),
    UTILIDADES("Utilidades"),
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
