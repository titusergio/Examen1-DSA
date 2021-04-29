package edu.upc.eetac.dsa.services;


import edu.upc.eetac.dsa.Models.Persona;
import edu.upc.eetac.dsa.Models.Seguimiento;
import edu.upc.eetac.dsa.Models.Vacuna;
import edu.upc.eetac.dsa.ProductManager;
import edu.upc.eetac.dsa.ProductManagerImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

import javax.ws.rs.core.GenericEntity;


@Api(value = "/vacunacion", description = "Servicios del usuario")  //documentació
@Path("/vacunacion")   //ruta http

public class ServicioVacunacion {

    private ProductManager manager;

    public ServicioVacunacion() {

        this.manager = ProductManagerImpl.getInstance();

        //declarar e inicializar estructuras de datos necesarias
        Vacuna vacuna1 = new Vacuna("pfizer");
        Vacuna vacuna2 = new Vacuna("moderna");
        Vacuna vacuna3= new Vacuna("astrazenica");



        this.manager.addVacuna(vacuna1);
        this.manager.addVacuna(vacuna2);
        this.manager.addVacuna(vacuna3);

        this.manager.addMapVacuna(vacuna1);
        this.manager.addMapVacuna(vacuna2);
        this.manager.addMapVacuna(vacuna3);



        Persona persona1 = new Persona("Toni",100);
        Persona persona2 = new Persona("Juan", 200);
        Persona persona3 = new Persona("Sergio",300);

        this.manager.addUser(persona1);
        this.manager.addUser(persona2);
        this.manager.addUser(persona3);

        this.manager.addSeguimiento(100,"El paciente no reaciona bien a la medicación");
        this.manager.addSeguimiento(100,"El paciente empieza a mejorar");
        this.manager.addSeguimiento(100,"El paciente ha sido dado de alta");






    }

    @GET
    @ApiOperation(value = "Obtener historial de seguimientos de una persona", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Seguimiento.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSeguimiento(@PathParam("ideUsuario") Integer valor ) {

        List<Seguimiento> seguimientos = this.manager.getSeguimientos(valor);

        GenericEntity<List<Seguimiento>> entity = new GenericEntity<List<Seguimiento>>(seguimientos) {};    //eines jersei per serialitzar objecte jsnon, vector objectes
        return Response.status(201).entity(entity).build()  ;



    }



    /*
    @POST
    @ApiOperation(value = "Crear pedido (producto)", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response= Vacuna.class),
            @ApiResponse(code = 500, message = "Validation Error")      })

    @Path("/addProduct")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newProduct(Vacuna vacuna) {
        //this.pm.addProducto(producto);
        return Response.status(201).build();
    }

    */





































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
