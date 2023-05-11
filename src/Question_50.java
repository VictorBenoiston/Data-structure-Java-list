import java.util.*;

public class Question_50 {
    public static void main(String[] args) {
        final int NUM_CIDADES = 8;

        // Matriz que armazena as distâncias entre as cidades.
        /* Pesquisei, e tinham algumas maneiras de utilizar essas distâncias, normalmente cedidas por
         APIs, e teriamos que utilizar conceitos da algebra linear, utilizando coordenadas XY.
         Aqui, optei por utilziar uma matriz adjacência. Onde cada linha representa uma cidade
         de origem, e cada linha, uma cidade destino. Se a distância entre duas cidades for 0,
         significa que não estão conectadas diretamente. Cada linha é uma distância da próxima cidade.
         A cada conexão direta, +1 de grau.*/

        int[][] distancias = new int[][] {
                {0, 2, 4, 1, 0, 2, 1, 0},
                {2, 0, 0, 3, 0, 4, 4, 0},
                {5, 0, 0, 2, 7, 5, 4, 1},
                {1, 3, 2, 0, 1, 5, 0, 2},
                {0, 0, 4, 1, 0, 0, 1, 2},
                {1, 0, 0, 2, 3, 1, 4, 4},
                {1, 0, 0, 2, 3, 2, 1, 1},
                {0, 2, 0, 1, 1, 1, 0, 0},
        };

        int[] distanciasParaCidadeInicial = new int[NUM_CIDADES];
        Arrays.fill(distanciasParaCidadeInicial, -1);
        distanciasParaCidadeInicial[0] = 0;

        Queue<Integer> fila = new LinkedList<>();
        fila.add(0);

        while (!fila.isEmpty()) {
            int cidadeAtual = fila.poll();

            for (int cidadeVisitada = 0; cidadeVisitada < NUM_CIDADES; cidadeVisitada++) {
                int distancia = distancias[cidadeAtual][cidadeVisitada];

                if (distancia > 0 && distanciasParaCidadeInicial[cidadeVisitada] == -1) {
                    distanciasParaCidadeInicial[cidadeVisitada] = distanciasParaCidadeInicial[cidadeAtual] + distancia;
                    fila.add(cidadeVisitada);
                }
            }
        }

        for (int i = 0; i < NUM_CIDADES; i++) {
            System.out.println("Distância da cidade 0 para a cidade " + i + ": " + distanciasParaCidadeInicial[i]);
        }
        System.out.println("Onde a cidade 0 é a imagem de entrada.");

    }
}
