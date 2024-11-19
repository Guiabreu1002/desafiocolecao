import java.util.ArrayList;

public class questao3 {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<String>();
        frutas.add("maçã");
        frutas.add("banana");
        frutas.add("laranja");
        frutas.add("abacaxi");

        if(frutas.contains("banana")){
            System.out.println("Existe");
        } else {
            System.out.println("Não existe");
        }
    }
}
