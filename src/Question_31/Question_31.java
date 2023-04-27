package Question_31;

import java.util.Scanner;


public class Question_31 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Quantas pessoas serão cadastradas?: ");
            int qtPessoas = scanner.nextInt();

            Pessoa[] pessoas = new Pessoa[qtPessoas];

        for (int i = 0; i < qtPessoas; i++) {
            System.out.println("Pessoa " + (i + 1));
            System.out.print("CPF: ");
            String cpf = scanner.next();
            System.out.print("Nome: ");
            String nome = scanner.next();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            pessoas[i] = new Pessoa(cpf, nome, idade, sexo, peso, altura);
        }

        System.out.println("Pessoas cadastradas: ");
            for (int c = 0; c < qtPessoas; c++){
                System.out.println("Pessoa " + c +
                        "\nCPF: " + pessoas[c].getCpf() + "\n" +
                        "Nome: " + pessoas[c].getNome() + "\n" +
                        "Idade: " + pessoas[c].getIdade() + "\n" +
                        "Sexo: " + pessoas[c].getSexo() + "\n" +
                        "Peso: " + pessoas[c].getPeso() + "\n" +
                        "Altura: " + pessoas[c].getAltura() + "\n" +
                        "IMC: " + pessoas[c].getImc() + "\n");
            }
        }
    }
