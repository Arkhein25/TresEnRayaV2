package jugador;

import adminTablero.Tablero;
import input.Input;
import output.Output;

public class Usuario {
    private static final char USUARIO = 'X';

    public void ejecutarTurno(Tablero tablero, Input input, Output output){
        int fila, columna;
        boolean posicionValida;
        do{
            int[] movimiento=input.solicitarMovimiento();
            fila=movimiento[0];
            columna=movimiento[1];
            posicionValida=tablero.esMovimientoValido(fila,columna);
            if(!posicionValida){
                output.mostrarMensaje("Esta posición no es valida.");
            }
        }while(!posicionValida);
        tablero.setMovimiento(fila, columna, USUARIO);
    }
}
