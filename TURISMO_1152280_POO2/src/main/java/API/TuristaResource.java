package API;

import Model.Dao.TuristaDao;
import Model.Entity.Turista;
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

@Path("/apiturista")
public class TuristaResource {
    TuristaDao turistaDao = new TuristaDao();
   @GET
   @Path("/turista")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultar(){
        List<Turista> turistas = new ArrayList<>();
        turistas = turistaDao.consultar();
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .entity(turistas)
                .build();
    }
    
    @GET
   @Path("/turista/{id}")
   @Produces(MediaType.APPLICATION_JSON)
    public Response consultarId(@PathParam("id") String id){
        Turista turista = new Turista(id);
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .entity(turistaDao.consultarId(turista))
                .build();
    }
    
     @POST
    @Path("/turista")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response crear(Turista turista)
    {
        try{
            turistaDao.Insertar(turista);
            return Response.status(Response.Status.CREATED).entity(turista).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    } 
    @DELETE
    @Path("/turista/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response borrar(@PathParam("id") String id) {
        Turista turista = new Turista(id);
        int i = turistaDao.borrar(turista);
        if (i == 0) {
            return Response
                    .status(Response.Status.BAD_REQUEST)
                    .header("Access-Control-Allow-Origin", "*")
                    .entity("Turista not found")
                    .build();
        } else {
            return Response.ok("Correcto").build();
        }
    }
    @Path("/turista")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response actualizar(Turista turista) {
       try{
            turistaDao.actualizar(turista);
            return Response.status(Response.Status.CREATED).entity(turista).build();
        }
        catch(Exception ex)
        {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(ex.getMessage()).build();
        } 
    }
   
}
