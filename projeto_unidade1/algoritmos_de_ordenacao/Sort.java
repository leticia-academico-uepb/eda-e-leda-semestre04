package projeto_unidade1.algoritmos_de_ordenacao;

public class Sort {

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    Utilitarios.swap(vetor, j, j + 1);
                }
            }

            // Utilitarios.imprimirVetor(vetor, n);
        }
    }

    public static void optimizedBubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean swapped;
        do {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    Utilitarios.swap(vetor, j, j + 1);
                    swapped = true;
                }
            }
            n--;

            // Utilitarios.imprimirVetor(vetor, n);
        } while (swapped);
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        int min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[min] > vetor[j]) {
                    min = j;
                }
            }
            Utilitarios.swap(vetor, i, min);
            // Utilitarios.imprimirVetor(vetor, n);
        }
    }

    public static void stableSelectionSort(int[] vetor) {
        int n = vetor.length;
        int min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[min] > vetor[j]) {
                    min = j;
                }
            }

            int k = vetor[min];
            for (int j = min; j > i; j--) {
                vetor[j] = vetor[j - 1];
            }
            vetor[i] = k;
            // Utilitarios.imprimirVetor(vetor, n);
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int j = 1; j < n; j++) {
            int key = vetor[j];
            int i = j - 1;
            while (i >= 0 && vetor[i] > key) {
                vetor[i + 1] = vetor[i];
                i--;
            }
            vetor[i + 1] = key;
            // Utilitarios.imprimirVetor(vetor, n);
        }
    }

    public static int partition(int[] vetor, int l, int r) {
        int p = vetor[l];
        int i = l + 1;
        int j = r;

        while (i <= j) {
            if (vetor[i] <= p) {
                i++;
            } else if (vetor[j] > p) {
                j--;
            } else {
                Utilitarios.swap(vetor, i, j);
            }
        }

        Utilitarios.swap(vetor, l, j);
        return j;
    }

    public static void quickSort(int[] vetor, int l, int r) {
        if (l < r) {
            int p = partition(vetor, l, r);
            quickSort(vetor, l, p - 1);
            quickSort(vetor, p + 1, r);
        }
    }

    public static void quickSortShuffle(int[] vetor) {
        Utilitarios.shuffleVetor(vetor);
        quickSort(vetor, 0, vetor.length - 1);
    }

    public static void countingSort(int[] vetorA, int[] vetorB) {
        int n = vetorA.length;
        int k = n + 1;

        int[] vetorC = new int[k];

        for (int j = 0; j < n; j++) {
            vetorC[vetorA[j]]++;
        }

        for (int i = 1; i < k; i++) {
            vetorC[i] += vetorC[i - 1];
        }

        for (int j = n - 1; j >= 0; j--) {
            vetorB[vetorC[vetorA[j]] - 1] = vetorA[j];
            vetorC[vetorA[j]]--;
        }
    }

}
