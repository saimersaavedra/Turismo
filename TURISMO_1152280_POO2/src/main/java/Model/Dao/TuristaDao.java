package Model.Dao;

import Model.Entity.Turista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import red.BaseDatos;

/**
 *
 * @author Estudiante
 */
public class TuristaDao implements ITurista{
    // select datos from nombre tabla
                                
    final static String SQL_CONSULTAR = "SELECT * FROM turista";
    final static String SQL_INSERTAR = "INSERT INTO turista(name,apellido,id,telefono,gmail,direction ) VALUES(?,?,?,?,?,?)";
    final static String SQL_BORRAR = "DELETE FROM turista WHERE id = ?";
    final static String SQL_CONSULTARID = "SELECT * FROM turista WHERE id = ?";
    final static String SQL_ACTUALIZAR = "UPDATE turista SET name = ?, apellido = ?, telefono = ?, gmail = ?, direction = ? WHERE id = ?";
    
    
    @Override
    public int Insertar(Turista turista) {
        
         Connection connection = null;
         PreparedStatement sentencia = null;
         int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_INSERTAR);

            sentencia.setString(1, turista.getName());
            sentencia.setString(2, turista.getApellido());
            sentencia.setString(3, turista.getId());
            sentencia.setString(4, turista.getTelefono());
            sentencia.setString(5, turista.getGmail());
            sentencia.setString(6, turista.getDirection());
            resultado = sentencia.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        
        return resultado;
        
    }

    @Override
    public List<Turista> consultar() {
           Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           List<Turista> turistas = new ArrayList();
        try {
            
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_CONSULTAR);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                String nombre = resultado.getString("name");
                String apellido = resultado.getString("apellido");
                String id = resultado.getString("id");
                String telefono = resultado.getString("telefono");
                String gmail = resultado.getString("gmail");
                String direction = resultado.getString("direction");
                
                Turista turista = new Turista(id, nombre, apellido, telefono, gmail, direction);
                turistas.add(turista);
                        
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return turistas;
    }

    @Override
    public Turista consultarId(Turista turista) {
           Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           Turista rTuristas = null;
        try {
            
                connection = BaseDatos.getConnection();
                sentencia = connection.prepareStatement(SQL_CONSULTARID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                sentencia.setString(1, turista.getId());
                resultado = sentencia.executeQuery();
                resultado.absolute(1);
                
                String id = resultado.getString("id");
                String nombre = resultado.getString("name");
                String apellido = resultado.getString("apellido");
                String telefono = resultado.getString("telefono");
                String gmail = resultado.getString("gmail");
                String direction = resultado.getString("direction");
                rTuristas = new Turista(id, nombre, apellido, telefono, gmail, direction);
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
               try {
                   BaseDatos.close(resultado);
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
           return rTuristas;
    }

    @Override
    public int borrar(Turista turista) {
         Connection connection = null;
         PreparedStatement sentencia = null;
         int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_BORRAR);

            sentencia.setString(1, turista.getId());
            resultado = sentencia.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        
        return resultado;
        
    }

    @Override
    public int actualizar(Turista turista) {
         Connection connection = null;
         PreparedStatement sentencia = null;
         int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_ACTUALIZAR);

            sentencia.setString(1, turista.getName());
            sentencia.setString(2, turista.getApellido());
            sentencia.setString(3, turista.getTelefono());
            sentencia.setString(4, turista.getGmail());
            sentencia.setString(5, turista.getDirection());
            sentencia.setString(6, turista.getId());
            resultado = sentencia.executeUpdate();
            
           
        } catch (SQLException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        finally
        {
               try {
                   BaseDatos.close(sentencia);
                   BaseDatos.close(connection);
               } catch (SQLException ex) {
                   Logger.getLogger(TuristaDao.class.getName()).log(Level.SEVERE, null, ex);
               }
           
        }
        
        return resultado;
        
    }
    
}
