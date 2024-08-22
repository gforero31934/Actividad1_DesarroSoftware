/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author nemit
 */

//Escriba una función en el que a partir de dos números enteros y un operador aritmético (un String, que puede
//ser "+", "-", "*", "/", "%" o "**"), aplica la operación correspondiente y retorna el resultado.
//El programa deberá leer los dos números, la operación y, usando la función, deberá mostrar el resultado

public class Ejercicio10 {
    // Función que realiza la operación aritmética
    public static double realizarOperacion(int num1, int num2, String operador) {
        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = (double) num1 / num2;
                } else {
                    throw new ArithmeticException("División por cero no permitida.");
                }
                break;
            case "%":
                resultado = num1 % num2;
                break;
            case "**":
                resultado = Math.pow(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Operador no válido.");
        }
        return resultado;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Leer los dos números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        // Leer el operador
        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.next();
        
        // Llamar a la función para realizar la operación
        try {
            double resultado = realizarOperacion(num1, num2, operador);
            System.out.println("El resultado de la operación es: " + resultado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}