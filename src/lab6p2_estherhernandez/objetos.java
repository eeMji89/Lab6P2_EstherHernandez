
package lab6p2_estherhernandez;

import java.awt.Color;

/**
 * @author ELIZABETH HERNANDEZ
 */
public class objetos {
    private Color color;
    private String descripcion;
    private String marca;
    private int tamaño;
    private String calidad;
    private Personas p;

    public objetos() {
    }

    public objetos(Color color, String descripcion, String marca, int tamaño, String calidad, Personas p) {
        this.color = color;
        this.descripcion = descripcion;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.p = p;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Personas getP() {
        return p;
    }

    public void setP(Personas p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return "objetos{" + "color=" + color + ", descripcion=" + descripcion + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", calidad=" + calidad + ", p=" + p + '}';
    }
    
    
}
