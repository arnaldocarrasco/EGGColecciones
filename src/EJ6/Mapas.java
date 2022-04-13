/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ6;

import EJ6.Servicios.Servicios;
import java.util.*;

/**
 *
 * @author MegaTecnologia
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        HashMap<String, Double> productos = new HashMap<>();
        Servicios sp = new Servicios();

        productos.put("REMERA", 2500.00);
        productos.put("PANTALON", 5800.00);
        productos.put("CAMISA", 4650.60);
        productos.put("CAMPERA", 12000.60);
        productos.put("BOINA", 1200.60);
        String opcion;
        do {
            System.out.println("----------------------------------------------------");
            System.out.println("                Sistema de Stock                    ");
            System.out.println("----------------------------------------------------");
            System.out.println("A) Agregar Producto       B) Modificar Precio");
            System.out.println("C) Eliminar un producto   D)Mostrar lista de precios");
            System.out.println("E) Salir");
            System.out.println("----------------------------------------------------");
            System.out.println("");
            System.out.println("Selecione una opcion");
            opcion = leer.next().toUpperCase();

            switch (opcion) {

                case "A":
                    productos.put(sp.nombreProducto(), sp.precioProd());
                    break;
                case "B":
                    for (Map.Entry<String, Double> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println("Producto: " + key + ". Precio: " + value + ".");
                    }
                    String x = sp.cambiarPrecio();
                    for (Map.Entry<String, Double> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        if (key.equals(x)) {
                            System.out.println("Ingrese el nuevo precio");
                            aux.setValue(leer.nextDouble());
                            System.out.println("");
                            System.out.println("Precio modificado");
                            break;
                         
                        }
                    }
                    break;
                case "C":
                    System.out.println("Escriba el nombre del producto que desea eliminar");
                    System.out.println("");
                     for (Map.Entry<String, Double> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println("Producto: " + key + ". Precio: " + value + ".");
                    }
                     System.out.println("---------------------------------");
                     x=leer.next().toUpperCase();
                     System.out.println("");
                     for (Map.Entry<String, Double> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                         if (key.equals(x)) {
                             productos.remove(key);
                             break;
                         }  
                    }
                     break;
                case "D":
                     for (Map.Entry<String, Double> aux : productos.entrySet()) {
                        String key = aux.getKey();
                        Double value = aux.getValue();
                        System.out.println("Producto: " + key + ". Precio: " + value + ".");
                    }
                    break;
                    
            }

        } while (!opcion.equals("E"));
    }

}
