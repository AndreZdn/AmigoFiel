package br.com.AmigoFiel.model;

public class Tutor {
    private final String nome;
    private final String cpf;
    private final String endereco;
    private final String email;
    private final String telefone;


    public Tutor(
            String nome,
            String cpf,
            String endereco,
            String email,
            String telefone
    ) {
        if (nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        if (telefone == null || telefone.isBlank())
            throw new IllegalArgumentException("Telefone inválido.");
        if (email == null || !email.contains("@"))
            throw new IllegalArgumentException("E-mail inválido.");
        if (endereco == null || endereco.isBlank())
            throw new IllegalArgumentException("Endereco inválido.");
        if (cpf == null || cpf.isBlank())
            throw new IllegalArgumentException("Cpf inválido.");


        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }
    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}
