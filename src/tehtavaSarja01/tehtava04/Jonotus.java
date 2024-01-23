package tehtavaSarja01.tehtava04;

import tehtavaSarja01.tehtava03.Asiakas;

import java.util.LinkedList;
import java.util.Scanner;

public class Jonotus {

    private static LinkedList<Asiakas> asiakkaita = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Lisää asiakas jonoon");
            System.out.println("2. Poista aisakas jonosta");

            String choice = sc.nextLine();
            if (choice.equals("1")) {
                lisaaAsiakas(new Asiakas());
            } else if (choice.equals("2")) {
                poistaAsiakas();
            }
        }
    }

    public static void lisaaAsiakas(Asiakas a) {
        a.setAloitusaika(System.currentTimeMillis());
        asiakkaita.add(a);
        System.out.println("Asiakas lisätty jonoon");
        System.out.println("Asiakkaita jonossa: " + asiakkaita.size());
    }

    public static void poistaAsiakas() {
        Asiakas a = asiakkaita.poll();
        if (a != null) {
            a.setLopetusaika(System.currentTimeMillis());
            System.out.printf("%s. Asiakkaan jonossa kuluttuma aika %sms\n", a.getId(), a.getLopetusaika() - a.getAloitusaika());
        }
    }
}