package edu.upc.eetac.dsa;


import edu.upc.eetac.dsa.Models.Pedido;
import edu.upc.eetac.dsa.Models.Producto;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.Assert;


//import logger para mensajes
import org.apache.log4j.Logger;


public class ProductManagerImplTest {

    private static Logger logger = Logger.getLogger(ProductManagerImplTest.class);
    public ProductManager manager = null;


    //declarar variables




    @Before
    public void setUp(){

        logger.info("Mensaje de informacion");
        logger.warn("Mensaje de alerta!!!!!");
        logger.error("Error!!!!!");

        //log4j properties????????????

        manager = ProductManagerImpl.getInstance();

        //inicilizar estructuras de datos con los valore  -->  variable = new Objeto(construir)

    }




    @Test

    public void realizarPedido(){

        //manager.funcion()

        //Assert.assertEquals(expected,actual);




    }




   @After

    public void tearDown(){
        manager.clearInstances();
   }



}
