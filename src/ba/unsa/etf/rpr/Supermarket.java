package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] nizArtikala = new Artikl[1000];
    private int brojArtikala=0;

    public Supermarket() {
    }
    public Artikl[] getArtikli() {
        return nizArtikala;
    }
    public void dodajArtikl(Artikl artikl) {
        if(brojArtikala==1000) return;
        nizArtikala[brojArtikala++]=artikl;
    }
    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl[] noviNiz = new Artikl[1000];
        Artikl artiklIzbacen = null;
        for(int i=0, j=0; i<brojArtikala; i++) {
            if(nizArtikala[i].getKod().equals(kod)) {
                brojArtikala--;
                artiklIzbacen = nizArtikala[i];
                continue;
            }
            noviNiz[j] = nizArtikala[i];
            j++;
        }
        nizArtikala = noviNiz;
        return artiklIzbacen;
    }

    public int dajUkupnuCijenuArtikala () {
        int s=0;
        for(int i=0; i<brojArtikala; i++) {
            s+=nizArtikala[i].getCijena();
        }
        return s;
    }
}
