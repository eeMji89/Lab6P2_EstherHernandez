
package lab6p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class general extends Personas {
    private String ocupacion;
    private String horario;
    private int tiempo;
    private double sueldo;

    public general() {
        super();
    }

    public general(String ocupacion, String horario, int tiempo, double sueldo, String ID, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(ID, nombre, edad, sexo, estado, altura, peso);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.tiempo = tiempo;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "general{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", tiempo=" + tiempo + ", sueldo=" + sueldo + '}';
    }
    
    
}
