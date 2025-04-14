package br.com.AmigoFiel.enums;

public enum TipoDeServico {
    MEDICAMENTO("Medicamento"),
    SKIN_CARE("Skin Care"),
    HIGIENE_PESSOAL("Higiene Pessoal"),
    UTILIDADES("Utilidades"),
    OUTRA("Outra");

    private final String descricao;

    TipoDeServico(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoDeServico fromDescricao(String descricao) {
        for (TipoDeServico c : values()) {
            if (c.descricao.equalsIgnoreCase(descricao.trim())) {
                return c;
            }
        }
        throw new IllegalArgumentException("TipoDeServico desconhecido: " + descricao);
    }

    @Override
    public String toString() {
        return descricao;
    }
}
