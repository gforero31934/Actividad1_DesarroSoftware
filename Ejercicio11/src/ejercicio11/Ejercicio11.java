/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author nemit
 */

/*Vamos a hacer un programa que transforme un número entero a números romanos. Por ahora solo vamos a
considerar números entre 1 y 99. Para ello desarrolle las siguientes funciones y después el programa
correspondiente:
• Primero, escriba una función que tome un número entero de dos cifras y retorne la cifra de las decenas de ese número.
• Escriba otra función que tome un número entero de dos cifras y retorne la cifra de las unidades de ese número.
• Escriba otra función que reciba un número entero de un dígito (es decir, un número entre 0 y 9) y retorne0
el equivalente en romano de ese digito. O sea, para 1 retorne "I", para 2 debe retornar "II" y así
sucesivamente. Para el cero retorne una cadena o string vacío, ""
• Escriba finalmente una función que reciba un número entero de un dígito, es decir, un número entre 0 y
9, y retorne el equivalente romano en decenas de ese número. Las decenas en romano son: para el 1, es
una "X", para el 2, es "XX", para el 3, es "XXX", para el 4 es "XL", para el 5 es "L", y así sucesivamente.
• Ahora sí, escriba un programa que lea un número entero, y si el número tiene menos de 3 cifras, utilice
las funciones anteriores, para convertir el número a romanos (es decir, obtenga las decenas y unidades del
número, convierta las unidades a romano, convierta las decenas a romano, e imprima ambos strings en
pantalla). Si el número tiene 3 o más dígitos o es negativo, se debe mostrar un mensaje de error.*/


    import java.util.Scanner;


public class Ejercicio11 {

    // Función que obtiene la cifra de las decenas
    public static int obtenerDecenas(int numero) {
        // Asegurarse de que el número está entre 10 y 99
        if (numero < 10 || numero > 99) {
            throw new IllegalArgumentException("El número debe estar entre 10 y 99.");
        }
        return numero / 10;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Leer el número entero
        System.out.print("Ingrese un número entero entre 1 y 99: ");
        int numero = scanner.nextInt();

        try {
            // Obtener la cifra de las decenas
            int decenas = obtenerDecenas(numero);

            // Imprimir el resultado
            System.out.println("La cifra de las decenas es: " + decenas);
        } catch (IllegalArgumentException e) {
            // Manejar el caso en el que el número no está en el rango permitido
            System.out.println(e.getMessage());
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
