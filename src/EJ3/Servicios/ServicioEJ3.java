/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3.Servicios;

import EJ3.Servicios.ServicioEJ3;
import EJ3.Entidades.Alumno;
import EJ3.Entidades.Nota;
import java.util.*;

/**
 *
 * @author MegaTecnologia
 */
public class ServicioEJ3 {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        ServicioEJ3 sp = new ServicioEJ3();
        Alumno al1 = new Alumno();
        System.out.println("Escriba el nombre del alumno");
        al1.setNombre(leer.next());
        System.out.println("Escriba las tres notas");
        Nota n1=new Nota();
        n1=sp.cargarNota();
        al1.setNota(n1);
        
        return al1;
    }

    public Nota cargarNota() {

        Nota n1 = new Nota();
        System.out.println("Cargue las notas en orden");
        n1.setNota1(leer.nextInt());
        n1.setNota2(leer.nextInt());
        n1.setNota3(leer.nextInt());
        return n1;
    }
    
    
}
