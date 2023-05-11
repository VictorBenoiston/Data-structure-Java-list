package Question_43;

public class TestaFila {
    public static void main(String[] args) {
        Fila<String> filaEx = new Fila<>(8);

        filaEx.adicionarElemento("Romario");
        filaEx.adicionarElemento("Dudu");
        filaEx.adicionarElemento("Liomar");
        filaEx.adicionarElemento("Karen");

        // Após adicionar 4 elementos
        System.out.println("A fila tem atualmente: " + filaEx.tamanhoAtual + " elementos");
        System.out.println("O primeiro nome da lista é: " + filaEx.primeiro());
        System.out.println("--------------");

        // Retirando o primeiro elemento
        filaEx.retirarElemento();
        System.out.println("A fila tem atualmente: " + filaEx.tamanhoAtual + " elementos");
        System.out.println("O primeiro nome da lista é: " + filaEx.primeiro());

        // Percebe-se que foi retirado o primeiro elemento da lista.
        System.out.println("--------------");


        filaEx.limpar();

        // Após limpar a lista.
        System.out.println("Após limpar a lista:");
        System.out.println("A fila tem atualmente: " + filaEx.tamanhoAtual + " elementos");
    }
}
