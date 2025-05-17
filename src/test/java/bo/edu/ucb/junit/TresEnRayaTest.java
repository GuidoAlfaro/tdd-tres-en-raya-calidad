package bo.edu.ucb.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TresEnRayaTest {

    @Test
    void primerJugadorEsX() {
        JuegoTresEnRaya juego = new TresEnRaya();
        assertEquals("X", juego.obtenerJugadorActual());
    }

    @Test
    void siXJuegaLuegoDebeSerMas() {
        JuegoTresEnRaya juego = new TresEnRaya();

        juego.ponerFicha(0, 0); // Juega X
        assertEquals("+", juego.obtenerJugadorActual(), "Después de X, debe jugar +");
    }

    @Test
    void siMasJuegaLuegoDebeSerX() {
        JuegoTresEnRaya juego = new TresEnRaya();

        juego.ponerFicha(0, 0); // Juega X
        juego.ponerFicha(1, 1); // Juega +

        assertEquals("X", juego.obtenerJugadorActual(), "Después de +, debe jugar X");
    }



}
