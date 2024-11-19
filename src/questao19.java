import java.util.ArrayList;

public class questao19 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        lista1.add(10);
        lista1.add(20);
        lista1.add(30);

        lista2.add(40);
        lista2.add(50);
        lista2.add(60);

        lista1.addAll(lista2);

        System.out.println(lista1);
    }
}
