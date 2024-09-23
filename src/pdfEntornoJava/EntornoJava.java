
package pdfEntornoJava;

public class EntornoJava {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //Utilizando el String str obtener:
        String str = "El primer programa";
        
        //numero de carcateres => length
        int longitud = str.length();
        
        //con que parte true o false
        Boolean resultado = str.startsWith("El");
        
        //saber con que finaliza true o false
        Boolean resultadoF = str.endsWith("programa");
        
        //indicar en que lugar está por primera vez una letra
        int pos = str.indexOf("p");
        
        //las otras posiciones de la misma letra
        pos = str.indexOf("p", pos+1);
        
        //primera ocurrencia de un substring
        int pos2 = str.indexOf("pro"); 
        
    /* ----------------------------------------------------------- */
        //Comparación de Strings
        String str1="El lenguaje Java";
        String str2=new String("El lenguaje Java");
        
        // == los compara y deben ser iguales para que se cumpla
        if (str1 == str2) {
            System.out.println("Los mismos objetos");
        } else {
            System.out.println("Distintos objetos");
        }
                
        //equals 
        if (str1.equals(str2)) {
            System.out.println("El mismo contenido");
        } else {
            System.out.println("Distinto contenido");
        }
        
        //para asegurar que son iguales y tener un boolean
        String str3 = "El lenguaje Java";
        String str4 = str3;
        
        System.out.println("Son el mismo objeto: "+ (str3 == str4));
        
        String str5 = "El lenguaje Java";
        Boolean resultado5 = str5.equals("El lenguaje Java");
        
    /* --------------------------------------------------------- */
        //Convertir un número a String
        int valor = 10;
        String strValor = String.valueOf(valor);

    }
}
