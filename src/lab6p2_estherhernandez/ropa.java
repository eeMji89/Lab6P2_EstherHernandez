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
public class ropa extends objetos {
    private String tallap;
    private String tela;
    private String pais;

    public ropa() {
        super();
    }

    public ropa(String tallap, String tela, String pais, Color color, String descripcion, String marca, int tamaño, String calidad, String persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.tallap = tallap;
        this.tela = tela;
        this.pais = pais;
    }

    public String getTallap() {
        return tallap;
    }

    public void setTallap(String tallap) {
        this.tallap = tallap;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "ropa{" + "tallap=" + tallap + ", tela=" + tela + ", pais=" + pais + '}';
    }
    
}
