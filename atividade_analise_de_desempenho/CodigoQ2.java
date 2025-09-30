import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CodigoQ2 {

    public static void main(String[] args) {

        // **fazer alterações abaixo desta linha**
        final int TOTAL_DE_ELEMENTOS = 100000; // valor mímino
        List<Integer> lista = new ArrayList<>(); // ArrayList ou LinkedList
        // **fazer alterações acima desta linha**

        long antes, depois, tempo;

        antes = System.nanoTime(); // marco de antes do processo (início)
        for (int i = 1; i <= TOTAL_DE_ELEMENTOS; i++) {
            // uso do argumento 0 para adicionar elementos no início da lista:
            lista.add(0, i);
        }
        depois = System.nanoTime(); // marco do depois do processo (final)

        tempo = depois - antes;

        // apresentação do tempo, inicialmente em nano, convertido para segundos:
        System.out.println(tempo / Math.pow(10, 9));
    }
}
