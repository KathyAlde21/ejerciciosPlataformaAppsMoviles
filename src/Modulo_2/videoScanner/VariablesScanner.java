package Modulo_2.videoScanner;

//traigo la libreria VariablesScanner
import java.util.Scanner;

public class VariablesScanner {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //vamos a trabajar con variables
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese su nombre");
        
        //para que coloque los datos para generar un string
        
        String nombre = leer.nextLine();
        
        System.out.println("su nombre es: " + nombre);
        
        
        
        
    }
}
