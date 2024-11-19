import java.util.HashSet;

public class questao6 {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<>();
        hash.add("Marizópolis");
        hash.add("Cajazeiras");
        hash.add("Sousa");
        hash.add("Ipaumirim");
        hash.add("Nazarezinho");

        for (String item : hash) {
            System.out.println(item);
        }

    }
}
