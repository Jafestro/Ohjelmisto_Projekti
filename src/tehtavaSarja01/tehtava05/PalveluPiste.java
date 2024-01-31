package tehtavaSarja01.tehtava05;

import tehtavaSarja01.tehtava03.Asiakas;
import tehtavaSarja03.tehtava03.Kello;

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
        ArrayList<Integer> aikat = new ArrayList<>();
        while (!jono.isEmpty()) {
            Random r = new Random();
            int aika = r.nextInt(5000) + 1000;
            aikat.add(aika);
            Kello.getInstance().setTime(Kello.getInstance().getTime() + aika);
            Thread.sleep(aika);
            Asiakas a = poistaJonosta();
            long palveluAika = Kello.getInstance().getTime() - a.getAloitusaika();
            System.out.println(a.getId() + ")" + "Asiakkaan palvelu kesti " + palveluAika + " units of time.");
        }
        return aikat;
    }
}
