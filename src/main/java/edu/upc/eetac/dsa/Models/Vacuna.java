package edu.upc.eetac.dsa.Models;

public class Vacuna {

    //atributos
    String marca;
    Integer numAplicadas;

    //constructor
    public Vacuna(String nombre) {
        this.marca=nombre;
        this.numAplicadas=0;

    }






    //getters and seters


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getNumAplicadas() {
        return numAplicadas;
    }

    public void setNumAplicadas(Integer numAplicadas) {
        this.numAplicadas = numAplicadas;
    }


    //extras
    public void addAplicadas(){

        this.numAplicadas+=1;
    }
}
