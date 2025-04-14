package br.com.AmigoFiel.model;

import java.time.LocalDateTime;

public class Agendamento  {
    private final LocalDateTime dataHora;
    private final Animal animal;
    private final Servicos servicos;
    private final Funcionario funcionario;

    public Agendamento(
            LocalDateTime dataHora,
            Animal animal,
            Servicos servicos,
            Funcionario funcionario
    ) {
        if (dataHora == null)
            throw new IllegalArgumentException("tipoDeServico inválido.");
        if (funcionario == null)
            throw new IllegalArgumentException("funcionario inválido.");
        if (animal == null)
            throw new IllegalArgumentException("Endereco inválido.");
        if (servicos == null)
            throw new IllegalArgumentException("servicos inválido.");



        this.dataHora = dataHora;
        this.animal = animal;
        this.servicos = servicos;
        this.funcionario = funcionario;
    }
}
