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
public class Productos {

    private double preciocosto;
    private double precioventa;
    private String nombre;

    public Productos() {
    }

    public Productos(double preciocosto, double precioventa, String nombre) {
        this.preciocosto = preciocosto;
        this.precioventa = precioventa;
        this.nombre = nombre;
    }

    public double getPreciocosto() {
        return preciocosto;
    }

    public void setPreciocosto(double preciocosto) {
        this.preciocosto = preciocosto;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productos{" + "preciocosto=" + preciocosto + ", precioventa=" + precioventa + ", nombre=" + nombre + '}';
    }

  

}
