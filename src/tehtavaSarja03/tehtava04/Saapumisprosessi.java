package tehtavaSarja03.tehtava04;

import eduni.distributions.Negexp;
import tehtavaSarja02.tehtava04.Tapahtuma;
import tehtavaSarja02.tehtava05.TapahtumanTyyppi;
import tehtavaSarja03.tehtava03.Kello;

public class Saapumisprosessi {
    private TapahtumanTyyppi tapahtumanTyyppi;
    private Negexp satunnaislukuGeneraattori;

    public Saapumisprosessi() {
        tapahtumanTyyppi = TapahtumanTyyppi.SAAPUMINEN;
    }
    public void generate(TapahtumaLista tapahtumaLista) {
        satunnaislukuGeneraattori = new Negexp(10.0);
        Tapahtuma tapahtuma = new Tapahtuma(tapahtumanTyyppi, (long) satunnaislukuGeneraattori.sample());
        Kello.getInstance().setTime(Kello.getInstance().getTime() + tapahtuma.getAika());
        tapahtumaLista.lisaaTapahtuma(tapahtuma);
    }
}
