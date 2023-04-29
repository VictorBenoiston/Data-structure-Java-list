package Question_39;

public class Pessoa {
    public String nome;
    public int idade;
    public String sexo;


    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
    }
}
