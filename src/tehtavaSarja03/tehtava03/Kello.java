package tehtavaSarja03.tehtava03;

public class Kello {
    // Singleton
    private static Kello kello = null;
    private long time;

    private Kello() {
    }
    public static Kello getInstance() {
        if (kello == null) {
            kello = new Kello();
        }
        return kello;
    }
    public void setTime(long time) {
        this.time = time;
    }
    public long getTime() {
        return time;
    }
}
