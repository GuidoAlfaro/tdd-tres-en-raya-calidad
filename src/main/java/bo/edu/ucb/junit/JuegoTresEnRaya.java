package bo.edu.ucb.junit;

public interface JuegoTresEnRaya {

    // Andrea: validaciones y poner ficha
    void ponerFicha(int fila, int columna);

    // Guido: turno actual
    String obtenerJugadorActual();

    // Husk: detectar al ganador
    String obtenerGanador();

    // Husk: verificar si ya termino el juego
    boolean juegoTerminado();

    // Cualquiera (es opcional): para mostrar estado
    String[][] obtenerTablero();
}
