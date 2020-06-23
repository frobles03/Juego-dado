import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JuegoDadosTest {
private JuegoDados juegodados;
private   int numGanador=7;
    @BeforeEach
    void setUp() {
        juegodados= new JuegoDados();
    }

    @AfterEach
    void tearDown() {
        juegodados=null;
    }

    @Test
    void lanzarDado() {


    }

    @Test
    void juego() {
        int P1=7;

        assertEquals(P1,numGanador);

    }

    @Test
    void juego2() {
        int P1=8;

        assertNotEquals(P1,numGanador);

    }

}