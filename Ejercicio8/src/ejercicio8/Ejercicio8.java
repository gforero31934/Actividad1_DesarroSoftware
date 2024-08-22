/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author nemit
 */
//En el nuevo edificio de la universidad, cada piso tendrá el mismo número de salones y todos estos salones
//tendrán la misma capacidad (cantidad de estudiantes que caben en el salón). Escriba las siguientes funciones:
//a. La primera función que calcule el número de salones del nuevo edificio a partir del número de
//estudiantes que tiene la universidad y la capacidad de un salón.
//b. La segunda función obtendrá el número de pisos que tendrá el nuevo edificio a partir del número de
//salones que vamos a necesitar y el número de salones que tendrá un piso del edificio.
//c. Escriba finalmente el programa que lea desde el teclado el número de estudiantes que tiene la
//universidad, la capacidad de un salón y el número de salones que tendrá un piso, y qué usando las dos
//funciones anteriores, encuentre e imprima el número de salones y el número de pisos del nuevo
//edificio.
//

import java.util.Scanner;
public class Ejercicio8 {

    static double salones(double nestudiantes,double csalon){
        return nestudiantes/csalon;
    }
    static double pisos(double numero_salones,double salonpiso){
        return numero_salones/salonpiso;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nestudiantes, csalon, nsalones, salonpiso;
        System.out.println("Ingrese el Numero total de estudiantes: ");
        nestudiantes = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de estudiantes por salon: ");
        csalon = teclado.nextDouble();
        System.out.println("Ingrese el numero de salones por piso: ");
        salonpiso = teclado.nextDouble();

        //reultado numerode salones
        double numero_salones = salones(nestudiantes , csalon );
        System.out.println("se requiere(n) " + Math.ceil(numero_salones) + " salon(es)" + " para " + (nestudiantes) + " estudiantes" );
        double spisos = pisos(numero_salones , salonpiso );
        System.out.println("se requiere(n) " + Math.ceil(spisos) +" piso(s) " + " para " + (numero_salones) + " salon(es)" );

    }
}
