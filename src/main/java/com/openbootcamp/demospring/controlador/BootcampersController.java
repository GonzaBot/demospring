package com.openbootcamp.demospring.controlador;

import com.openbootcamp.demospring.models.Bootcamper;
import com.openbootcamp.demospring.services.BootcamperService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
   private BootcamperService bootcamperService;
    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;
        this.bootcamperService.adicionar(new Bootcamper("maria"));
        this.bootcamperService.adicionar(new Bootcamper("Lucia"));
        this.bootcamperService.adicionar(new Bootcamper("juliana"));
        this.bootcamperService.adicionar(new Bootcamper("marianela"));
        this.bootcamperService.adicionar(new Bootcamper("maria del carmen"));
        this.bootcamperService.adicionar(new Bootcamper("maria la del barrio"));
    }
    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> getBootcampers() {
        return bootcamperService.getUsuarios();
    }
    @GET
    @Path("/bootcampers/{nombre}")
    @Produces("application/json")
    public Bootcamper mostraruno(@PathParam("nombre") String nombre){
        return bootcamperService.get(nombre);
    }

    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
  public Runnable addbootcampers(Bootcamper bootcampers) {

            bootcamperService.adicionar(bootcampers);
            return (Runnable) Response.created(URI.create("/bootcampers/"+ bootcampers.getNombre())).build();
    };
    }

