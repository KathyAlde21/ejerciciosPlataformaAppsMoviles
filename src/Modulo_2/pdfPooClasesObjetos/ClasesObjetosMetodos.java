
package Modulo_2.pdfPooClasesObjetos;


public class ClasesObjetosMetodos {
    
    //Clase => se inicia con mayuscula, lleva {} atributos y objetos
    class Auto {
        String marca;
        String color;
        float velocidad;
        
        //metodo => subrutina que puede pertenecer a una clase u objeto y
        //lleva a cabo una acción
        void acelerar() {
            velocidad++;
        }

        void frenar() {
            velocidad = 0;
        }

        //constructor => metodo que asigna los valores iniciales del nuevo
        //objeto recién creado
        Auto() {

        }

        Auto (String marca, String color, float velocidad) {
            this.marca = marca;
            this.color = color;
            this.velocidad = velocidad;
        }        
    }
        
}
