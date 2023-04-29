package Question_31;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;



public class Question_32 {
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

        try {
            FileWriter writer = new FileWriter("outputQ32.csv");
            writer.write("Pessoas cadastradas: \n");
            for (Pessoa pessoa : pessoas) {
                writer.write("\n" + "-----------------------" + "\n");
                writer.write("CPF: " + pessoa.getCpf() + "\n");
                writer.write("Nome: " + pessoa.getNome() + "\n");
                writer.write("Idade: " + pessoa.getIdade() + "\n");
                writer.write("Sexo: " + pessoa.getSexo() + "\n");
                writer.write("Peso: " + pessoa.getPeso() + "\n");
                writer.write("Altura: " + pessoa.getAltura());
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Erro ao salvar o resultado em outputQ32.csv: " + e.getMessage());
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

        System.out.println("Resultado salvo em outputQ32.csv.");
        }
    }
