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
    }

    void poistaTapahtuma() throws InterruptedException {
        Random random = new Random();
        Tapahtuma t = tapahtumat.poll();
        assert t != null;
        if (t.getNimi().equals("A"))
            Thread.sleep(random.nextInt(5000)+1000);
        else
            Thread.sleep(random.nextInt(10000) + 5000);
        System.out.println(t.getNimi() + " asiakas " + " poistuu palvelista " + LocalTime.now());
        lisaaTapahtuma(new Tapahtuma());
    }
}
