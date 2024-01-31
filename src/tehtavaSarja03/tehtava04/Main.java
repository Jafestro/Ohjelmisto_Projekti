package tehtavaSarja03.tehtava04;

import tehtavaSarja02.tehtava04.Tapahtuma;

public class Main {
    public static void main(String[] args) {
        Saapumisprosessi saapumisprosessi = new Saapumisprosessi();
        TapahtumaLista tapahtumaLista = new TapahtumaLista();
        for (int i = 0; i < 10; i++) {
            saapumisprosessi.generate(tapahtumaLista);
        }
        for (int i = 0; i < 10; i++) {
            Tapahtuma tapahtuma = tapahtumaLista.poistaTapahtuma();
            System.out.println("Asiakas " + tapahtuma.getTyyppi() + " " + tapahtuma.getAika() + "min");
        }
    }
}
