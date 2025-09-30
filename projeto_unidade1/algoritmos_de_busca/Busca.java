package projeto_unidade1.algoritmos_de_busca;

public class Busca {

    public static int linearIterativa(Estudante[] vetor, int matriculaBuscada) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getMatricula() == matriculaBuscada) {
                return i;
            }
        }
        return -1;
    }

}
