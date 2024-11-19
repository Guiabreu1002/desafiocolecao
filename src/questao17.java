import java.util.HashSet;
import java.util.TreeSet;

public class questao17 {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(5);
        hash.add(2);
        hash.add(9);
        hash.add(6);
        hash.add(7);
        //O hash pode variar a ordem
        System.out.println("HashSet" + hash);

        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(5);
        tree.add(2);
        tree.add(9);
        tree.add(6);
        tree.add(7);
        //O tree é sempre ordenado
        System.out.println("TreeSet" + tree);

    }
}
