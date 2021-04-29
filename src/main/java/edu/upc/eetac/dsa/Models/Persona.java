package edu.upc.eetac.dsa.Models;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
//import sun.util.resources.LocaleData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Persona {

   //atributos, intenta que sean planos
    String nombre;
    Integer ide;
    String vacuna;
    LocalTime fecha;
    List<Seguimiento> seguimientos;



    //constructor
   public Persona(String nombre, int id){
       this.nombre=nombre;
       this.ide=id;
       //this.vacuna=null;
       fecha = new LocalTime();
       seguimientos = new ArrayList<>();


   }



   //geters and seters

    public String getVacuna() {
        return vacuna;
    }

    public void setVacuna(String vacuna) {
        this.vacuna = vacuna;
    }

    public String getNombre(){
       return this.nombre;
    }

    public Integer getIde(){
       return this.ide;
    }

    public LocalTime getFecha() {
        return fecha;
    }

    public void setFecha() {
        this.fecha = LocalTime.now();
    }

    public List<Seguimiento> getSeguimientos() {
        return seguimientos;
    }

    public void setSeguimientos(List<Seguimiento> seguimientos) {
        this.seguimientos = seguimientos;
    }


    //extras

    public void addSeguimiento( Seguimiento s){

       this.seguimientos.add(s);
    }






}
