package tehtavaSarja02.tehtava04;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TapahtumaLista tapahtumaLista = new TapahtumaLista();
        Tapahtuma t = new Tapahtuma();
        tapahtumaLista.lisaaTapahtuma(t);
        while (true)
            tapahtumaLista.poistaTapahtuma();
    }
}
