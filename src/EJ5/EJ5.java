/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ5;

import java.util.*;

/**
 *
 * @author MegaTecnologia
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Set<String> colPaises = new TreeSet<>();
        String pais;
        do {
            System.out.println("Ingrese un pais o escriba ´OK´ para continuar");
            pais = leer.next().toUpperCase();
            if (!pais.equals("OK")) {
                colPaises.add(pais);
            }
        } while (!pais.equals("OK"));

        for (String aux : colPaises) {
            System.out.println(aux.toString());
        }

        System.out.println("Elija un pais de la lista para ser eliminado");
        String paisborrar = leer.next().toUpperCase();

        Iterator<String> it = colPaises.iterator();
        
        while (it.hasNext()) {
            String aux = it.next();
            if (aux.equals(paisborrar)) {
                it.remove();
            }

        }
        for (String aux : colPaises) {
            System.out.println(aux.toString());
        }
    }

}
