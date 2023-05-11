package Question_41;

import java.util.*;

public class DequeGeneric<T> {
    public static void main(String[] args) {
        // LinkedList com Generic (deque)
        Deque<String> cargosDeComissao = new LinkedList<>();
        cargosDeComissao.add("Roberto");
        cargosDeComissao.addFirst("Segundo");
        cargosDeComissao.addLast("Igor");
        cargosDeComissao.addLast("Julia");
        System.out.println("Seguindo as orientações do prefeito, " +
                "os cargos de comissão são (LinkedList (Deque)): " + cargosDeComissao);
    }
}
