package tehtavaSarja02.tehtava03;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
public class IkaJarjestelma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Lahto data
        HashMap<Integer, Integer> ikat = new HashMap<>();
        ikat.put(23,4);
        ikat.put(20,7);
        ikat.put(30,5);
        ikat.put(25,9);
        ikat.put(22,2);
        ikat.put(37,1);
        ikat.put(19,3);

        int kokonaismaara = ikat.values().stream().mapToInt(Integer::intValue).sum();

        // Ikäryhmien jakautuminen prosentteina
        // ja jakaa 1000 kpl ryhma samalla tavalla
        for (Map.Entry<Integer, Integer> entry : ikat.entrySet()) {
            int age = entry.getKey();
            int esiintymismaara = entry.getValue();
            double prosenttiosuus = (esiintymismaara / (double) kokonaismaara) * 100;
            int opiskelijaMaara = (int) Math.round(1000 * ((prosenttiosuus)/100));
            System.out.printf("%s vuotias: %s kpl\n", age, opiskelijaMaara);
        }
    }
}
