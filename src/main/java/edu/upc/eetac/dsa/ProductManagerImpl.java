package edu.upc.eetac.dsa;


import edu.upc.eetac.dsa.Models.Pedido;
import edu.upc.eetac.dsa.Models.Producto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

import org.apache.log4j.Logger;


public class ProductManagerImpl implements ProductManager {


     //estructuras de datos, declararlas
     private static ProductManager instance;
     private static Logger logger = Logger.getLogger(ProductManagerImpl.class);


    private ProductManagerImpl(){
       //costruir las estructuras de datos


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
    public void clearInstances() {

    }
}
