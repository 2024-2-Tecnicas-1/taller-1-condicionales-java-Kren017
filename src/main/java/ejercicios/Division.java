package ejercicios;

import static ejercicios.Division.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Division {

    public static String evaluar(int dividendo, int divisor) {
        int cociente = dividendo / divisor;
        int residuo = dividendo % divisor;
        String resultadoDivision = (residuo == 0) ? "La división es exacta." : "La división no es exacta.";
        return resultadoDivision + " \n"
                + "Cociente: " + cociente + "\n"
                + "Residuo: " + residuo;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Dividendo:");
        int dividendo = lector.nextInt();
        System.out.print("Divisor:");
        int divisor = lector.nextInt();

        String respuesta = evaluar(dividendo, divisor);
        System.out.println(respuesta);
    }
}
