package ejercicios;

import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class SetDeTenis {

    public static String evaluar(int numVictoriasA, int numVictoriasB) {

        if ((numVictoriasA == 7 && (numVictoriasB == 5 || numVictoriasB == 6))
                || (numVictoriasB == 7 && (numVictoriasA == 5 || numVictoriasA == 6))) {
            if (numVictoriasA > numVictoriasB) {
                return "Ganó A";
            } else {
                return "Ganó B";
            }
        }
        if (numVictoriasA == 6 && numVictoriasA > numVictoriasB + 1) {
            return "Ganó A";
        }
        if (numVictoriasB == 6 && numVictoriasB > numVictoriasA + 1) {
            return "Ganó B";
        }
        if (numVictoriasA <= 6 && numVictoriasB <= 6) {
            return "Aún no termina";
        }
        return "Inválido";

    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.print("Los juegos ganador por A:");
        int numVictoriasA = lector.nextInt();
        System.out.print("Los juegos ganador por B:");
        int numVictoriasB = lector.nextInt();

        String respuesta = evaluar(numVictoriasA, numVictoriasB);
        System.out.println(respuesta);
    }
}
