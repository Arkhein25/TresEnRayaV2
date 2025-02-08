package adminJuego;

import adminTablero.Tablero;
import jugador.Usuario;
import jugador.Ordenador;
import input.Input;
import output.Output;

public class JuegoMichi {
    private EstadoJuego estadoJuego = EstadoJuego.EN_CURSO;
    private Tablero tablero = new Tablero();
    private Usuario usuario = new Usuario();
    private Ordenador ordenador = new Ordenador();

    public void iniciarJuego(Input input, Output output) {
        tablero.iniciarTablero();
        output.mostrarTablero(tablero);
        do {
            usuario.ejecutarTurno(tablero, input, output);
            actualizarEstadoJuego('X');
            if (estadoJuego == EstadoJuego.EN_CURSO) {
                ordenador.ejecutarTurno(tablero, output);
                output.mostrarTablero(tablero);
                actualizarEstadoJuego('O');
            }
        } while (estadoJuego == EstadoJuego.EN_CURSO);
        output.mostrarTablero(tablero);
        output.mostrarResultado(estadoJuego);
    }

    public void actualizarEstadoJuego(char simbolo) {
        if (tablero.comprobarGanador(simbolo)) {
            if (simbolo == 'X') {
                estadoJuego = EstadoJuego.USUARIO_GANA;
            } else {
                estadoJuego = EstadoJuego.ORDENADOR_GANA;
            }
        } else if (tablero.tableroLleno()) {
            estadoJuego = estadoJuego.EMPATE;
        }
    }
}