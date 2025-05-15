package br.com.AmigoFiel;

import br.com.AmigoFiel.model.Agendamento;
import br.com.AmigoFiel.model.Animal;
import br.com.AmigoFiel.model.Tutor;
import java.util.*;

public class AmigoFiel {
    private static Scanner scanner = new Scanner(System.in);;
    private static List<Tutor> tutores = new ArrayList<>();
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        List<Agendamento> agendamentos = new ArrayList<>();


        boolean continuar = true;
        while (continuar) {
            System.out.println("\n1. Cadastrar animal");
            System.out.println("2. Listar animais");
            System.out.println("3. Ver detalhes de um animal");
            System.out.println("4. Cadastrar Agendamento");
            System.out.println("5. Listar Agendamento");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> animais.add(cadastrarAnimal());
                case 2 -> listarAnimais(animais);
                case 3 -> verDetalhesAnimais(animais);
                case 4 -> cadastrarAgendamento(agendamentos);
                case 5 -> listarAgendamento(agendamentos);
                case 6 -> continuar = false;
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }




    public static Animal cadastrarAnimal() {
        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a especie do animal: ");
        String especie = scanner.nextLine();

        System.out.print("Digite a raca do animal: ");
        String raca = scanner.nextLine();

        System.out.print("Digite a idade do animal: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o peso do animal: ");
        int peso = scanner.nextInt();
        scanner.nextLine();

        Tutor tutor = cadastrarTutor();


        System.out.println("Animal cadastrado com sucesso!");

        return new Animal(nome, especie, raca, peso, idade, tutor);
    }

    private static Tutor cadastrarTutor() {
        System.out.print("Tutor já cadastrado? (s/n): ");
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            if (tutores.isEmpty()) {
                System.out.println("Nenhum tutor cadastrado ainda!");
            } else {
                System.out.println("Tutores disponíveis:");
                for (int i = 0; i < tutores.size(); i++) {
                    System.out.println(i + " - " + tutores.get(i).getNome());
                }

                System.out.print("Digite o número do tutor: ");
                int index = Integer.parseInt(scanner.nextLine());

                if (index >= 0 && index < tutores.size()) {
                    return tutores.get(index);
                } else {
                    System.out.println("Índice inválido. Cadastrando novo tutor.");
                }
            }
        }


        System.out.println("Nome do tutor: ");
        String nome = scanner.nextLine();

        System.out.println("CPF do tutor: ");
        String cpf = scanner.nextLine();

        System.out.println("Endereço do tutor: ");
        String endereco = scanner.nextLine();

        System.out.println("Email do tutor: ");
        String email = scanner.nextLine();

        System.out.println("Telefone do tutor: ");
        String telefone = scanner.nextLine();

        Tutor novoTutor = new Tutor(nome, cpf, endereco, email, telefone);
        tutores.add(novoTutor); // adiciona na lista
        return novoTutor;
    }
    private static void listarAnimais(List<Animal> animais) {
        if (animais.isEmpty()) {
            System.out.println("Nenhum animal cadastrado.");
            return;
        }

        System.out.println("\n=== Lista de Animais ===");
        for (int i = 0; i < animais.size(); i++) {
            Animal a = animais.get(i);
            System.out.println(i + " - " + a.getEspecie() + ": " + a.getNome() + " / Tutor: " + a.getTutor().getNome());
        }
    }

    private static void verDetalhesAnimais(List<Animal> animais) {
        listarAnimais(animais);
        if (animais.isEmpty()) return;

        System.out.print("Digite o número do animal: ");
        int index = scanner.nextInt();
        scanner.nextLine();

        if (index < 0 || index >= animais.size()) {
            System.out.println("Número inválido.");
            return;
        }


        Animal a = animais.get(index);
        System.out.println("\n--- Detalhes do Animal ---");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Espécie: " + a.getEspecie());
        System.out.println("Raça: " + a.getRaca());
        System.out.println("Idade: " + a.getIdade());
        System.out.println("Peso: " + a.getPeso());
        System.out.println("Tutor: " + a.getTutor());
    }

    private static void cadastrarAgendamento(List<Agendamento> agendamentos) {
        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();
    }


    private static void listarAgendamento(List<Agendamento> agendamentos) {
    }
}
