import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CodigoQ1 {
    public static void main(String[] args) {

        // **fazer alterações abaixo desta linha**
        final int TOTAL_DE_ELEMENTOS = 100000; // valor mímino
        Collection<Integer> lista = new ArrayList<>(); // tipo de estrutura
        // **fazer alterações acima desta linha**

        // marcos de inicio e fim do processamento de adicionar (1) e verificar contains(2)
        long tempo1, tempo2;
        long antes1, antes2, depois1, depois2;

        antes1 = System.nanoTime(); // marco de antes do processo (inicial)
        // processo de adicionar:
        for (int i = 1; i <= TOTAL_DE_ELEMENTOS; i++) {
            lista.add(i);
        }
        depois1 = System.nanoTime(); // marco do depois do processo (final)

        antes2 = System.nanoTime(); // marco de antes do processo (inicial)
        // processo de verificar se contém em todas as posições (do melhor até o pior caso)
        for (int i = 1; i <= TOTAL_DE_ELEMENTOS; i++) {
            lista.contains(i);
        }
        depois2 = System.nanoTime(); // marco do depois do processo (final)

        tempo1 = depois1 - antes1;
        tempo2 = depois2 - antes2;

        // apresentação do tempo, inicialmente em nano, convertido para segundos:
        System.out.println("método add(): " + (tempo1 / Math.pow(10, 9)) + " s");
        System.out.println("método contains(): " + (tempo2 / Math.pow(10, 9)) + " s");
    }
}