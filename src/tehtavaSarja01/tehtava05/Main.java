package tehtavaSarja01.tehtava05;

import tehtavaSarja01.tehtava03.Asiakas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PalveluPiste palveluPiste = new PalveluPiste();
        System.out.print("to How many customers you want to serve today?  >>>>");
        int customerSize = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerSize; i++) {
            palveluPiste.lisaaJonoon(new Asiakas());
        }
        try {
            palveluPiste.palvele();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
