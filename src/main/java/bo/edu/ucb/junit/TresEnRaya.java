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
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] != null && tablero[i][0].equals(tablero[i][1]) && tablero[i][1].equals(tablero[i][2])) {
                return tablero[i][0];
            }
        }

        for (int j = 0; j < 3; j++) {
            if (tablero[0][j] != null && tablero[0][j].equals(tablero[1][j]) && tablero[1][j].equals(tablero[2][j])) {
                return tablero[0][j];
            }
        }
    
        if (tablero[0][0] != null && tablero[0][0].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][2])) {
            return tablero[0][0];
        }

    
        if (tablero[0][2] != null && tablero[0][2].equals(tablero[1][1]) && tablero[1][1].equals(tablero[2][0])) {
            return tablero[0][2];
        }

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