package tehtavaSarja03.tehtava04;

import tehtavaSarja02.tehtava04.Tapahtuma;

import java.util.PriorityQueue;

public class TapahtumaLista {
    private PriorityQueue<Tapahtuma> tapahtumat = new PriorityQueue<>();

    public void lisaaTapahtuma(Tapahtuma t) {
        tapahtumat.add(t);
    }

    public Tapahtuma poistaTapahtuma() {
        return tapahtumat.poll();
    }
}
