/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Alexis
 */
@Named(value = "edadBean")
@RequestScoped
public class edadBean {

    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    
    /**
     * Creates a new instance of edadBean
     */
    public edadBean() {
        
    }
    
    public String sacarEdad(){
        
        Date fecha_nac = this.fecha_nacimiento;
        Date fecha_act = new Date();
        
        
        return edad;
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

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
