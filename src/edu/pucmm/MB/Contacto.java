package edu.pucmm.MB;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by Dany on 17/09/2017.
 */
public class Contacto {
    @Size(min = 5, max = 10)
    private String nombre;
    @NotBlank
    private String apellido;

    private String direccion;

    private String telefono;

    private String email;

    public Contacto() {
    }

    public Contacto(String nombre, String apellido, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direction
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * @param direccion the direction to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
