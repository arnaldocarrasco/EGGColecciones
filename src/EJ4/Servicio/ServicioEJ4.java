/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4.Servicio;

import EJ4.Entidades.Pelicula;
import java.util.*;

/**
 *
 * @author MegaTecnologia
 */
public class ServicioEJ4 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //CASE A
    public Pelicula cargarPelicula() {
        Pelicula p1 = new Pelicula();
        System.out.println("Escriba el nombre de la pelicula");
        p1.setTitulo(leer.next());
        System.out.println("Escriba el nombre del director");
        p1.setDirector(leer.next());
        System.out.println("Escriba la duracion de la pelicula");
        p1.setDuracion(leer.nextInt());
        return p1;
    }

   
}
