/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jamilvileda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class Factura {

    private ArrayList<Productos> productos = new ArrayList();
    private String correoelectronico;
    private String nombrecliente;
    private String RTN;
    private String Cai;
    private String fecha;
    private File archivo = null;

    public Factura() {
    }

    public Factura(String path) {
        archivo = new File(path);
    }

    public Factura(String path, String correoelectronico, String nombrecliente, String RTN, String Cai, String fecha) {
        archivo = new File(path);
        this.correoelectronico = correoelectronico;
        this.nombrecliente = nombrecliente;
        this.RTN = RTN;
        this.Cai = Cai;
        this.fecha = fecha;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getRTN() {
        return RTN;
    }

    public void setRTN(String RTN) {
        this.RTN = RTN;
    }

    public String getCai() {
        return Cai;
    }

    public void setCai(String Cai) {
        this.Cai = Cai;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Factura{" + "productos=" + productos + ", correoelectronico=" + correoelectronico + ", nombrecliente=" + nombrecliente + ", RTN=" + RTN + ", Cai=" + Cai + ", fecha=" + fecha + '}';
    }

    public void EscribirArchivo(Factura f) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {

            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write("                          " + "Dunkin Donuts \n ");
            bw.write("Fecha:        " + f.fecha + " \n ");
            bw.write("Correo Electronico:              " + f.getCorreoelectronico() + " \n ");
            bw.write("Nombre cliente:              " + f.getNombrecliente() + " \n ");
            bw.write("Productos                     " + " \n ");
            for (int i = 0; i < f.getProductos().size(); i++) {
                bw.write("Producto:       " + f.getProductos().get(i).getNombre() + "Precio:  " + +f.getProductos().get(i).getPrecioventa() + " \n ");
            }
//            for (Productos p : f.getProductos()) {
//                Comida c = (Comida) p;
//                Bebidas b = (Bebidas) p;
//                bw.write("Producto:       " + p + "Precio:  " + p + p.getPrecioventa() + " \n ");
//            }    
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }

}
