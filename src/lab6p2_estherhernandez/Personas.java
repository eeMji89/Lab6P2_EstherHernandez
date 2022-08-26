/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class Personas {
    private String ID;
    private String nombre;
    private int edad;
    private String sexo;
    private String estado;
    private int altura;
    private int peso;

    public Personas() {
    }

    public Personas(String ID, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estado = estado;
        this.altura = altura;
        this.peso = peso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Personas{" + "ID=" + ID + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estado=" + estado + ", altura=" + altura + ", peso=" + peso + '}';
    }
    
    
}
