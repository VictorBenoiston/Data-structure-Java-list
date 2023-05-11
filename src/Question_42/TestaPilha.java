package Question_42;

public class TestaPilha {
    public static void main(String[] args) {
        Pilha<Integer> pilhaEx = new Pilha<>(10);

        pilhaEx.empilhar(23);
        pilhaEx.empilhar(49);
        pilhaEx.empilhar(11);
        pilhaEx.empilhar(20);
        pilhaEx.empilhar(1);
        pilhaEx.empilhar(99); // quantidade elementos = 6
        System.out.println("Topo da pilha: " + pilhaEx.topo());

        pilhaEx.desempilhar();
        pilhaEx.desempilhar(); // quantidade elementos = 4
        System.out.println("Topo da pilha: " + pilhaEx.topo());

        pilhaEx.empilhar(8);
        pilhaEx.empilhar(10);
        pilhaEx.empilhar(9);
        pilhaEx.empilhar(38);
        pilhaEx.empilhar(39);
        pilhaEx.empilhar(40); // quantidade elementos = 10
        pilhaEx.empilhar(20); // A pilha está cheia, vai dar erro.
        System.out.println("Topo da pilha: " + pilhaEx.topo());

        // Mostrar a pilha na tela.
        while (!pilhaEx.isVazia()) {
            System.out.println(pilhaEx.desempilhar());
        }
    }
}
