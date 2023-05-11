package Question_44;

import Question_43.Fila;

public class TestaListaSimples {
    public static void main(String[] args) {
        ListaSimples<Integer> listaTeste = new ListaSimples();

        listaTeste.adicionarFim(2);
        listaTeste.adicionarFim(4);
        listaTeste.adicionarFim(44);
        listaTeste.adicionarFim(19);
        listaTeste.adicionarInicio(23);

        // Lista atual = [23, 2, 4, 44, 19];
        listaTeste.imprimirLista();

        listaTeste.removerInicio();
        listaTeste.removerFim();

        // Lista atual = [2, 4, 44];

        listaTeste.imprimirLista();
    }
}
