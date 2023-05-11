package Model.Dao;

import Model.Entity.SitioTuristico;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public interface ISitioTuristico {
        public int Insertar(SitioTuristico sitio);
    //existen dos tipos de consulta, toda la tabla, o uno especifica, utilizando la llave primaria
    public List<SitioTuristico> consultar(); // para toda la lista
    public SitioTuristico consultarId(SitioTuristico sitio); // para un objecto especifico 
    public int borrar(SitioTuristico sitio); 
    public int actualizar(SitioTuristico sitio);
}
