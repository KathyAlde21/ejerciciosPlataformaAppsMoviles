package Modulo_2.videoString;

public class VariablesString {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        int numero = 1;
        
        String palabra1 = "hola mundo";
        System.out.println(palabra1);
        
        //puedo concatenar en el string uniendo con y sin espacio
        String palabra2 = "hola mundo" + numero;
        System.out.println(palabra2);
        
        String palabra3 = "hola mundo" + " " + numero;
        System.out.println(palabra3);
        
        //para saber la longitud de caracteres de una palabra
        int longitud = palabra1.length();
        System.out.println(longitud);
        
        //para conocer un caracter especifico dentro del string
        char caracter = palabra1.charAt(0); //coloco del 0 en adelante
        System.out.println(caracter);
        
        //para saber si es verdadero o falso que este un caracter
        boolean existe = palabra1.startsWith("h"); //parte con
        System.out.println(existe);
        
    }
}
