package edu.upc.eetac.dsa.Models;

import java.util.ArrayList;
import java.util.List;



public class Usuario {

   private String nombre;
   private int id;
   //"edad para restringir ciertos productos +18"
   private List<Pedido> pedidosUser = new ArrayList<>();   //array o linked ??






    //constructor
    public Usuario(String nombre) {

        this.nombre = nombre;
    }





    //getters ans seters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }

    public List<Pedido> getPedidosUser() {
        return pedidosUser;
    }

    public void setPedidosUser(List<Pedido> pedidosUser) {
        this.pedidosUser = pedidosUser;
    }


    public void addPedido(Pedido p){

        this.pedidosUser.add(p);
    }
}
