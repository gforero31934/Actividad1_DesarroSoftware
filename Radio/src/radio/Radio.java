/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radio;

/**
 *
 * @author nemit
 */
import java.util.Scanner;

public class Radio {

    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    // Función para calcular el área de la corona circular
    public static double calcularAreaCoronaCircular(double radioPequeno, double radioGrande) {
        // Usar la función calcularAreaCirculo para obtener las áreas de los círculos
        double areaCirculoPequeno = calcularAreaCirculo(radioPequeno);
        double areaCirculoGrande = calcularAreaCirculo(radioGrande);

        // Calcular el área de la corona circular
        return areaCirculoGrande - areaCirculoPequeno;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo pequeño
        System.out.print("Ingrese el radio del círculo pequeño (r) en metros: ");
        double radioPequeno = scanner.nextDouble();

        // Solicitar al usuario el radio del círculo grande
        System.out.print("Ingrese el radio del círculo grande (R) en metros: ");
        double radioGrande = scanner.nextDouble();

        // Calcular el área de la corona circular usando la función
        double areaCoronaCircular = calcularAreaCoronaCircular(radioPequeno, radioGrande);

        // Mostrar el resultado
        System.out.printf("El área de la corona circular es: %.2f metros cuadrados%n", areaCoronaCircular);

        // Cerrar el scanner
        scanner.close();
    }
}

