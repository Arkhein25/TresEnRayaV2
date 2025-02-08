package input;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int[] solicitarMovimiento() {
        int[] movimiento = new int[2];
        System.out.println("ingresa la fila y la columna (1-3): ");
        movimiento[0] = scanner.nextInt() - 1;
        movimiento[1] = scanner.nextInt() - 1;
        return movimiento;
    }

    public void cerrar() {
        scanner.close();
    }
}
