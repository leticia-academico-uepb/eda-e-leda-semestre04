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

}
