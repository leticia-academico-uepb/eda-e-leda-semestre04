package projeto_unidade1.algoritmos_de_ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Utilitarios {
    public static void imprimirVetor(int[] v, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static int[] geraVetor(int tamanho, TipoVetor tipo) {
        int[] vetor = new int[tamanho]; // 1000

        if (tipo == TipoVetor.ORDENADO) {
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = i;
            }
        } else if (tipo == TipoVetor.INVERSAMENTE_ORDENADO) {
            int j = tamanho;
            for (int i = 0; i < tamanho; i++) {
                vetor[i] = j;
                j--;
            }
        } else {
            List<Integer> lista = new ArrayList<>();
            for (int i = 0; i < tamanho; i++) {
                lista.add(i);
            }

            Collections.shuffle(lista);

            for (int i = 0; i < tamanho; i++) {
                vetor[i] = lista.get(i);
            }
        }
        return vetor;
    }

    public static boolean checaVetorOrdenado(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void swap(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
