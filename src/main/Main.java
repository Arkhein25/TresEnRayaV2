package main;

import adminJuego.JuegoMichi;
import input.Input;
import output.Output;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        JuegoMichi juego=new JuegoMichi();
        juego.iniciarJuego(input, output);
        input.cerrar();
    }
}