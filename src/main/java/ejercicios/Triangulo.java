package ejercicios;

import static ejercicios.Triangulo.evaluar;
import java.util.Scanner;

/**
 *
 * @author danielsanchez
 */
public class Triangulo {
    public static String evaluar(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return "No es un triángulo válido";
        }
        
        // Determinar el tipo de triángulo
        if (a == b && b == c) {
            return "El triángulo es equilátero";
        }
        if (a == b || b == c || a == c) {
            return "El triángulo es isósceles";
        }
        
        return "El triángulo es escaleno";
        
    }
    
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("a:");
        double a = lector.nextDouble();
        System.out.print("b:");
        double b = lector.nextDouble();
        System.out.print("c:");
        double c = lector.nextDouble();
        
        String respuesta = evaluar(a, b, c);
        System.out.println(respuesta);
    }
}
