import java.util.HashSet;

public class questao5 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(10);
        hash.add(20);
        hash.add(10);
        hash.add(30);
        hash.add(40);

        System.out.println(hash);
    }
}
