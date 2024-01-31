package tehtavaSarja02.tehtava04;

import tehtavaSarja02.tehtava05.TapahtumanTyyppi;

import java.util.Random;

public class Tapahtuma implements Comparable<Tapahtuma>{
    private TapahtumanTyyppi tyyppi;
    private long aika;

    public Tapahtuma() {
        Random random = new Random();
        if (Math.random() >= 0.49) {
            tyyppi = TapahtumanTyyppi.SAAPUMINEN;
        }
        else {
            tyyppi = TapahtumanTyyppi.POISTUMINEN;
        }
        aika = random.nextInt(3000) + 1000;
    }

    public Tapahtuma(TapahtumanTyyppi tyyppi, long aika) {
        this.tyyppi = tyyppi;
        this.aika = aika;
    }

    @Override
    public int compareTo(Tapahtuma t){
//        if(aika==t.aika)
//            return 0;
//        else if(aika>t.aika)
//            return 1;
//        else
//            return -1;
        return Long.compare(aika, t.aika);
    }

    public TapahtumanTyyppi getTyyppi() {
        return tyyppi;
    }

    public long getAika() {
        return aika;
    }
}
