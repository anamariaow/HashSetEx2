import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        setColori();
    }
    public static void setColori() {
        Set<String> colori = new HashSet<>(Arrays.asList("rosso", "bianco", "nero"));

        colori.add("viola");

        for (String colore : colori) {
           System.out.println(colore);
            if (colore.equals("viola")) {
                System.out.println("il nuovo colore è stato aggiunto");
            }
        }
    }
}

//per stampare in ordine: ... = new LinkedHashSet<>(Arrays...