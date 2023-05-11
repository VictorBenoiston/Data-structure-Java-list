package Question_45;

public class TestaListaDupla {

    public static void main(String[] args) {
        ListaDupla<Integer> idades = new ListaDupla<>();

        idades.inserirInicio(25);
        idades.inserirInicio(20);
        idades.inserirInicio(10);
        idades.inserirInicio(9);

        // Lista atual: [9, 10, 20, 25];
        idades.imprimir();

        idades.inserirFim(30);
        idades.inserirFim(35);
        idades.inserirFim(50);
        idades.inserirInicio(7);

        // Lista atual: [7, 9, 10, 20, 25, 30, 35, 50];
        idades.imprimir();

        idades.removerFim();
        idades.removerFim();

        // Lista atual: [7, 9, 10, 20, 25, 30]
        idades.imprimir();

        idades.removerInicio();
        idades.removerInicio();

        // Lista atual: [10, 20, 25, 30]
        idades.imprimir();
    }
}
