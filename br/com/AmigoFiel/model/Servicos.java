package br.com.AmigoFiel.model;

import br.com.AmigoFiel.enums.TipoDeServico;

public class Servicos {
    private final TipoDeServico tipoDeServico;
    private final Funcionario funcionario;
    private final Tutor tutor;
    private final Double preco;

    public Servicos(
            TipoDeServico tipoDeServico,
            Funcionario funcionario,
            Tutor tutor,
            Double preco
    ) {
        if (tipoDeServico == null)
            throw new IllegalArgumentException("tipoDeServico inválido.");
        if (funcionario == null)
            throw new IllegalArgumentException("funcionario inválido.");
        if (tutor == null)
            throw new IllegalArgumentException("Endereco inválido.");
        if (preco < 0)
            throw new IllegalArgumentException("preço inválido.");

        this.tipoDeServico = tipoDeServico;
        this.funcionario = funcionario;
        this.tutor = tutor;
        this.preco = preco;
    }
}
