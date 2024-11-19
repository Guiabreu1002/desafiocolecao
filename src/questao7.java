import java.util.HashSet;

public class questao7 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(5);
        hash.add(10);
        hash.add(15);
        hash.add(20);
        hash.add(25);

        if (hash.contains(15)) {
            System.out.println("O numero 15 esta presente");
        }else{
            System.out.println("O numero 15 não esta presente");
        }

    }
}
