package videoArrayList;

import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        //ARREGLOS DINAMICOS
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add (3);
    
        lista.add(0,4);
        
        //para borrar un datos de la lista
        lista.remove(1); //borro el argumento1
     
     //   System.out.println(lista.size());
        System.out.println(lista.get(1));
        System.out.println(lista); //para ver con remove
    }
}
