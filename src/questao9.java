import java.util.HashMap;

public class questao9 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<>();
        hash.put("Guilherme", 21);
        hash.put("João", 18);
        hash.put("Pedro Peba", 24);

        if (hash.containsKey("João")) {
            System.out.println(hash.get("João"));
        }
    }
}
