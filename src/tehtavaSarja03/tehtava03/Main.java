package tehtavaSarja03.tehtava03;

public class Main {
    public static void main(String[] args) {
        Kello kello = Kello.getInstance();
        kello.setTime(0);
        System.out.println("Kello on: " + kello.getTime());
        kello.setTime(1);
        System.out.println("Kello on: " + kello.getTime());
        kello.setTime(kello.getTime() + 1);
        System.out.println("Kello on: " + kello.getTime());
    }
}
