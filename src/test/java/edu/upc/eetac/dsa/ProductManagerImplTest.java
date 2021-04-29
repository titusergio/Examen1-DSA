package edu.upc.eetac.dsa;


import edu.upc.eetac.dsa.Models.Persona;
import edu.upc.eetac.dsa.Models.Vacuna;
import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;


//import logger para mensajes
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class ProductManagerImplTest {

    private static Logger logger = Logger.getLogger(ProductManagerImplTest.class);
    public ProductManager manager = null;


    //declarar variables

    /*
    HashMap<String, Vacuna> vacunasSistema;
    List<Vacuna> listaVacunas;
    HashMap<Integer, Persona> usuariosSistema;
    List<Persona> listaPersonas;

    */




    @Before
    public void setUp(){

        logger.info("Mensaje de informacion");
        logger.warn("Mensaje de alerta!!!!!");
        logger.error("Error!!!!!");

        //log4j properties????????????

        manager = ProductManagerImpl.getInstance();

        //inicilizar estructuras de datos con los valore  -->  variable = new Objeto(construir)
        /*
        vacunasSistema = new HashMap<>();
        listaVacunas = new ArrayList<>();
        usuariosSistema = new HashMap<>();
        listaPersonas = new ArrayList<>();
        */


        Vacuna vacuna1 = new Vacuna("pfizer");
        Vacuna vacuna2 = new Vacuna("moderna");
        Vacuna vacuna3= new Vacuna("astrazenica");



        manager.addVacuna(vacuna1);
        manager.addVacuna(vacuna2);
        manager.addVacuna(vacuna3);

        manager.addMapVacuna(vacuna1);
        manager.addMapVacuna(vacuna2);
        manager.addMapVacuna(vacuna3);



        Persona persona1 = new Persona("Toni",100);
        Persona persona2 = new Persona("Juan", 200);
        Persona persona3 = new Persona("Sergio",300);

        manager.addUser(persona1);
        manager.addUser(persona2);
        manager.addUser(persona3);









    }




    @Test

    public void vacunarUsuario(){

        this.manager.aplicarVacuna(100,"moderna");
        this.manager.aplicarVacuna(300,"moderna");
        Assert.assertEquals("moderna", manager.getUsuariosSistema().get(100).getVacuna());
        //Assert.assertEquals(1, manager.getVacuna("moderna").getNumAplicadas());
        int cantidad = manager.getVacuna("moderna").getNumAplicadas();
        Assert.assertEquals(2, cantidad);




        //manager.funcion()

        //Assert.assertEquals(expected,actual);


    }

    @Test
    public void seguimientoTest(){

        manager.addSeguimiento(100,"El paciente no reaciona bien a la medicación");
        manager.addSeguimiento(100,"El paciente empieza a mejorar");
        manager.addSeguimiento(100,"El paciente ha sido dado de alta");
        Assert.assertEquals(3,manager.getUser(100).getSeguimientos().size());

    }



   @After

    public void tearDown(){
        manager.clearInstances();
   }



}
