/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ4.Utilidades;

import EJ4.Entidades.Pelicula;
import java.util.Comparator;

/**
 *
 * @author MegaTecnologia
 */
public class Comparadores {
     // CASE D: Duracion de mayor a menor
    public static Comparator<Pelicula> orderdurmay = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t1.getDuracion().compareTo(t.getDuracion());

        }
    };

    // CASE E: Duracion de menor a mayor
    public static Comparator<Pelicula> orderdurmen = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {

            return t.getDuracion().compareTo(t1.getDuracion());

        }
    };

    //CASE F: POR TTULO
    public static Comparator<Pelicula> ordernom = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };

    //CASE G: POR DIRECTOR
    public static Comparator<Pelicula> orderdir = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
