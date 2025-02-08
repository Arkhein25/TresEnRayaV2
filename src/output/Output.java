package output;

import adminTablero.Tablero;
import adminJuego.EstadoJuego;

public class Output {
    public void mostrarTablero(Tablero tablero){
        char[][] t =tablero.getTablero();
        System.out.println("--------------");
        for (int i = 0; i <3 ; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3 ; j++) {
                System.out.print(t[i][j]+" | ");
            }
            System.out.println();
            System.out.println("--------------");
        }
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public void mostrarResultado(EstadoJuego estadoJuego){
        switch(estadoJuego){
            case USUARIO_GANA:
                System.out.println("Felicidades Ganaste!!!");
                break;
            case ORDENADOR_GANA:
                System.out.println("Ordenador Gana!!");
                break;
            case EMPATE:
                System.out.println("EMPATE!!!");
                break;
        }
    }
}
