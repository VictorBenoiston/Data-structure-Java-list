package Question_41;

    import java.util.*;

    public class ListasGeneric<T> {
        public static void main(String[] args) {
            //ArrayList com Generic
            List<String> nomes = new ArrayList<>();
            nomes.add("Roberto");
            nomes.add("Judite");
            nomes.add("Jenifer");
            nomes.add("Mariah");
            System.out.println("ArrayList: " + nomes);

            //Vector com Generic
            List<Integer> idades = new Vector<>();
            idades.add(10);
            idades.add(51);
            idades.add(38);
            idades.add(23);
            System.out.println("Vector: " + idades);

            // LinkedList com Generic
            List<Double> notas = new LinkedList<>();
            notas.add(1.9);
            notas.add(5.2);
            notas.add(9.1);
            notas.add(7.3);
            System.out.println("LinkedList: " + notas);
        }
    }
