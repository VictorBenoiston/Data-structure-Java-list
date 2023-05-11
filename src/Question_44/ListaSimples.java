package Question_44;

public class ListaSimples<T> {

    public Node<T> inicio;
    public Node<T> fim;
    public int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void adicionarInicio(T valor) {
        Node<T> novoNode = new Node<T>(valor);
        if (this.tamanho == 0) {
            this.fim = novoNode;
        }
        novoNode.setProximo(this.inicio);
        this.inicio = novoNode;
        this.tamanho++;
    }

    public void adicionarFim(T valor) {
        Node<T> novoNode = new Node<T>(valor);
        if (this.tamanho == 0) {
            this.inicio = novoNode;
        } else {
            this.fim.setProximo(novoNode);
        }
        this.fim = novoNode;
        this.tamanho++;
    }

    public void removerInicio() {
        if (this.tamanho != 0) {
            this.inicio = this.inicio.getProximo();
            this.tamanho--;
            if (this.tamanho == 0) {
                this.fim = null;
            }
        }
    }

    public void removerFim() {
        if (this.tamanho != 0) {
            if (this.tamanho == 1) {
                this.inicio = null;
                this.fim = null;
            } else {
                Node<T> atual = this.inicio;
                while (atual.getProximo() != this.fim) {
                    atual = atual.getProximo();
                }
                atual.setProximo(null);
                this.fim = atual;
            }
            this.tamanho--;
        }
    }

    public void imprimirLista() {
        if (this.tamanho != 0) {
            Node<T> atual = this.inicio;
            while (atual != null) {
                System.out.print(atual.getValor() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }
    }

    private class Node<T> {

        private T valor;
        private Node<T> proximo;

        public Node(T valor) {
            this.valor = valor;
            this.proximo = null;
        }

        public T getValor() {
            return valor;
        }

        public void setValor(T valor) {
            this.valor = valor;
        }

        public Node<T> getProximo() {
            return proximo;
        }

        public void setProximo(Node<T> proximo) {
            this.proximo = proximo;
        }
    }

}

