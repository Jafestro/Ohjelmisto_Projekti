package tehtavaSarja03.tehtava05;

import tehtavaSarja01.tehtava03.Asiakas;
import tehtavaSarja01.tehtava05.PalveluPiste;
import tehtavaSarja02.tehtava04.Tapahtuma;
import tehtavaSarja03.tehtava03.Kello;
import tehtavaSarja03.tehtava04.Saapumisprosessi;
import tehtavaSarja03.tehtava04.TapahtumaLista;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Saapumisprosessi saapumisprosessi = new Saapumisprosessi();
        TapahtumaLista tapahtumaLista = new TapahtumaLista();
        PalveluPiste palveluPiste = new PalveluPiste();

        long startTime = Kello.getInstance().getTime();
        for (int i = 0; i < 10; i++) {
            saapumisprosessi.generate(tapahtumaLista);
        }
        for (int i = 0; i < 10; i++) {
            Tapahtuma tapahtuma = tapahtumaLista.poistaTapahtuma();
            Asiakas asiakas = new Asiakas();
            asiakas.setAloitusaika(tapahtuma.getAika());
            palveluPiste.lisaaJonoon(asiakas);
            System.out.println("Asiakas " + tapahtuma.getTyyppi() + " " + tapahtuma.getAika() + "min");
        }
        palveluPiste.palvele();
        long endTime = Kello.getInstance().getTime();
        System.out.println("Total time: " + (endTime - startTime) + " units of time.");
        System.out.println("Average time: " + (endTime - startTime) / 10.0 + " units of time.");
    }
}
