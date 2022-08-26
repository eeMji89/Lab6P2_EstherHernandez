/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_estherhernandez;

/**
 *
 * @author ELIZABETH HERNANDEZ
 */
public class gerente extends Personas {
    private String usuario;
    private String password;
    private String cargo;

    public gerente() {
        super();
    }
    
    
    public gerente(String usuario, String password, String cargo, String ID, String nombre, int edad, String sexo, String estado, int altura, int peso) {
        super(ID, nombre, edad, sexo, estado, altura, peso);
        this.usuario = usuario;
        this.password = password;
        this.cargo = cargo;
    }

   

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "gerente{" + "usuario=" + usuario + ", password=" + password + ", cargo=" + cargo + '}';
    }

   
    
}
