
package Modulo_2.videoDepuracion;

import java.util.Scanner;

//programa para determinar ingreso a un lugar
public class DepuracionVariables {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //declaración variable
        int edad;
        
        //solicitud por pantalla ingresar edad
        System.out.println("Ingrese la edad del asistente");
        Scanner leer = new Scanner(System.in);
        edad = leer.nextInt();
        
        //comprobación edad
        if (edad < 18) {
            System.out.println("El asistente no puede ingresar");
        } else if (edad >= 18) {
            System.out.println("El asistente puede ingresar");
        }
        
        
    }
}
