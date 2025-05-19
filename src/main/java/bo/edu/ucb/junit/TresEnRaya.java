package bo.edu.ucb.junit;

public class TresEnRaya implements JuegoTresEnRaya {

    private final String[][] tablero = new String[3][3];
    private String jugadorActual = "X";  // Guido

    @Override
    public void ponerFicha(int fila, int columna) {
        // Validacion de fila
        if (fila < 0 || fila > 2) {
        throw new IllegalArgumentException("Fila fuera de rango");
        }

        // Validacion de columna
        if (columna < 0 || columna > 2) {
            throw new IllegalArgumentException("Columna fuera de rango");
        }
        
        // Validar si la posicion ya tiene una ficha
        if (tablero[fila][columna] != null) {
            throw new IllegalArgumentException("Posicion ya ocupada");
        }

        // Colocamos la ficha en el tablero
        tablero[fila][columna] = jugadorActual;

        // Cambiar turno
        if (jugadorActual.equals("X")) {
            jugadorActual = "+";
        } else if (jugadorActual.equals("+")) {
            jugadorActual = "X";
        }
    }

    @Override
    public String obtenerJugadorActual() {
        // Guido
        return jugadorActual;
    }

    @Override
    public String obtenerGanador() {
        // Husk: 
        

        return null;
    }

    @Override
    public boolean juegoTerminado() {
        // Husk: 
        if (obtenerGanador() != null) {
            return true;
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == null) {
                    return false; 
                }
            }
        }
        return true; 
    }

    @Override
    public String[][] obtenerTablero() {
        // Cualquiera puede hacer esto
        return tablero;
    }
}