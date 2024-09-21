package videoMath;

//la clase Math permite hacer operaciones matemáticas

public class ClaseMath {
    
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //Redondear a entero más cercano
        double redondea1 = Math.round(23.445); //entero 23
        double redondea2 = Math.round(23.545); //entero 24
        
        System.out.println(redondea1);
        System.out.println(redondea2);
        
        //Redondeo a entero más cercano hacia arriba
        double redondea3 = Math.ceil(7.434); // => 8
        System.out.println(redondea3);
        
        //Redondeo a entero más cercano hacia abajo
        double redondea4 = Math.floor(7.434); // => 7
        System.out.println(redondea4);
        
        //El máximo número entre dos números
        int mayor = Math.max(10,30);
        System.out.println(mayor);
        
        //El mínimo número entre dos números
        int menor = Math.min(10,30);
        System.out.println(menor);
        
        //Número random entre el 0 y el 1
        double aleatorio1 = Math.random();
        System.out.println(aleatorio1);
        
        //random de 0 a 100
        double aleatorio2 = Math.random() * 100D;
        System.out.println(aleatorio2);
        
        //elevar un número => primero número a elevar y 2do número por el que se va a elevar
        //ej 3 elevado a 2 = 9
        double elevar = Math.pow(3,2);
        System.out.println(elevar);
        
        //raíz cuadrada
        double raiz = Math.sqrt(25);
        System.out.println(raiz);
        
    }
}
