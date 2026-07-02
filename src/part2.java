import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class part2 {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("Lada Granta");
        list.add("BMW X5");
        list.add("Lada Granta");
        list.add("Tesla Model S");
        list.add("BMW X5");
        list.add("Tesla Model S");

        for (int i = 0; i<list.size(); i++){
            if (list.get(i).contains("Tesla")){
                list.set(i, "ELECTRO_CAR");
            }
        }

        Set<String> uniquelist = new HashSet<>(list);
        List<String> sortedlist = new ArrayList<>(uniquelist);
        sortedlist.sort(Collections.reverseOrder());
        Set<String> finallist = new LinkedHashSet<>(sortedlist);
        System.out.println(finallist);
        

    }
}