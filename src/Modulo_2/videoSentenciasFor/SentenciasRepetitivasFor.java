package Modulo_2.videoSentenciasFor;
/*
con instancias repetitivas puedo buscar el mismo resultado
pidiendo los datos con for y con while
*/
public class SentenciasRepetitivasFor {
    public static void main(String[] args) {
        
       //SENTENCIA REPETITIVA FOR 
        for (int i = 0; i <= 10; i++) { //conto del 0 al 10
            System.out.println(i);
        }
        System.out.println("--- --- ---");
        
        //SENTENCIA REPETITIVA WHILE 
        int numero = 0;
        while (numero < 10) {
            numero++;
            System.out.println(numero);
        }
        
        //SENTENCIA REPETITIVA DO-WHILE
        do {
            numero++;
            System.out.println(numero
            );
        } while (numero < 10);
        
        
        
    }
}
