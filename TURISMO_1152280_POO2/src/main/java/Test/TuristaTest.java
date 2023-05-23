/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Model.Dao.TuristaDao;
import Model.Entity.Turista;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class TuristaTest {
    public static void main(String[] args) {
        TuristaDao turistaDao = new TuristaDao();
        /*
        List<Turista> turistas = new ArrayList();
        
        INSERTAR
       // Turista uno = new Turista("1","Andres","Parada","311521234132","andres@ufps.com","Av 11 #3");
        Turista dos = new Turista("2","Steven","Baron","31434132","steven@ufps.com","Av 1 #4");

        System.out.println("resultado: "+turistaDao.Insertar(uno)/*+turistaDao.Insertar(dos));
        
        CONSULTAR
        turistas = turistaDao.consultar();
        for (Turista turista : turistas) {
            System.out.println(turista.getName());
        }
        
        //BORRAR
       System.out.println("Borrado: "+turistaDao.borrar(dos));
       */
        Turista g = new Turista("3","Keyly", "Ovallos", "31421355284","keyly@ufps.com","Av 2 #2");
        turistaDao.Insertar(g);
     
        
    }
}
