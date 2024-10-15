//PARA GENERAR JAVA DOC PASOS:
//1.

package Modulo_2.videoJavaDoc;

import java.util.Scanner;

//Parametros JavaDoc => documentación se hace con /** y enter
//dentro de los * si hago @ me muestra todo lo que puede llamar
/**
 * 
 * @author Kathy //sale automático
 * @version 1.0  //la creo manual
 *
 * 
 */


//programa para determinar ingreso a un lugar
public class JavaDocParametros {
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
