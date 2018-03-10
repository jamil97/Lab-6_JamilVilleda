/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jamilvileda;

/**
 *
 * @author Jamil
 */
public class Comida extends Productos {

    private String tipocomida;

    public Comida() {
    }

    public Comida(String tipocomida) {
        this.tipocomida = tipocomida;
    }

    public Comida(String tipocomida, double preciocosto, double precioventa, String nombre) {
        super(preciocosto, precioventa, nombre);
        this.tipocomida = tipocomida;
    }

    public String getTipocomida() {
        return tipocomida;
    }

    public void setTipocomida(String tipocomida) {
        this.tipocomida = tipocomida;
    }

    @Override
    public String toString() {
        return "Comida{" + "tipocomida=" + tipocomida + '}';
    }

    
    
    
}
