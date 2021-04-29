package edu.upc.eetac.dsa.services;


import edu.upc.eetac.dsa.Models.Producto;
import edu.upc.eetac.dsa.ProductManager;
import edu.upc.eetac.dsa.ProductManagerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;





@Api(value = "/restauracion", description = "Servicios del usuario")  //documentació
@Path("/restauracion")   //ruta http

public class ServicioRestauracion {

    private ProductManager pm;

    public ServicioRestauracion() {

        this.pm = ProductManagerImpl.getInstance();

        //declarar e inicializar estructuras de datos necesarias





    }

    @GET
    @ApiOperation(value = "Obtener productos ordenados por precio", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Producto.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductsByPrice(@PathParam("nombre") String valor ) {

        //List<Producto> productosPrecio = this.pm.getProductsPrice();

        //GenericEntity<List<Producto>> entity = new GenericEntity<List<Producto>>(productosPrecio) {};    //eines jersei per serialitzar objecte jsnon, vector objectes
        //return Response.status(201).entity(entity).build()  ;

        return null;

    }




    @POST
    @ApiOperation(value = "Crear pedido (producto)", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Producto.class),
            @ApiResponse(code = 500, message = "Validation Error")      })

    @Path("/addProduct")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newProduct(Producto producto) {
        //this.pm.addProducto(producto);
        return Response.status(201).build();
    }





































    /*


    @GET
    @ApiOperation(value = "get a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Track.class),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTrack(@PathParam("id") String id) {
        Track t = this.pm.getTrack(id);
        if (t == null) return Response.status(404).build();
        else  return Response.status(201).entity(t).build();
    }

    @DELETE
    @ApiOperation(value = "delete a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/{id}")
    public Response deleteTrack(@PathParam("id") String id) {
        Track t = this.pm.getTrack(id);
        if (t == null) return Response.status(404).build();
        else this.pm.deleteTrack(id);
        return Response.status(201).build();
    }

    @PUT
    @ApiOperation(value = "update a Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Track not found")
    })
    @Path("/")
    public Response updateTrack(Track track) {

        Track t = this.pm.updateTrack(track);

        if (t == null) return Response.status(404).build();

        return Response.status(201).build();
    }



    @POST
    @ApiOperation(value = "create a new Track", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response=Track.class),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(Track track) {

        if (track.getSinger()==null || track.getTitle()==null)  return Response.status(500).entity(track).build();
        this.pm.addTrack(track);
        return Response.status(201).entity(track).build();
    }

     */

}
