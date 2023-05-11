package Question_41;

import java.util.*;

public class SetsGeneric<T> {
    public static void main(String[] args) {
        // HashSet com Generic
        Set<String> particulas = new HashSet<>();
        particulas.add("Higgs");
        particulas.add("Eletrons");
        particulas.add("Protons");
        particulas.add("Quarks");
        System.out.println("As particulas identificadas foram (Hashset): " + particulas);

        // LinkedHashSet com Generic
        Set<Integer> posicaoX = new LinkedHashSet<>();
        posicaoX.add(12);
        posicaoX.add(2);
        posicaoX.add(19);
        posicaoX.add(281);
        System.out.println("As posicoes em X são (LinkedHashSet): " + posicaoX);

        // TreeSet com Generic
        Set<Double> opacidade = new TreeSet<>();
        opacidade.add(0.1);
        opacidade.add(0.9);
        opacidade.add(0.3);
        opacidade.add(0.7);
        System.out.println("A opacidade das particulas foram (TreeSet): " + opacidade);
    }
}
