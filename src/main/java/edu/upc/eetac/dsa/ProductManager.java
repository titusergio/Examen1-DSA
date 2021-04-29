package edu.upc.eetac.dsa;


import edu.upc.eetac.dsa.Models.Persona;
import edu.upc.eetac.dsa.Models.Seguimiento;
import edu.upc.eetac.dsa.Models.Vacuna;

import java.util.HashMap;
import java.util.List;

public interface ProductManager {


    //funcionalidades enunciado  ->> implementarlas con override

    public void aplicarVacuna(int ideUsuario, String marcaVacuna);

    public List<Persona> ordenarVacunasFecha();

    public List<Vacuna> ordenarVacunasCantidad();

    public void addSeguimiento(int idUsuario, String descripcion);

    public List<Seguimiento> getSeguimientos( int idUsuario);





    //funcionalidades extras requeridas


    public void clearInstances();

    public HashMap<Integer,Persona> getUsuariosSistema();

    public void addVacuna(Vacuna v);

    public void addUser(Persona p);

    public void addMapVacuna(Vacuna v);

    public Vacuna getVacuna(String marcaVacuna);

    public Persona getUser(int ide);
































}
