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
public class Bebidas extends Productos {

    private String estado;
    private String tamaño;
    private String tipo;

    public Bebidas() {
    }

    public Bebidas(String estado, String tamaño, String tipo, double preciocosto, double precioventa, String nombre) {
        super(preciocosto, precioventa, nombre);
        this.estado = estado;
        this.tamaño = tamaño;
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bebidas{" + "estado=" + estado + ", tama\u00f1o=" + tamaño + ", tipo=" + tipo + '}';
    }

}
