package br.com.AmigoFiel.enums;

public enum Cargo {
    VETERINARIO("Veterinário"),
    AUXILIAR_VETERINARIO("Auxiliar Veterinário"),
    RECEPCIONISTA("Recepcionista"),
    ADMINISTRATIVO("Administrativo"),
    TOSADOR("Tosador"),
    AUXILIAR_DE_LIMPEZA("Auxiliar de Limpeza"),
    ESTAGIARIO("Estagiário"),
    OUTRO("Outro");


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
