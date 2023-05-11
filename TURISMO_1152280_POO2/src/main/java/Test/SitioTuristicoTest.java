package Test;

import Model.Dao.SitioTuristicoDao;
import Model.Entity.SitioTuristico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class SitioTuristicoTest {
    public static void main(String[] args) {
        SitioTuristicoDao sitioDao = new SitioTuristicoDao();
        /*List<SitioTuristico> sitios = new ArrayList();
       
        //INSERTAR
        SitioTuristico uno = new SitioTuristico(1,"Medellin", "null", 3500, 7,"Lugar de neas");
        System.out.println("Resultado: "+sitioDao.Insertar(uno));
        
        //CONSULTAR
          sitios = sitioDao.consultar();
        for (SitioTuristico sitio : sitios) {
            System.out.println("Nombre: "+sitio.toString());
        }
        
        //BORRAR
        System.out.println("Borrado: "+sitioDao.borrar(uno));
        //CONSULTAR
        sitios = sitioDao.consultar();
        for (SitioTuristico sitio : sitios) {
            System.out.println("Nombre: "+sitio.toString());
        }
        */
        SitioTuristico uno = new SitioTuristico(1,"Medellin", "null", 80000, 8,"Lugar de personas");
       // SitioTuristico dos = new SitioTuristico(2,"Bogota", "null", 1000, 5,"Lugar de chavales");
        sitioDao.actualizar(uno);
        SitioTuristico t = new SitioTuristico(1);
        System.out.println(sitioDao.consultarId(t));
    }
}
