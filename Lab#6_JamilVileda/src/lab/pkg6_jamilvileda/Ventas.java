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
public class Ventas {

    private double totalventas;
    private String fechaventas;

    public Ventas() {
    }

    public Ventas(double totalventas, String fechaventas) {
        this.totalventas = totalventas;
        this.fechaventas = fechaventas;
    }

    public double getTotalventas() {
        return totalventas;
    }

    public void setTotalventas(double totalventas) {
        this.totalventas = totalventas;
    }

    public String getFechaventas() {
        return fechaventas;
    }

    public void setFechaventas(String fechaventas) {
        this.fechaventas = fechaventas;
    }

    @Override
    public String toString() {
        return "Ventas{" + "totalventas=" + totalventas + ", fechaventas=" + fechaventas + '}';
    }

}
