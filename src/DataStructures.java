import javax.crypto.spec.ChaCha20ParameterSpec;
import java.util.ArrayList;
import java.util.HashMap;

public class DataStructures {
    public static void main(String[] args) {
        ArrayList<String> listCumparaturi = new ArrayList<>();
        listCumparaturi.add("oua");
        listCumparaturi.add("lapte");
        listCumparaturi.add("paine");
        listCumparaturi.add("detergent");
        //listCumparaturi.set(1, "lapte vegetal");
        //listCumparaturi.remove("lapte vegetal"); //sau punem pozitia pe care dorim sa o stergem
        //listCumparaturi.get(1);
        //System.out.println(listCumparaturi.get(1));
        for(String element: listCumparaturi){ //for each
            System.out.println(element);
        }

        System.out.println(listCumparaturi.size());
        System.out.println(listCumparaturi.contains("oua"));

        HashMap <Integer, String> hashMapList = new HashMap<>();
        hashMapList.put(1, "Luni");
        hashMapList.put(2, "Marti");
        hashMapList.put(3, "Miercuri");
        hashMapList.put(5, "Vineri");
        hashMapList.remove(5);
        hashMapList.get(3);
        System.out.println(hashMapList.get(3));
        System.out.println(hashMapList.keySet()); //returneaza toate cheile
        //System.out.println(hashMapList.values()); //returneaza toate valorile
        hashMapList.replace(1, "Luni -modificat");
        System.out.println(hashMapList.values()); //returneaza toate valorile
        System.out.println(hashMapList.entrySet());

    }
}
