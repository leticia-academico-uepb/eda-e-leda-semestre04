package projeto_unidade1;

public class Estudante implements Comparable<Estudante> {
    private static int qtdEstudantes;
    private String nome;
    private int nota;
    private int matricula;

    public Estudante(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
        qtdEstudantes++;
        this.matricula = qtdEstudantes;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Estudante{" + "nome='" + nome + '\'' + ", nota=" + nota + ", matricula=" + matricula
                + '}';
    }

    @Override
    public int compareTo(Estudante outro) {
        // Comparar pela nota (ordem decrescente)
        if (this.nota > outro.nota)
            return -1;
        if (this.nota < outro.nota)
            return 1;

        // Empate na nota: comparar pelo nome (ordem alfabética)
        int nomeComparacao = this.nome.compareToIgnoreCase(outro.nome);
        if (nomeComparacao != 0)
            return nomeComparacao;

        // Empate total: comparar pela matricula (ordem crescente)
        if (this.matricula < outro.matricula)
            return -1;
        else
            return 1;
    }
}
