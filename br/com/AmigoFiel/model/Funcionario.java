package br.com.AmigoFiel.model;

import br.com.AmigoFiel.enums.Cargo;
import br.com.AmigoFiel.enums.Especializacao;

public class Funcionario {
    private final String nome;
    private final Cargo cargo;
    private final Especializacao especializacao;
    private final Double salario;

    public Funcionario(
            String nome,
            Cargo cargo,
            Especializacao especializacao,
            Double salario
    ) {

        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (salario > 0)
            throw new IllegalArgumentException("salario inválido.");



        this.nome = nome;
        this.cargo = cargo;
        this.especializacao = especializacao;
        this.salario = salario;
    }
}
