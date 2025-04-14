package br.com.AmigoFiel.model;


public class Animal {
    private final String nome;
    private final String especie;
    private final String raca;
    private final int idade;
    private final int peso;
    private final Tutor tutor;




    public Animal(
            String nome,
            String especie,
            String raca,
            int peso,
            int idade,
            Tutor tutor
    ) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (especie == null || especie.isBlank())
            throw new IllegalArgumentException("Especie inválido.");
        if (raca == null || !raca.isBlank())
            throw new IllegalArgumentException("Raca inválido.");
        if (tutor == null)
            throw new IllegalArgumentException("Tutor inválido.");
        if (peso  < 0)
            throw new IllegalArgumentException("Peso inválido.");
        if (idade  < 0)
            throw new IllegalArgumentException("Idade inválido.");


        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.peso = peso;
        this.idade = idade;
        this.tutor = tutor;

    }
}

