package Question_45;

public class ListaDupla<T> {
    public NoDuplo<T> primeiro;
    public NoDuplo<T> ultimo;
    public int tamanho;

    public ListaDupla() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

//    public boolean vazia() {
//        return (this.tamanho == 0);
//    }

    public int tamanho() {
        return this.tamanho;
    }

    public void inserirInicio(T valor) {
        NoDuplo<T> novoNo = new NoDuplo<T>(valor);
        if (this.tamanho == 0) {
            this.ultimo = novoNo;
        } else {
            this.primeiro.setAnterior(novoNo);
        }
        novoNo.setProximo(this.primeiro);
        this.primeiro = novoNo;
        this.tamanho++;
    }

    public void inserirFim(T valor) {
        NoDuplo<T> novoNo = new NoDuplo<T>(valor);
        if (this.tamanho == 0) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            novoNo.setAnterior(this.ultimo);
        }
        this.ultimo = novoNo;
        this.tamanho++;
    }

    public T removerInicio() {
        if (this.tamanho == 0) {
            return null;
        }
        T valor = this.primeiro.getValor();
        if (this.primeiro == this.ultimo) {
            this.ultimo = null;
        } else {
            this.primeiro.getProximo().setAnterior(null);
        }
        this.primeiro = this.primeiro.getProximo();
        this.tamanho--;
        return valor;
    }

    public T removerFim() {
        if (this.tamanho == 0) {
            return null;
        }
        T valor = this.ultimo.getValor();
        if (this.primeiro == this.ultimo) {
            this.primeiro = null;
        } else {
            this.ultimo.getAnterior().setProximo(null);
        }
        this.ultimo = this.ultimo.getAnterior();
        this.tamanho--;
        return valor;
    }

    public void imprimir() {
        NoDuplo<T> atual = this.primeiro;
        while (atual != null) {
            System.out.print(atual.getValor() + " ");
            atual = atual.getProximo();
        }
        System.out.println();
    }

    public class NoDuplo<T> {
        private T valor;
        private NoDuplo<T> proximo;
        private NoDuplo<T> anterior;

        public NoDuplo(T valor) {
            this.valor = valor;
            this.proximo = null;
            this.anterior = null;
        }

        public T getValor() {
            return valor;
        }

        public void setValor(T valor) {
            this.valor = valor;
        }

        public NoDuplo<T> getProximo() {
            return proximo;
        }

        public void setProximo(NoDuplo<T> proximo) {
            this.proximo = proximo;
        }

        public NoDuplo<T> getAnterior() {
            return anterior;
        }

        public void setAnterior(NoDuplo<T> anterior) {
            this.anterior = anterior;
        }
    }
}
