import java.util.LinkedHashMap;
import java.util.Map;

public class questao18 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> mapa = new LinkedHashMap<>();
        mapa.put("Guilherme", 21);
        mapa.put("Caze", 18);
        mapa.put("Rene", 37);
        mapa.put("Pedro", 24);
        mapa.put("Peba", 10);

        System.out.println("Mapa: " + mapa);

        mapa.remove("Guilherme");

        System.out.println("Mapa sem o primeiro elemento: " + mapa);
    }
}
