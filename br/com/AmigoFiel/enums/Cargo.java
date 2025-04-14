package br.com.AmigoFiel.enums;

public enum Cargo {
    MEDICAMENTO("Medicamento"),
    SKIN_CARE("Skin Care"),
    HIGIENE_PESSOAL("Higiene Pessoal"),
    UTILIDADES("Utilidades"),
    OUTRA("Outra");

    private final String descricao;

    Cargo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Cargo fromDescricao(String descricao) {
        for (Cargo c : values()) {
            if (c.descricao.equalsIgnoreCase(descricao.trim())) {
                return c;
            }
        }
        throw new IllegalArgumentException("Cargo desconhecido: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
