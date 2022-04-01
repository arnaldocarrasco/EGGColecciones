/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1.ENTIDADES;

/**
 *
 * @author MegaTecnologia
 */
public class RazasPerros {
    private String raza;

    public RazasPerros() {
    }

    public RazasPerros(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return raza;
    }
    
    
}
