package Question_42;

public class Pilha<T> {
    public final int capacidade;
    public final T[] elementos;
    public int topo;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
        this.topo = -1;
    }

    public boolean isVazia() {
        return this.topo == -1;
    }

    public boolean isCheia() {
        return this.topo == this.capacidade - 1;
    }

    public void empilhar(T elemento) {
        if (isCheia()) {
            System.out.println("Capacidade excedidade. A pilha está cheia.");
            return;
        }
        this.elementos[++topo] = elemento;
    }

    public T desempilhar() {
        if (isVazia()) {
            System.out.println("Não há elementos para desempilhar. A pilha está vazia.");
            return null;
        }
        T elemento = this.elementos[topo];
        this.elementos[topo--] = null;
        return elemento;
    }

    public T topo() {
        if (isVazia()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return this.elementos[topo];
    }
}

