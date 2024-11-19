import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class questao13 {
    static class Pessoa {
        private String nome;
        private int idade;

        Pessoa (String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
        public int getIdade () {
            return this.idade;
        }

        @Override
        public String toString() {
            return "Pessoa{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }
    public static void main(String[] args) {
        ArrayList<Pessoa> lista = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Guilherme", 21);
        Pessoa pessoa2 = new Pessoa("Caze", 18);
        Pessoa pessoa3 = new Pessoa("Pedro", 24);

        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);

        Collections.sort(lista, Comparator.comparingInt(Pessoa::getIdade));

        for (Pessoa item : lista) {
            System.out.println(item);
        }


    }
}
