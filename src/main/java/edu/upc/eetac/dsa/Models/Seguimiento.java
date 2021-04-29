package edu.upc.eetac.dsa.Models;

//import jdk.vm.ci.meta.Local;
import org.joda.time.LocalDate;

import java.util.Date;

public class Seguimiento {

    LocalDate diaActual;    // formato yy:month:day
    String descripcion;

    public Seguimiento(){

        diaActual = new LocalDate();
        descripcion= null;

    }

    public LocalDate getDiaActual() {
        return diaActual;
    }

    public void setDiaActual() {
        this.diaActual = LocalDate.now();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
