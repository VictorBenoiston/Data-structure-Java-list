package Question_38;

import java.util.Arrays;

public class PrintElementos<T> {

    public void exibirObjeto(T objeto) {
        System.out.println(objeto.toString());
    }

    public void exibirVetor(T[] vetor) {
        for (T elemento : vetor) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}



