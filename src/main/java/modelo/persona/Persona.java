/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.persona;

/**
 *
 * @author Alumno
 */
public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private String telefono;
    private String email;

    public Persona(){
        super();
    }
    
    public Persona(String nombre, String apellido, int dni, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String toString(){
        return "NOMBRE: "+this.nombre+ " APELLIDO: "
                +this.apellido+" DNI: "
                +this.dni+ " TELEFONO "
                +this.telefono
                +" EMEIL: "+this.email;
    }
    public abstract String genetarCodigo();
}