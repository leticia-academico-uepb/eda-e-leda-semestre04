package projeto_unidade1.algoritmos_de_busca;

import projeto_unidade1.Estudante;

public class Busca {

    public static int linearIterativa(Estudante[] vetor, int matriculaBuscada) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getMatricula() == matriculaBuscada) {
                return i;
            }
        }
        return -1;
    }

    public static int binariaIterativa(Estudante[] vetor, int matriculaBuscada) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vetor[meio].getMatricula() == matriculaBuscada) {
                return meio;
            }

            if (vetor[meio].getMatricula() < matriculaBuscada) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }

}
