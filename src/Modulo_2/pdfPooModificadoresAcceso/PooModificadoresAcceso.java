
package Modulo_2.pdfPooModificadoresAcceso;

import java.util.*;

public class PooModificadoresAcceso {
    
    //Hay 4 tipos de modificadores de acceso:
    //public, private, protected y default
    
    
    class Auto {
        private String marca;
        private String color;
        private float velocidad;
        
        //metodo => subrutina que puede pertenecer a una clase u objeto y
        //lleva a cabo una acción
        public void acelerar() {
            velocidad++;
        }

        public void frenar() {
            velocidad = 0;
        }

        //constructor => metodo que asigna los valores iniciales del nuevo
        //objeto recién creado
        public Auto() {

        }

        public Auto (String marca, String color, float velocidad) {
            this.marca = marca;
            this.color = color;
            this.velocidad = velocidad;
        } 
        
        //Accesador => metodo que usa prefijo get al principio del nombre
        //devuelve el valor de un campo privado 
        public String getMarca() {
            return marca;
        }

        public String getColor() {
            return color;
        }

        public float getVelocidad() {
            return velocidad;
        }
        
        //Mutador => metodo que usa pefijo set al principio del nombre
        //establece el valor de un campo privado
        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setVelocidad(float velocidad) {
            this.velocidad = velocidad;
        }
        
        //COLABORACIÓN ENTRE OBJETOS
        //- es común que se use la POO con más de una clase
        //- la colaboración pyede ser entre clases o entre instancias
        
        //Asociación:
        //expresa una relación, de una dirección o bidireccional, entre las
        //instancias a partir de las clases conectadas
        
        /*
        Todo-Parte:
        - una instancia forma parte de otra, hay dos tipos:
        -- Agregación => asociación binaria que representa una relación todo-parte
        por ej un centro comercial tiene clientes
        -- Composición => forma fuerte de composición, donde la vida de la clase
        contenida debe coincidir con la vida de la clase contenedor
        por ej una empresa contiene muchos empleados
        */
           
    }//fin clase auto
    
}
