package tehtavaSarja02.tehtava04;

public class Tapahtuma implements Comparable<Tapahtuma>{
    private String nimi;
    private long aika;

    public Tapahtuma() {
        if (Math.random() >= 0.51)
            nimi = "A";
        else
            nimi = "B";
        aika = System.currentTimeMillis();
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
