package edu.upc.eetac.dsa;


import edu.upc.eetac.dsa.Models.Persona;
import edu.upc.eetac.dsa.Models.Seguimiento;
import edu.upc.eetac.dsa.Models.Vacuna;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ProductManagerImpl implements ProductManager {


     //estructuras de datos, declararlas
     private static ProductManager instance;
     private static Logger logger = Logger.getLogger(ProductManagerImpl.class);

     HashMap<String,Vacuna> vacunasSistema;
     List<Vacuna> listaVacunas;
     HashMap<Integer,Persona> usuariosSistema;
     List<Persona> listaPersonas;



    private ProductManagerImpl(){
       //costruir las estructuras de datos
        vacunasSistema = new HashMap<>();
        listaVacunas = new ArrayList<>();
        usuariosSistema = new HashMap<>();
        listaPersonas = new ArrayList<>();



    }

    //Singleton
    public static ProductManager getInstance(){
        if(instance == null) {
            instance = new ProductManagerImpl();
        }
        return instance;
    }






   //métodos override , recuerda añadir los loggers y los try catch errors


    @Override
    public void aplicarVacuna(int ideUsuario, String marcaVacuna) {

        //obtenemos el usuario y lo marcamos con la pertinente vacuna y fecha de vacunacion (formato hh:mm:ss:ns)
        Persona usuario = usuariosSistema.get(ideUsuario);
        usuario.setVacuna(marcaVacuna);
        usuario.setFecha();

        //incrementamos en 1 el numero de vacunas aplicadas para la pertinente vacuna
        Vacuna v = vacunasSistema.get(marcaVacuna);
        v.addAplicadas();





    }

    @Override
    public List<Persona> ordenarVacunasFecha() {
        return null;
    }

    @Override
    public List<Vacuna> ordenarVacunasCantidad() {
        return null;
    }

    @Override
    public void addSeguimiento(int idUsuario, String descripcion) {

        //obtenemos el usuario
        Persona u = usuariosSistema.get(idUsuario);
        //creamos una estructura de tipo seguimiento
        Seguimiento s = new Seguimiento();
        s.setDescripcion(descripcion);
        s.setDiaActual();

        u.addSeguimiento(s);





    }

    @Override
    public List<Seguimiento> getSeguimientos(int idUsuario) {

        Persona u = usuariosSistema.get(idUsuario);

        return u.getSeguimientos();
    }

    @Override
    public void clearInstances() {
        this.listaPersonas.clear();
        this.usuariosSistema.clear();
        this.listaVacunas.clear();





    }


    //extras
    public HashMap<Integer,Persona> getUsuariosSistema(){
        return this.usuariosSistema;
    }

    public HashMap<String, Vacuna> getVacunasSistema() {
        return vacunasSistema;
    }

    public void setVacunasSistema(HashMap<String, Vacuna> vacunasSistema) {
        this.vacunasSistema = vacunasSistema;
    }

    public List<Vacuna> getListaVacunas() {
        return listaVacunas;
    }

    public void setListaVacunas(List<Vacuna> listaVacunas) {
        this.listaVacunas = listaVacunas;
    }

    public void setUsuariosSistema(HashMap<Integer, Persona> usuariosSistema) {
        this.usuariosSistema = usuariosSistema;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }








    public void addVacuna(Vacuna v){
        listaVacunas.add(v);
    }

    public void addMapVacuna(Vacuna v){
        String marca = v.getMarca();
        vacunasSistema.put(marca,v);

    }

    public Vacuna getVacuna(String marcaVacuna){

        return vacunasSistema.get(marcaVacuna);
    }

    public void addUser(Persona p){

        int ide = p.getIde();
        usuariosSistema.put(ide,p);
    }

    public Persona getUser(int ide){

        return usuariosSistema.get(ide);
    }


}
