/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoescalera.java;

/**
 *
 * @author nemit
 */

import java.util.Scanner;

public class CalculoEscalera {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura de la escalera
        System.out.print("Ingrese la altura de la escalera (x) en metros: ");
        double altura = scanner.nextDouble();

        // Solicitar al usuario el ángulo en grados
        System.out.print("Ingrese el ángulo (α) en grados: ");
        double anguloGrados = scanner.nextDouble();

        // Convertir el ángulo de grados a radianes
        double anguloRadianes = Math.toRadians(anguloGrados);

        // Calcular la longitud de la escalera usando la fórmula
        double longitudEscalera = altura / Math.cos(anguloRadianes);

        // Mostrar el resultado
        System.out.printf("La longitud de la escalera (y) es: %.2f metros%n", longitudEscalera);

        // Cerrar el scanner
        scanner.close();
    }
}