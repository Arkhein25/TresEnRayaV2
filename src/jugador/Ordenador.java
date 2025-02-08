package jugador;

import adminTablero.Tablero;
import output.Output;

public class Ordenador {
    private static final char ORDENADOR = 'O';

    public void ejecutarTurno(Tablero tablero, Output output) {
        int fila, columna;
        do {
            fila = (int) (Math.random() * 3);
            columna = (int) (Math.random() * 3);
        } while (!tablero.esMovimientoValido(fila, columna));
        tablero.setMovimiento(fila, columna, ORDENADOR);
        output.mostrarMensaje("El ordenador jugó en la posicion: " + (fila + 1) + ", " + (columna + 1));
    }
}
