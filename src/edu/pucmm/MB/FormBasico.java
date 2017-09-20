package edu.pucmm.MB;

import com.sun.faces.context.flash.ELFlash;
import org.hibernate.validator.constraints.NotBlank;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.context.Flash;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by vacax on 05/09/16.
 */
@Named("miFormulario")
//@ManagedBean("miFormulario") //Si no tenemos CDI debemos utiliar la clase javax.faces.bean.ManagedBean
@SessionScoped
public class FormBasico implements Serializable {
    public static ArrayList<Contacto> contactos = new ArrayList<>();

    @Size(min = 2, max = 10)
    @NotBlank
    private String nombre;
    @Size(min = 2, max = 10)
    @NotBlank
    private String apellido;

    private String direccion;

    private String telefono;

    private String email;

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



    //Una vez inicializado el bean se ejecuta el metodo
    @PostConstruct
    private void inicializando(){
        System.out.println("Subiendo el Beans de formulario....");
    }

    //Antes de destruir el ManagedBean es ejecutado este metodo.
    @PreDestroy
    private void destruyendo(){
        System.out.println("Destruyendo el Beans de formulario....");
    }


    /**
     * Por defecto la llamada se ejecuta vía POST
     * @return
     */
    public String procesarFormularioMetodoPost() {
       Contacto contacto = new Contacto(nombre, apellido,direccion, telefono, email);
        contactos.add(contacto);
        limpiarDatos();
        System.out.println(nombre+"/"+apellido+"/"+direccion+"/");
        return "resultado?param1="+nombre+"&param2="+apellido; //regla de navegacion....
    }

    /**
     * Limpiando las variables.
     * @return
     */
    public void limpiarDatos() {
        nombre = "";
        apellido = "";
        direccion ="";
        telefono="";
        email ="";
    }



}
