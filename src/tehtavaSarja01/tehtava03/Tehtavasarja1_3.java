package tehtavaSarja01.tehtava03;

public class Tehtavasarja1_3 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Asiakas asiakas = new Asiakas();
            asiakas.setAloitusaika(System.currentTimeMillis());
            System.out.printf("%s. Asiakas pääsi sisään %s\n", i+1, asiakas.getAloitusaika());
            Thread.sleep(5000);
            asiakas.setLopetusaika(System.currentTimeMillis());
            System.out.printf("%s. Asiakas pääsi ulos %s\n", i+1, asiakas.getLopetusaika());
        }
    }
}
