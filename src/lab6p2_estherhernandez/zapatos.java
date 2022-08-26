/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_estherhernandez;

import java.awt.Color;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class zapatos extends objetos {
    private int talla;
    private String descrz;
    private int comodidad;

    public zapatos() {
        super();
    }

    public zapatos(int talla, String descrz, int comodidad, Color color, String descripcion, String marca, int tamaño, String calidad, Personas p) {
        super(color, descripcion, marca, tamaño, calidad, p);
        this.talla = talla;
        this.descrz = descrz;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getDescrz() {
        return descrz;
    }

    public void setDescrz(String descrz) {
        this.descrz = descrz;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "zapatos{" + "talla=" + talla + ", descrz=" + descrz + ", comodidad=" + comodidad + '}';
    }
    
    
    
}
