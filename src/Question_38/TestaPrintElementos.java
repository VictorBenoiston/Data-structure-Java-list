package Question_38;

public class TestaPrintElementos {
    public static void main(String[] args) {
        PrintElementos<Integer> exibir = new PrintElementos<>();

//        // Exibindo um objeto Integer
        Integer num = 10;
        exibir.exibirObjeto(num); // saída: 10

//         Exibindo um vetor de String
        Integer[] idades = {21,10,24, 25, 30};
        exibir.exibirVetor(idades); // saída: [João, Maria, José]
    }
}
