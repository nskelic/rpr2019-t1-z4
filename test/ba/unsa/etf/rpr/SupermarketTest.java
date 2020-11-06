package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    private Supermarket supermarket = new Supermarket();
    private Artikl prvi = new Artikl("Pegla", 170, "1");
    private Artikl drugi = new Artikl("Fen", 130, "2");

    @BeforeEach
    void setUp () {
        supermarket.dodajArtikl(prvi);
        supermarket.dodajArtikl(drugi);
    }

    @Test
    void testDodavanjaArtikla() {
        supermarket.getArtikli();
        assertEquals("1", supermarket.getArtikli()[0].getKod());
        assertEquals("2", supermarket.getArtikli()[1].getKod());
    }

    @Test
    void testIzbacivanjaArtikla() {
        supermarket.dodajArtikl(prvi);
        supermarket.dodajArtikl(drugi);
        supermarket.izbaciArtiklSaKodom("1");
        String kod = drugi.getKod();
        assertEquals(kod, supermarket.getArtikli()[0].getKod());
    }

}