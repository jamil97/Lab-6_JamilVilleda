/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_jamilvileda;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Jamil
 */
public class Ingresos {

    private ArrayList<Ventas> ventas = new ArrayList();
    File file = null;

    public Ingresos() {
    }

    public ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public void setVentas(ArrayList<Ventas> ventas) {
        this.ventas = ventas;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Ingresos{" + "ventas=" + ventas + ", file=" + file + '}';
    }
    
    
}
