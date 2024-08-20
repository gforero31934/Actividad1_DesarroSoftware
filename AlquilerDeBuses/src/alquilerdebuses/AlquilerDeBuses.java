/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilerdebuses;

/**
 *
 * @author nemit
 */
import java.util.Scanner;

public class AlquilerDeBuses {

    // Método estático para calcular el número de buses necesarios
    public static int calcularNumeroDeBuses(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        // Calcular el número total de sillas necesarias
        int sillasTotalesNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;
        
        // Calcular el número de buses necesarios
        // Se usa (sillasTotalesNecesarias + sillasPorBus - 1) / sillasPorBus para redondear hacia arriba
        int numeroDeBuses = (sillasTotalesNecesarias + sillasPorBus - 1) / sillasPorBus;
        
        return numeroDeBuses;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar el número de sillas por bus
        System.out.print("Ingrese el número de sillas por bus: ");
        int sillasPorBus = scanner.nextInt();
        
        // Solicitar el número de estudiantes gordos
        System.out.print("Ingrese el número de estudiantes gordos: ");
        int estudiantesGordos = scanner.nextInt();
        
        // Solicitar el número de estudiantes flacos
        System.out.print("Ingrese el número de estudiantes flacos: ");
        int estudiantesFlacos = scanner.nextInt();
        
        // Llamada al método para calcular el número de buses necesarios
        int numeroDeBuses = calcularNumeroDeBuses(sillasPorBus, estudiantesGordos, estudiantesFlacos);
        
        // Mostrar el resultado
        System.out.println("Número de buses necesarios: " + numeroDeBuses);
        
        scanner.close();
    }
}
