/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author nemit
 */
//Todo punto del eje cartesiano está descrito por dos elementos: la coordenada x (o «abscisa») y su coordenada
//y (que también se llama la «ordenada»). Suponga que tenemos las coordenadas (x, y) de dos puntos: x1 y y1
//para el primer punto, y también x2y y2 para el segundo punto. Vamos a construir funciones y un programa
//que nos ayude a resolver los siguientes interrogantes:
//Escriba una función que halle la distancia entre dos puntos de acuerdo con la siguiente fórmula:
//𝑑 = √(𝑦2 − 𝑦1)2 + (𝑥2 − 𝑥1)2
//• Escriba una función que reciba las coordenadas de dos puntos y que retorne la pendiente de la recta que
//une esos dos puntos. Recordemos que la pendiente se obtiene con la fórmula:
//𝑚 = 𝑦2−𝑦1/𝑥2−𝑥1
//• Ahora escriba un programa que lea las dos coordenadas de dos puntos, y que imprima, usando las
//funciones anteriores, la distancia entre esos puntos y la pendiente de la recta que une esos dos puntos.

import java.util.Scanner;

public class Ejercicio7 {

    static double distancia(double x1,double x2, double y1,double y2){
        return Math.sqrt((Math.pow((y2-y1),2)+ Math.pow((x2-x1),2)));
    }

    static double pendiente(double x1,double x2, double y1,double y2){

        return (y2-y1)/(x2-x1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x1, x2, y1, y2;
        System.out.println("Ingrese el valor de X1: ");
        x1 = teclado.nextDouble();
        System.out.println("Ingrese el valor de Y1: ");
        y1 = teclado.nextDouble();
        System.out.println("Ingrese el valor de X2: ");
        x2 = teclado.nextDouble();
        System.out.println("Ingrese el valor de Y2: ");
        y2 = teclado.nextDouble();



        //reultado distancia de los puntos
        double distancia_puntos = distancia(x1 , x2, y1, y2 );
        System.out.println("La distancia entre los puntos (x1,y1) y (x2,y2) es: " + (distancia_puntos) );

        //reultado pendiente de los puntos
        double m = pendiente(x1 , x2, y1, y2 );
        System.out.println("La pendiente entre los puntos (x1,y1) y (x2,y2) es: " + (m) );

    }

}
