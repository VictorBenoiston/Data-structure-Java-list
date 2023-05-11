package Question_41;

import java.util.*;

public class QueueGeneric<T> {
    public static void main(String[] args) {
        // PriorityQueue com Generic
        Queue<String> filaDeCredito = new PriorityQueue<>();
        filaDeCredito.add("Seu José");
        filaDeCredito.add("Dona Maria");
        filaDeCredito.add("Senhora Carla");
        filaDeCredito.add("Seu Brejeiro");
        System.out.println("Seguindo a prioridade da fila de emprestico (PriorityQueue): " + filaDeCredito);

        // LinkedList com Generic
        Queue<Integer> valoresDeCredito = new LinkedList<>();
        valoresDeCredito.add(1901);
        valoresDeCredito.add(290);
        valoresDeCredito.add(3);
        valoresDeCredito.add(30921);
        System.out.println("Os valores de credito liberado são (LinkedList): " + valoresDeCredito);
    }
}
