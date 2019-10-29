/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;
import java.time.LocalDate;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.time.Period;


@ManagedBean(name = "IndexBackBean")
@SessionScoped  

public class IndexBackBean implements Serializable{
    
    private String nombre;
    private String apellido;
    private String fecha_ingresada;
    private Integer edad;

    public String getFecha_ingresada() {
        return fecha_ingresada;
    }

    public void setFecha_ingresada(String fecha_ingresada) {
        this.fecha_ingresada = fecha_ingresada;
    }
     
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void calcularEdad(){
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
        LocalDate fecha_nacimiento = LocalDate.parse(this.fecha_ingresada, fecha); 
        LocalDate fecha_actual = LocalDate.now();   
        Period periodo = Period.between(fecha_nacimiento, fecha_actual);
        this.edad = periodo.getYears();
    }

    public Integer getEdad() {
        calcularEdad();
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    
}