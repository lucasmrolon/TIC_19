/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
@Named(value = "edadBean")
@RequestScoped
public class edadBean {

    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private int edad;
    
    /**
     * Creates a new instance of edadBean
     */
    public edadBean() {
       
    }
    /*
    public String nacimiento_cadena(){
        Date fecha_nac = this.fecha_nacimiento;
        DateFormat dateFormat = new SimpleDateFormat("mm/dd/yyyy");  
        String fecha_nac_cadena = dateFormat.format(fecha_nac);
        return fecha_nac_cadena;
    } */
    
       
       /* 
    public int sacarEdad(){
      //  JOptionPane.showMessageDialog(null, "Se ingreso a sacarEdad");
        Date fecha_nac = this.fecha_nacimiento;
        Date fecha_act = new Date();
     //   System.out.println(fecha_nac);
        
        
        edad=99;
        return edad;
    }
        */ 


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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
    
}
