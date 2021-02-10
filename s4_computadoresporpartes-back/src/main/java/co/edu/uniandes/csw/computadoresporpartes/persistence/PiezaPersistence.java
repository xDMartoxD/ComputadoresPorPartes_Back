/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.computadoresporpartes.persistence;

import co.edu.uniandes.csw.computadoresporpartes.entities.PiezaEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Martin Restrepo M. 201914078
 */

@Stateless
public class PiezaPersistence {
    
    @PersistenceContext(unitName = "computadoresporpartesPU")
    protected EntityManager em;
    
    public PiezaEntity create (PiezaEntity pieza) {
        em.persist(pieza);
        return pieza;
    }
    
}
