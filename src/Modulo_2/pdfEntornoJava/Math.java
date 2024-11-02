package Modulo_2.pdfEntornoJava;

public class Math {
   /* public static void main(String[] args) {
        System.out.println("Hola Mundo");
    } */
        
    //Clase Math
    /* define entre otras cosas dos constantes muy útiles: el número pi y
    el número e */
        
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846; 
    static {
        
        System.out.println("Pi es " + Math.PI);
        System.out.println("e es " + Math.E);
    }
    
    
    public static int abs(int a){
        return (a < 0) ? -a : a;
    }
    
    public static long abs(long a) {
        return (a < 0) ? -a : a;
    }
    
    public static float abs(float a){
        return (a < 0) ? -a : a;
    }
    
    public static double abs(double a){
        return (a < 0) ? -a : a;
    }
    
    //para poder continuar llame main acá
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //raíz cuadrada de un número con sqrt
    //    System.out.println("La raíz cuadrada de " + x + " es " + Math.sqrt(x));
    
    /* 
        para expresar un número real limitando los decimale se emplea la
        función round, ej:
    */
    /*  
        double x = 72.3543;
        double y = 0.3498;
        System.out.println(x + " es aprox. " + (double)Math.round(x*100)/100); //72.35
        System.out.println(y + " es aprox. " + (double)Math.round(y*100)/100); //0.35
        
        System.out.println(x + " es aprox. " + Math.floor(x*100)/100); //72.35
        System.out.println(y + " es aprox. " + Math.floor(y*100)/100); //0.34 
    */
    /*
        //mayor y menor entre dos números
        int i = 7;
        int j = -9;
        double x = 72.3543;
        double y = 0.3498;
    */
    /*    
        // para hallar el menor de dos números
        System.out.println("min(" + i + "," + j + ") es " + Math.min(i,j));
        System.out.println("min(" + x + "," + y + ") es " + Math.min(x,y));
       
        // Para hallar el mayor de dos números
        System.out.println("max(" + i + "," + j + ") es " + Math.max(i,j));
        System.out.println("max(" + x + "," + y + ") es " + Math.max(x,y));
        
        System.out.println("Número aleatorio: " + Math.random());
        System.out.println("Otro número aleatorio: " + Math.random());
    */   
    }
    /*
    private static String random() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */
}
