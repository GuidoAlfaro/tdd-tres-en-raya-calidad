package bo.edu.ucb.junit;

public class TresEnRaya implements JuegoTresEnRaya {

    private final String[][] tablero = new String[3][3];
    private String jugadorActual = "X";  // Guido

    @Override
    public void ponerFicha(int fila, int columna) {
        // Colocamos la ficha en el tablero (Andy debes validar luego esto con respecto al requerimiento 1)
        // Aqui entra el requerimiento 1 y 2
        tablero[fila][columna] = jugadorActual;

        if (jugadorActual.equals("X")) {
            jugadorActual = "+"; // siguiente turno
        }
    }


    @Override
    public String obtenerJugadorActual() {
        // Guido
        return jugadorActual;
    }

    @Override
    public String obtenerGanador() {
        // Husk
        // Revisar si alguna fila, columna o diagonal tiene 3 iguales (y no null)
        return null;
    }

    @Override
    public boolean juegoTerminado() {
        // Husk
        return obtenerGanador() != null;
    }

    @Override
    public String[][] obtenerTablero() {
        // Cualquiera puede hacer esto
        return tablero;
    }
}
