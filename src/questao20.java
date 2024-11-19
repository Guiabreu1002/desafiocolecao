import java.util.HashMap;

public class questao20 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "Domingo");
        hash.put(2, "Segunda");
        hash.put(3, "Terça");
        hash.put(4, "Quarta");
        hash.put(5, "Quinta");

        hash.put(3, "Quarta");

        System.out.println(hash);
    }
}
