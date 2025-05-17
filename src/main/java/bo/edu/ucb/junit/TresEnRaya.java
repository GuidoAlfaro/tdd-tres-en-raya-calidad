package bo.edu.ucb.junit;

public class TresEnRaya implements JuegoTresEnRaya {

    private final String[][] tablero = new String[3][3];
    private String jugadorActual = "X";  // Guido

    @Override
    public void ponerFicha(int fila, int columna) {
        // Andrea:
        // Validar que fila y columna estén entre 0 y 2
        // Validar que la casilla esté vacía

        // Guido:
        // Colocar ficha según jugadorActual
        // Cambiar turno: "X" → "O" o "O" → "X"
    }

    @Override
    public String obtenerJugadorActual() {
        // Guido
        return null;
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
