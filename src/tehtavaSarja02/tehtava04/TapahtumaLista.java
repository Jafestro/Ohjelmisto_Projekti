package tehtavaSarja02.tehtava04;

import java.time.LocalTime;
import java.util.PriorityQueue;
import java.util.Random;

public class TapahtumaLista {
    PriorityQueue<Tapahtuma> tapahtumat;

    public TapahtumaLista(){
        tapahtumat = new PriorityQueue<Tapahtuma>();
    }

    void lisaaTapahtuma(Tapahtuma t) {
        tapahtumat.add(t);
        System.out.println("Tapahtuma lisätty");
    }

    void poistaTapahtuma() throws InterruptedException {
        Random random = new Random();
        Tapahtuma t = tapahtumat.poll();
        assert t != null;
        Thread.sleep(t.getAika());
        System.out.println("Asiakas " + t.getTyyppi() + " " + LocalTime.now());
        lisaaTapahtuma(new Tapahtuma());
    }
}
