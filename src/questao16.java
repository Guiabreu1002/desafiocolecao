import java.util.TreeSet;

public class questao16 {
    public static void main(String[] args) {
        TreeSet<Integer> lista = new TreeSet<>();
        lista.add(50);
        lista.add(10);
        lista.add(30);
        lista.add(20);
        lista.add(50);
        lista.add(40);

        for (int item : lista) {
            System.out.println(item);
        }
    }
}
