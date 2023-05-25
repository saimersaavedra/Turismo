package API;

import Model.Dao.SitioTuristicoDao;
import Model.Entity.SitioTuristico;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
@Path("/apisitio_turistico")
public class SitioTuristicoResource {
     SitioTuristicoDao sitioDao = new SitioTuristicoDao();
   @GET
   @Path("/sitio_turistico")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultar(){
        List<SitioTuristico> sitios = new ArrayList<>();
        sitios = sitioDao.consultar();
        return Response
                .status(200)
                .entity(sitios)
                .build();
    }
    
    @GET
   @Path("/sitio_turistico/{id}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultarId(@PathParam("id") int id){
        SitioTuristico sitio = new SitioTuristico(id);
        return Response
                .status(200)
                .entity(sitioDao.consultarId(sitio))
                .build();
    }
    
     @POST
    @Path("/sitio_turistico")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(SitioTuristico sitio)
            
    {
        try{
            sitioDao.Insertar(sitio);
            return Response.status(Response.Status.CREATED).entity(sitio).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    } 
    @DELETE
    @Path("/sitio_turistico/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrar(@PathParam("id") int id) {
        SitioTuristico sitio = new SitioTuristico(id);
        int i = sitioDao.borrar(sitio);
        if (i == 0) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .entity("Turista not found")
                    .build();
        } else {
            return Response.ok("Correcto").build();
        }
    }
    @Path("/sitio_turistico")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response actualizar(SitioTuristico sitio) {
       try{
            sitioDao.actualizar(sitio);
            return Response.status(Response.Status.CREATED).entity(sitio).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    }
}
