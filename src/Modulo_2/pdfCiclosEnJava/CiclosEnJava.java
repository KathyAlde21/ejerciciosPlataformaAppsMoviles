package Modulo_2.pdfCiclosEnJava;

/*
Los ciclos o estructuras de control permiten repetir varias veces instrucciones
de forma ciclica en líneas pequeñas y de forma automática
*/


public class CiclosEnJava {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //Ciclo For
        /*
        permite ejecutar un número determinado de iteraciones y debe contener
        3 elementos:
        1) Inicialización => valor inicial contador
        2) Terminación => condición sobre la que se evaluarán las repeticiones
        3) Incremento => defini incremento o decremento del valor declarado en
        inicialización
        */
        //programa que imprima números 0 al 9
        for (int i = 0; i < 10; i++) {
            System.out.println("Vuelta del for número: " + i);
        }
        
        //Ciclo While
        /*
        permite ejecutar un ciclo mientras la condición sea verdadera y se sale
        del bucle cuando es falsa. Hay que tener cuidado que no quede infinito
        */
        //programa que imprima números 0 al 9
        int x = 0;
        int y = 10;
        while (x < y){
            System.out.println("Vuelta del while número: " + x);
            x = x + 1;
        }
        
                
        //Ciclo Do While
        /*
        la diferencia con while es que la condición se evalua al final
        */
        //programa que imprima números 1 al 5
        int z = 0;
        
        do {            
            z = z + 1;
            System.out.println("Vuelta del do while número: " + z);
        } while (z < 5);
        
        
    }
 
}
