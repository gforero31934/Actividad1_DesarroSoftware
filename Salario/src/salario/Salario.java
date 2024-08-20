/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario;

/**
 *
 * @author nemit
 */
import java.util.Scanner;

public class Salario {

    // Función para calcular el  arriendo
    public static double calcularGastoArriendo(double sueldo) {
        return sueldo * 0.40;
    }

    // Función para calcular  gasto en comida
    public static double calcularGastoComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el sueldo de Pedro en pesos 
        System.out.print("Ingrese el sueldo de Pedro en pesos: ");
        double sueldo = scanner.nextDouble();

        // Calcular los gastos y el dinero restante usando las funciones
        double gastoArriendo = calcularGastoArriendo(sueldo);
        double gastoComida = calcularGastoComida(sueldo);
        double dineroRestante = sueldo - gastoArriendo - gastoComida;

        // Mostrar los resultados en pesos colombianos
        System.out.printf("Gasto en arriendo: %.2f pesos ", gastoArriendo);
        System.out.printf("Gasto en comida: %.2f pesos ", gastoComida);
        System.out.printf("Dinero restante: %.2f pesos ", dineroRestante);

        // Cerrar el scanner
        scanner.close();
    }
}