package custo_iteracao_e_recursao;

public class Iterativa {

    public static int buscaLinear(int[] vetorA, int valorBuscado) {
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }

    public static int buscaBinaria(int[] vetorA, int valorBuscado) {
        int inicio = 0;
        int fim = vetorA.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetorA[meio] == valorBuscado) {
                return meio;
            }

            if (vetorA[meio] < valorBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

}
