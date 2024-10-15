
package Modulo_2.pdfArreglosyColecciones;

import java.util.ArrayList;

public class ArreglosColecciones {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        //Arreglos
        /*
        se crean con la palabra new
        se declaran => tipoDato nombreArreglo[];
        */
        //ej:
        int edad[]; //declara arreglo enteros llamado edad
        
        float nota[]; //declara arreglo de reales llamado nota
        
        String nombre[]; //declara arreglo de caracteres
        
        /*
        Ahora lo inicializo:        
        Arreglo = new TipoDato[tamaño];
        */
        edad = new int[10]; //creación del arreglo edad con 10 posiciones
        
        nota = new float[15]; //creación del arreglo nota con 15 posiciones
        
        nombre = new String[5]; //creación del arreglo nombre con 5 posiciones
        
        /*
        lo mejor es crear e inicializar en la misma línea
        */
        
        int edad1 [] = new int [10]; //creación del arreglo edad con 10 posiciones
        
        float nota1 [] = new float [15]; //creación del arreglo nota con 15 posiciones
        
        String nombre1 [] = new String [5]; //creación del arreglo nombre con 5 posiciones
 
    //Ejemplo 1:
        /*
        Desarrolle un programa Java que muestre la declaración, creación, inicialización
        y consulta de un arreglo llamado edad con 3 posiciones tipo entero
        */
        int edad2[] = new int [3];
        
        edad2[0] = 18;
        edad2[1] = 20;
        edad2[2] = 15;
        
        for (int i = 0; i < 3; i++) {
            System.out.println("El valor del arreglo edad en la posicion " + i
                    + " es " +edad2[i]);
        }
        
        
    //Ejemplo 2:
        /*
        Desarrolle un programa que cree e inicialice en la misma línea de código
        un arreglo de 3 posiciones de tipo carcater con los nombres de 3 personas
        diferentes e imprimir en el arreglo
        */
        String [] nombre2 = new String[]{"Juan", "Pedro", "Diana"};
        for (int i = 0; i < 3; i++) {
            System.out.println(nombre2[i]);
        }
        
        //para conocer el largo del arreglo => nombreDelArray.length
        System.out.println("El número de elementos en el array nombre es de "
                + nombre2.length);
        
    
    //Ejemplo 3:
        /*
        Desarrolle un prograna que cree un arreglo de cadenas de texto de largo
        10 y despliegue el contenido de sus celdas por medio de un ciclo for each
        */
        
        String [] misNombres = new String [10];
        
        misNombres[0] = "Juan";
        misNombres[1] = "Pedro";
        misNombres[2] = "Diego";
        //se asignan los demmás valores del arreglo
        
        for (String tmpObjeto : misNombres) {
            System.out.println(tmpObjeto);
        }
        
    /* ------------------------------------------------------------------- */
    
        //ArrayList
        /*
        Es una clase que permite almacenar datos en memoria de formasimilar a
        los Arrays pero con la ventaja de que el número de elementos que
        almacena lo hace en forma dinámica asi que no necesita declarar tamaño
        */
        
    //Ejemplo 4:    
        /*
        Defina un elemento de tipo ArrayList y agregue a este 3 elementos
        después despliegue los valor y de forma separada el último valor
        */
        
        ArrayList<Integer> listaNums = new ArrayList<Integer>();
        
        listaNums.add(8);
        listaNums.add(3);
        listaNums.add(5);
        
        System.out.println("Lista de números: " + listaNums);
        
        System.out.println("Número posición 2: " + listaNums.get(2));
        
        //asigna un valor en la primera posición y despliega nuevamente
        listaNums.set(0, 15); //set para agregar - 0 posición - 15 valor
        System.out.println("Lista de numeros: "+ listaNums);
        
        
    }
}
