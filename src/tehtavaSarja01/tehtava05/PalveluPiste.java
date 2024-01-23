package tehtavaSarja01.tehtava05;

import tehtavaSarja01.tehtava03.Asiakas;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class PalveluPiste {
    private LinkedList<Asiakas> jono;

    public PalveluPiste() {
        jono = new LinkedList<Asiakas>();
    }

    public void lisaaJonoon(Asiakas a) {
        jono.add(a);
    }

    public Asiakas poistaJonosta() {
        return jono.poll();
    }

    public ArrayList<Integer> palvele() throws InterruptedException {
        ArrayList<Integer> aikat = new ArrayList<Integer>();
        while (!jono.isEmpty()) {
            Random r = new Random();
            int aika = r.nextInt(5000) + 1000;
            aikat.add(aika);

            Thread.sleep(aika);
            Asiakas a = poistaJonosta();
            System.out.println(a.getId() + ")" + "Customer's service ended in " + LocalTime.now());
        }
        return aikat;
    }
}
