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
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jamil
 */
public class Inventario {

    private ArrayList<Productos> producto = new ArrayList();
    private File archivo = null;

    public Inventario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Productos> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Productos> producto) {
        this.producto = producto;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Inventario{" + "producto=" + producto + ", archivo=" + archivo + '}';
    }

    public void EscribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Productos p : producto) {
                if (p instanceof Comida) {
                    Comida c = (Comida) p;
                    bw.write("Comida" + ",");
                    bw.write(c.getNombre() + ",");
                    bw.write(c.getPreciocosto() + ",");
                    bw.write(c.getPrecioventa() + ",");
                    bw.write(c.getTipocomida() + ",");

                } else if (p instanceof Bebidas) {
                    Bebidas b = (Bebidas) p;
                    bw.write("Bebida" + ",");
                    bw.write(b.getNombre() + ",");
                    bw.write(b.getPreciocosto() + ",");
                    bw.write(b.getPrecioventa() + ",");
                    bw.write(b.getEstado() + ",");
                    bw.write(b.getTamaño() + ",");
                    bw.write(b.getTipo() + ",");
                }
            }
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {

        }

    }

    public void CargarArchivo() {
        Scanner sc = null;
        producto = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    if (sc.next().equals("Comida")) {

                        String n = sc.next();
                        String tp = sc.next();
                        double pv = sc.nextDouble();
                        double pc = sc.nextDouble();

                        producto.add(new Comida(tp, pc, pv, n));

                    } else if (sc.next().equals("Bebida")) {
                        String n = sc.next();
                        double pv = sc.nextDouble();
                        double pc = sc.nextDouble();
                        String estado = sc.next();
                        String tam = sc.next();
                        String tipo = sc.next();

                        producto.add(new Bebidas(estado, tam, tipo, pc, pv, n));
                    }
                }
            } catch (Exception e) {
            }
            sc.close();
        }

    }

}
