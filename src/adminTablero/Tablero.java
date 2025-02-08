package adminTablero;

public class Tablero {
    private static final char VACIO = ' ';
    private char[][] tablero = new char[3][3];

    public Tablero() {
        iniciarTablero();
    }

    public void iniciarTablero() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = VACIO;
            }
        }
    }

    public char[][] getTablero() {
        return tablero;
    }

    public boolean esMovimientoValido(int fila, int columna) {
        return fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && tablero[fila][columna] == VACIO;
    }

    public void setMovimiento(int fila, int columna, char simbolo){
        tablero[fila][columna]=simbolo;
    }

    public boolean comprobarGanador(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0] == simbolo && tablero[i][1] == simbolo && tablero[i][2] == simbolo) {
                return true;
            }
            if (tablero[0][i] == simbolo && tablero[1][i] == simbolo && tablero[2][i] == simbolo) {
                return true;
            }
        }
        if (tablero[0][0] == simbolo && tablero[1][1] == simbolo && tablero[2][2] == simbolo) {
            return true;
        }
        if (tablero[0][2] == simbolo && tablero[1][1] == simbolo && tablero[2][0] == simbolo) {
            return true;
        }
        return false;
    }

    public boolean tableroLleno() {
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == VACIO) {
                    contador++;
                }
            }
        }
        return contador == 9;
    }
}
