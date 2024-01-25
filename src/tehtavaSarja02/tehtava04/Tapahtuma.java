package tehtavaSarja02.tehtava04;

import java.util.Random;

public class Tapahtuma implements Comparable<Tapahtuma>{
    private String nimi;
    private long aika;

    public Tapahtuma() {
        Random random = new Random();
        if (Math.random() >= 0.49) {
            nimi = "saapuminen";
        }
        else {
            nimi = "poistuminen";
        }
        aika = random.nextInt(3000) + 1000;
    }

    @Override
    public int compareTo(Tapahtuma t){
        if(aika==t.aika)
            return 0;
        else if(aika>t.aika)
            return 1;
        else
            return -1;
    }

    public String getNimi() {
        return nimi;
    }

    public long getAika() {
        return aika;
    }
}
