import java.util.HashMap;

public class questao11 {
    static class Pessoa {
        private String nome;
        private int idade;

        Pessoa (String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
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
        HashMap<String, Pessoa> hash = new HashMap<>();

        Pessoa pessoa1 = new Pessoa("Guilherme", 21);
        Pessoa pessoa2 = new Pessoa("Caze", 18);
        Pessoa pessoa3 = new Pessoa("Rene", 37);

        hash.put(pessoa1.nome, pessoa1);
        hash.put(pessoa2.nome, pessoa2);
        hash.put(pessoa3.nome, pessoa3);

        System.out.println(hash);

    }
}
