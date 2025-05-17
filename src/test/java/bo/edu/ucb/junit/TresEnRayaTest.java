package bo.edu.ucb.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TresEnRayaTest {

    @Test
    void testPrimerJugadorEsX() {
        JuegoTresEnRaya juego = new TresEnRaya();
        assertEquals("X", juego.obtenerJugadorActual());
    }

    @Test
    void elTurnoDebeAlternarEntreXyO() {
        JuegoTresEnRaya juego = new TresEnRaya();

        assertEquals("X", juego.obtenerJugadorActual(), "Debe empezar jugando X");

        juego.ponerFicha(0, 0);

        assertEquals("+", juego.obtenerJugadorActual(), "Después de X, debe jugar +");

        juego.ponerFicha(1, 1);

        assertEquals("+", juego.obtenerJugadorActual(), "Después de +, debe jugar X");
    }

}
