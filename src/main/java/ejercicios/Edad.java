package ejercicios;

import static ejercicios.Edad.evaluar;
import java.util.Scanner;
import java.time.LocalDate;

/**
 *
 * @author danielsanchez
 */
public class Edad {

    public static String evaluar(int dia, int mes, int anno) {
        LocalDate currentDate = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anno, mes, dia);
        int edad = currentDate.getYear() - anno;
        LocalDate cumpleAñoActual = LocalDate.of(currentDate.getYear(), mes, dia);
        if (cumpleAñoActual.isAfter(currentDate)) {
            edad--;
        }
        return "Usted tiene " + edad + " años";
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Día:");
        int dia = lector.nextInt();
        System.out.print("Mes:");
        int mes = lector.nextInt();
        System.out.print("Año:");
        int anno = lector.nextInt();

        String respuesta = evaluar(dia, mes, anno);
        System.out.println(respuesta);
    }
}
