/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ6.Servicios;

import java.util.*;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public String nombreProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nProd = leer.next().toUpperCase();

        return nProd;
    }

    public Double precioProd() {

        System.out.println("Ingrese el precio");
        Double pProd = leer.nextDouble();
        return pProd;
    }

    public String cambiarPrecio() {
        System.out.println("");
        System.out.println("Escriba el nombre del producto que desea modificar");
        String prodE = leer.next().toUpperCase();
        return prodE;
    }
}
