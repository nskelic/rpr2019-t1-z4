package ba.unsa.etf.rpr;

public class Korpa {
    private Artikl[] nizArtikala = new Artikl[50];
    private int brojArtikala = 0;

    public Korpa() {
    }
    public Artikl[] getArtikli() {
        return nizArtikala;
    }
    public boolean dodajArtikl(Artikl artikl) {
        if(brojArtikala==50) return false;
        nizArtikala[brojArtikala++] = artikl;
        return true;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl[] noviNiz = new Artikl[50];
        Artikl artiklIzbacen = null;
        int stariBroj = brojArtikala;
        for(int i = 0, j = 0; i<stariBroj; i++) {
            if(nizArtikala[i].getKod().equals(kod)) {
                brojArtikala--;
                artiklIzbacen = nizArtikala[i];
                continue;
            }
            noviNiz[j] = nizArtikala[i];
            j++;
        }
        nizArtikala = noviNiz;
        return  artiklIzbacen;
    }
    public int dajUkupnuCijenuArtikala () {
        int s=0;
        for(int i = 0; i < brojArtikala; i++) {
            s+=nizArtikala[i].getCijena();
        }
        return  s;
    }
}
