package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    void testNazivArtikla() {
        Artikl artikl = new Artikl("Laptop", 1200, "10");
        assertEquals("Laptop", artikl.getNaziv());
    }
}