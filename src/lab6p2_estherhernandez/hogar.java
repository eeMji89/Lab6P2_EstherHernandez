
package lab6p2_estherhernandez;

import java.awt.Color;

/**
 * @author ELIZABETH HERNANDEZ
 */
public class hogar extends objetos {
    private String lugarc;
    private String funcionamiento;
    private int garantia;

    public hogar() {
        super();
    }

    public hogar(String lugarc, String funcionamiento, int garantia, Color color, String descripcion, String marca, int tamaño, String calidad, String persona) {
        super(color, descripcion, marca, tamaño, calidad, persona);
        this.lugarc = lugarc;
        this.funcionamiento = funcionamiento;
        this.garantia = garantia;
    }

    public String getLugarc() {
        return lugarc;
    }

    public void setLugarc(String lugarc) {
        this.lugarc = lugarc;
    }

    public String getFuncionamiento() {
        return funcionamiento;
    }

    public void setFuncionamiento(String funcionamiento) {
        this.funcionamiento = funcionamiento;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "hogar{" + "lugarc=" + lugarc + ", funcionamiento=" + funcionamiento + ", garantia=" + garantia + '}';
    }
    
    
}
