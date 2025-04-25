package br.com.AmigoFiel.enums;

public enum TipoDeServico {
    CASTRACAO("Castração"),
    PROCEDIMENTO("Procedimento, Ortopedia, Banho e tosa, aparar unhas, vacinação, vermifugação"),
    EXTRACAO("Extração de dentes"),
    CUIDADOS_OPERATORIOS("Cuidos pré e pós cirurgicos, alimentação, medicamentos"),
    OUTRA("Outros");

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
