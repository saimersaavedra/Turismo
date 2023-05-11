/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Dao;

import Model.Entity.SitioTuristico;
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
public class SitioTuristicoDao implements ISitioTuristico {
    String SQL_CONSULTAR = "SELECT * FROM sitio_turistico";
    //int id, String name, String photo, int price, int calification, String description
    final static String SQL_INSERTAR = "INSERT INTO sitio_turistico(id,name,photo,price, calification, description ) VALUES(?,?,?,?,?,?)";
    final static String SQL_BORRAR = "DELETE FROM sitio_turistico WHERE id = ?";
    final static String SQL_CONSULTARID = "SELECT * FROM sitio_turistico WHERE id = ?";
     final static String SQL_ACTUALIZAR = "UPDATE sitio_turistico SET name = ?, photo = ?, price = ?, calification = ?, description = ? WHERE id = ?";
    @Override
    public int Insertar(SitioTuristico sitio) {
            Connection connection = null;
            PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_INSERTAR);
            sentencia.setInt(1, sitio.getId());
            sentencia.setString(2, sitio.getName());
            sentencia.setString(3, sitio.getPhoto());
            sentencia.setInt(4, sitio.getPrice());
            sentencia.setInt(5,sitio.getCalification());
            sentencia.setString(6,sitio.getDescription());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SitioTuristicoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SitioTuristicoDao.class.getName()).log(Level.SEVERE, null, ex);
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
    public List<SitioTuristico> consultar() {
          Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           List<SitioTuristico> sitios = new ArrayList();
        try {
            
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_CONSULTAR);
            resultado = sentencia.executeQuery();
            while(resultado.next())
            {
                int id = resultado.getInt("id");
                String name = resultado.getString("name");
                String photo = resultado.getString("photo");
                int price = resultado.getInt("price");
                int calification = resultado.getInt("calification");
                String description = resultado.getString("description");
                //(int id, String name, String photo, int price, int calification, String description)
                SitioTuristico sitio = new SitioTuristico(id, name, photo, price, calification, description);
                sitios.add(sitio);
                        
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
           return sitios;
    }

    @Override
    public SitioTuristico consultarId(SitioTuristico sitio) {
                   Connection connection = null;
           PreparedStatement sentencia = null;
           ResultSet resultado = null;
           SitioTuristico rSitio = null;
        try {
            
                connection = BaseDatos.getConnection();
                sentencia = connection.prepareStatement(SQL_CONSULTARID, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.TYPE_FORWARD_ONLY);
                sentencia.setInt(1, sitio.getId());
                resultado = sentencia.executeQuery();
                resultado.absolute(1);
                int id = resultado.getInt("id");
                String name = resultado.getString("name");
                String photo = resultado.getString("photo");
                int price = resultado.getInt("price");
                int calification = resultado.getInt("calification");
                String description = resultado.getString("description");
                //(int id, String name, String photo, int price, int calification, String description)
                 rSitio = new SitioTuristico(id, name, photo, price, calification, description);
            
           
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
           return rSitio;
    }

    @Override
    public int borrar(SitioTuristico sitio) {
        Connection connection = null;
        PreparedStatement sentencia = null;
        int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_BORRAR);

            sentencia.setInt(1, sitio.getId());
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
    public int actualizar(SitioTuristico sitio) {
         Connection connection = null;
            PreparedStatement sentencia = null;
            int resultado = 0;
        try {
            connection = BaseDatos.getConnection();
            sentencia = connection.prepareStatement(SQL_ACTUALIZAR);
            sentencia.setString(1, sitio.getName());
            sentencia.setString(2, sitio.getPhoto());
            sentencia.setInt(3, sitio.getPrice());
            sentencia.setInt(4,sitio.getCalification());
            sentencia.setString(5,sitio.getDescription());
            sentencia.setInt(6, sitio.getId());
            resultado = sentencia.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(SitioTuristicoDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SitioTuristicoDao.class.getName()).log(Level.SEVERE, null, ex);
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
