package Question_43;

public class Fila<T> {
    public T[] elementos;
    public int inicio;
    public int fim;
    public int tamanhoAtual;
    public int capacidade;

    public Fila(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanhoAtual = 0;
    }

    public void adicionarElemento(T elemento) {
        if (tamanhoAtual == capacidade) {
            System.out.println("Capacidade excedida. A fila está cheia!");
            return;
        }
        fim = (fim + 1) % capacidade;
        elementos[fim] = elemento;
        tamanhoAtual++;
    }

    public T retirarElemento() {
        if (tamanhoAtual == 0) {
            System.out.println("A fila está vazia!");
            return null;
        }
        T elemento = elementos[inicio];
        elementos[inicio] = null;
        inicio = (inicio + 1) % capacidade;
        tamanhoAtual--;
        return elemento;
    }

    public T primeiro() {
        if (tamanhoAtual == 0) {
            System.out.println("A fila está vazia!");
            return null;
        }
        return elementos[inicio];
    }

    public int tamanhoAtual() {
        return tamanhoAtual;
    }

    public boolean vazia() {
        return tamanhoAtual == 0;
    }

    public void limpar() {
        this.elementos = (T[]) new Object[capacidade];
        this.inicio = 0;
        this.fim = -1;
        this.tamanhoAtual = 0;
    }
}
