package Model.Dao;

import Model.Entity.Turista;
import java.util.List;

public interface ITurista {
    public int Insertar(Turista turista);
    //existen dos tipos de consulta, toda la tabla, o uno especifica, utilizando la llave primaria
    public List<Turista> consultar(); // para toda la lista
    public Turista consultarId(Turista turista); // para un objecto especifico 
    public int borrar(Turista turista); 
    public int actualizar(Turista turista);
}
