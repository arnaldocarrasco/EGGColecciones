/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4;

import EJ4.Entidades.Pelicula;
import EJ4.Servicio.ServicioEJ4;
import EJ4.Utilidades.Comparadores;
import java.util.*;

public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioEJ4 sp = new ServicioEJ4();
        List<Pelicula> peliculasList = new ArrayList<>();
        System.out.println("                         CINEMA PARADISO                   ");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("");
        String opcion;

        do {
            System.out.println("-------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------");
            System.out.println("A) CARGAR PELICULA               B) IMPRIMIR LISTA ");
            System.out.println("C) PELICULAS MAYOR A 1 HORA      D) LISTA S/DURACION DE + A -");
            System.out.println("E) LISTA S/DURACION DE - A +     F) LISTA POR TITULO");
            System.out.println("G) LISTA POR DIRECTOR            H) SALIR");
            System.out.println("-------------------------------");
            System.out.println("Seleccione una opcion");

            opcion = leer.next().toUpperCase();
            switch (opcion) {
                case "A":
                    peliculasList.add(sp.cargarPelicula());

                    break;
                case "B":
                    for (Pelicula aux : peliculasList) {
                        System.out.println(aux.toString());
                    }
                    break;
                case "C":
                    for (Pelicula aux : peliculasList) {
                        if (aux.getDuracion() > 1) {
                            System.out.println(aux.toString());
                        }
                    }
                    break;
                case "D":
                    Collections.sort(peliculasList, Comparadores.orderdurmay);
                    for (Pelicula aux : peliculasList) {
                        System.out.println(aux);
                    }
                    break;
                case "E":
                    Collections.sort(peliculasList, Comparadores.orderdurmen);
                    for (Pelicula aux : peliculasList) {
                        System.out.println(aux);
                    }
                    break;
                case "F":
                    Collections.sort(peliculasList, Comparadores.ordernom);
                    for (Pelicula aux : peliculasList) {
                        System.out.println(aux);
                    }
                    break;
                case "G":
                    Collections.sort(peliculasList, Comparadores.orderdir);
                    for (Pelicula aux : peliculasList) {
                        System.out.println(aux);
                    }
                    break;

            }

        } while (!opcion.equals("H"));
    }

}
