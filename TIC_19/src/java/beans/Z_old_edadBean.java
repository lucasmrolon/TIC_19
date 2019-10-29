/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.swing.JOptionPane;


/**
 *
 * @author Alexis
 */
@Named(value = "edadBean")
@Dependent
public class Z_old_edadBean {

    private String nombre;
    private String apellido;
    private String fecha_nacimiento;
    private String edad;
    
    /**
     * Creates a new instance of edadBean
     */
    public String neew(){
        Date fecha_nac_date;
        try {
            fecha_nac_date = new SimpleDateFormat("dd/MM/yyyy").parse(this.fecha_nacimiento);
            LocalDate localDate = fecha_nac_date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int año_nacimiento  = localDate.getYear();
            Date fecha_actual = new Date();
            LocalDate localDate2 = fecha_actual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int año_actual = localDate2.getYear();
            int edad_entero = año_actual - año_nacimiento;
           this.edad = Integer.toString(edad_entero);
        } catch (ParseException ex) {
            Logger.getLogger(Z_old_edadBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "ejercicio2_1";
    }
    public Z_old_edadBean() {
       
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
