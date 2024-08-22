/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author nemit
 */
//Escribir una función que reciba dos números enteros y retorne el mayor número de los dos. Escriba un
//programa, que lea dos números enteros, y usando la función anterior, imprima el mayor de los dos. No puede
//usar el método MAX de Java, use la instrucción condicional IF.


import java.util.Scanner;

public class Ejercicio9 {
    static int comp_n (int a, int b){
        int comparados;
        if(a > b) {
            comparados = a;
        }
        else{
            comparados = b;
        }


        return comparados ;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int b, a;
        System.out.println("Ingrese primer numero : ");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        b = teclado.nextInt();

        // Resultado Comparación
        System.out.println("el numero mayor es: " + comp_n(a,b));

    }
}
