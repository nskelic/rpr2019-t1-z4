package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    private Korpa korpa;
    private Artikl artikl;

    @BeforeEach
    void setUp() {
        korpa = new Korpa();
        artikl = new Artikl("TV", 950, "12");
    }

    @Test
    void testDaLiSeMozeDodati () {
        boolean dodano = korpa.dodajArtikl(artikl);
        assertTrue(dodano);
    }

    @Test
    void testUkupnaCijenaArtikala () {
        korpa.dodajArtikl(artikl);
        assertEquals(950, korpa.dajUkupnuCijenuArtikala());
    }
}