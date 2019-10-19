/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author lucas
 */
@Named(value = "hourBean")
@Dependent
public class HourBean {

    SimpleDateFormat format;
    int hora;
    String mensaje,bodycolor,fontcolor;
    
    public HourBean() {
        format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Calendar actual= Calendar.getInstance();
        int hora = actual.get(Calendar.HOUR_OF_DAY);
         if (hora<=12 && hora>=8){
            mensaje = "¡Buenos días!";
            bodycolor="#F3F781";
            fontcolor="#FF0000";
         }
        else if (hora>12 && hora<20){
            mensaje = "¡Buenas tardes!";
            bodycolor="#FE9A2E";
            fontcolor="#FFFF00";
        }
            
        else{
            mensaje = "¡Buenas noches!";
            bodycolor="#000000";
            fontcolor="#FFFFFF";
        }
    }
    
    public String getHour(){
        return mensaje;
    }
    
    public String getBodyColor(){
        return bodycolor;
    }
    public String getFontColor(){
        return fontcolor;
    }
}
