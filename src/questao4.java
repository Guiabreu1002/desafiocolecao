import java.util.ArrayList;
import java.util.Collections;

public class questao4 {
    public static void main(String[] args) {
        ArrayList<Integer> organizar = new ArrayList<>();
        organizar.add(14);
        organizar.add(13);
        organizar.add(12);
        organizar.add(11);
        organizar.add(10);

        Collections.sort(organizar);
        System.out.println(organizar);


    }
}
