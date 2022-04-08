/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ3;

import EJ3.Servicios.ServicioEJ3;
import EJ3.Entidades.Alumno;
import EJ3.Entidades.Nota;
import java.util.*;

/**
 *
 * @author MegaTecnologia
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioEJ3 sp = new ServicioEJ3();
        List<Alumno> alumnoList = new ArrayList<>();
        String opcion;

        do {
            System.out.println("      PROMEDIADOR DE NOTAS     ");
            System.out.println("-------------------------------");
            System.out.println("");
            System.out.println("A) NUEVO ALUMNO    B) CONTINUAR       C) IMPRIMIR LISTA");
            System.out.println("");
            System.out.println("-------------------------------");
            System.out.println("Seleccione una opcion (A/B)");

            opcion = leer.next().toUpperCase();
            switch (opcion) {
                case "A":
                    alumnoList.add(sp.crearAlumno());
                    break;
                case "C":
                    for (Alumno aux : alumnoList) {
                        System.out.println(aux.getNombre() + ": " + aux.getNota().toString());
                    }
                    break;
            }

        } while (!opcion.equals("B"));

        Nota n1=new Nota();
        String opcion2;
        do {
            System.out.println("ESCRIBA EL NOMBRE DEL ALUMNO QUE DESEA PROMEDIAR");
            System.out.println("------------------------------------------------");
            String nombre = leer.next();
            double promedio = 0;
            for (Alumno aux : alumnoList) {
                if (aux.getNombre().equals(nombre)) {
                    promedio = (aux.getNota().getNota1()+ aux.getNota().getNota2()+aux.getNota().getNota3())/3;
                }
            }
            System.out.println("La nota final de "+nombre+"  es: "+ promedio);
            
            System.out.println("Si desea salir escriba ´B´, si desea cargar otro alumno, presione ENTER ");
            opcion2=leer.next().toUpperCase();

        } while (!opcion2.equals("B"));

        

    }
}
