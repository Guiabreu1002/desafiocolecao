import java.util.LinkedList;

public class questao14 {
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(1);
        link.add(2);
        link.add(3);
        link.add(4);
        link.add(5);

        while(!link.isEmpty()){
            System.out.println(link);
            link.poll();

        }

    }
}
