package tehtavaSarja01.tehtava06;

import tehtavaSarja01.tehtava03.Asiakas;
import tehtavaSarja01.tehtava05.PalveluPiste;

import java.util.ArrayList;
import java.util.Scanner;

public class KeskiAika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PalveluPiste palveluPiste = new PalveluPiste();
        System.out.println("How many customers u want to serve today? >>> ");
        int customerSize = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < customerSize; i++) {
            palveluPiste.lisaaJonoon(new Asiakas());
        }
        try {
            ArrayList<Integer> aikat = palveluPiste.palvele();
            System.out.println("Average time spent to service is " + getAverageTime(aikat) + "ms");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static long getAverageTime(ArrayList<Integer> aikat) {
        Integer sum = 0;
        for (Integer aika : aikat) {
            sum += aika;
        }
        return sum/ aikat.size();
    }
}
