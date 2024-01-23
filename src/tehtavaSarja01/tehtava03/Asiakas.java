package tehtavaSarja01.tehtava03;

public class Asiakas {
    private static int nextId = 1;
    private int id;
    private long aloitusaika;
    private long lopetusaika;

    //Constructor


    public Asiakas() {
        this.id = nextId++;
    }

    // Methods
    public long timeSpent() {
        return this.lopetusaika - this.aloitusaika;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getAloitusaika() {
        return aloitusaika;
    }

    public void setAloitusaika(long aloitusaika) {
        this.aloitusaika = aloitusaika;
    }

    public long getLopetusaika() {
        return lopetusaika;
    }

    public void setLopetusaika(long lopetusaika) {
        this.lopetusaika = lopetusaika;
    }
}
