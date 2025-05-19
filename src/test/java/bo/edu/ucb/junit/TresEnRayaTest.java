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

    @Test
    void FilaMenorACero() {
        JuegoTresEnRaya juego = new TresEnRaya();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            juego.ponerFicha(-1, 1);
        });

        String expectedMessage = "Fila fuera de rango";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void FilaMayorADos() {
        JuegoTresEnRaya juego = new TresEnRaya();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            juego.ponerFicha(3, 1);
        });

        String expectedMessage = "Fila fuera de rango";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void ColumnaMenorACero() {
        JuegoTresEnRaya juego = new TresEnRaya();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            juego.ponerFicha(1, -1);
        });

        String expectedMessage = "Columna fuera de rango";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void ColumnaMayorADos() {
        JuegoTresEnRaya juego = new TresEnRaya();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            juego.ponerFicha(1, 3);
        });

        String expectedMessage = "Columna fuera de rango";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void LugarOcupado() {
        JuegoTresEnRaya juego = new TresEnRaya();

        juego.ponerFicha(0, 0); // Juega X

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            juego.ponerFicha(0, 0); // Intentar jugar en la misma posición
        });

        String expectedMessage = "Posicion ya ocupada";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    // Nuevas pruebas para obtenerGanador y juegoTerminado
    @Test
    void noHayGanadorEnTableroVacio() {
        JuegoTresEnRaya juego = new TresEnRaya();
        assertNull(juego.obtenerGanador(), "No debe haber ganador en un tablero vacío");
    }

    @Test
    void juegoNoTerminadoSinGanador() {
        JuegoTresEnRaya juego = new TresEnRaya();
        // X juega en (0,0)
        juego.ponerFicha(0, 0);
        // + juega en (1,0)
        juego.ponerFicha(1, 0);

        assertFalse(juego.juegoTerminado(), "El juego no debe estar terminado cuando no hay ganador y quedan espacios libres");
    }
}
