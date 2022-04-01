/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1.SERVICIOS;

import EJ1.ENTIDADES.RazasPerros;
import java.util.*;

/**
 *
 * @author MegaTecnologia
 */
public class Servicio {

    private List<RazasPerros> perrosList = new ArrayList<>();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Menu1() {

        String opcion;
        Servicio sp = new Servicio();
        do {

            System.out.println("BIENVENIDO");
            System.out.println("ELIJA UNA OPCION");
            System.out.println("A) CARGAR UNA RAZA");
            System.out.println("B) CONTINUAR CON EL SIGUIENTE PASO");
            System.out.println("-------------------------------------");
            opcion = leer.next().toUpperCase();

            switch (opcion) {
                case "A":
                    perrosList.add(sp.crearPerro());
                    break;
                case "B":
                    for (RazasPerros aux : perrosList) {
                        System.out.println(aux.toString());
                    }
                    sp.Menu2();
                    for (RazasPerros aux : perrosList) {
                        System.out.println(aux.toString());
                    }
                    break;
            }

        } while (!opcion.equals("B"));

    }

    public RazasPerros crearPerro(RazasPerros razasPerros) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el nombre de la raza");
        razasPerros.setRaza(leer.next());

        return new RazasPerros();
    }

    public void Menu2() {
        String opcion;
        Servicio sp = new Servicio();

        System.out.println("Acontinuacion Escriba el nombre de una /n de las mascotas de la lista.");
        String buscar = leer.next();

        Iterator<RazasPerros> it = perrosList.iterator();

        while (it.hasNext()) {
            String encontrado = it.next().getRaza();
            if (buscar.equals(encontrado)) {
                it.remove();
            }
        }

    }
}
