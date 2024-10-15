package Modulo_2.videoSentenciasSwich;

public class SentenciasSwitch {
    public static void main(String[] args) {
        
       int numero=5;
      
        switch (numero) {
            case 1:
                System.out.println("el numero es 1");
                break;
            case 2:
                System.out.println("el numero es 2");
                break;
            case 3:
                System.out.println("el numero es 3");
                break;
                
            default:
                //throw new AssertionError();
                System.out.println("no es ninguno de los dos");
        }
        
    }
    
}
