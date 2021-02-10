/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.computadoresporpartes.test.persistence;

import co.edu.uniandes.csw.computadoresporpartes.entities.PiezaEntity;
import co.edu.uniandes.csw.computadoresporpartes.persistence.PiezaPersistence;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author Martin Restrepo M. 201914079
 */

@RunWith(Arquillian.class)
public class PiezaPersistenceTest {
    
    @Inject
    PiezaPersistence pp;
    
    @PersistenceContext
    private EntityManager em;
    
    @Test
    public void creteTest() {
        PodamFactory factory = new PodamFactoryImpl();
        
        PiezaEntity pieza = factory.manufacturePojo(PiezaEntity.class);
        
        PiezaEntity resultado = pp.create(pieza);
        
        Assert.assertNotNull("no deberia ser null", resultado);
        
        PiezaEntity entity =  em.find(PiezaEntity.class, resultado.getId());
        
        Assert.assertEquals(pieza.getNombre(), entity.getNombre());
    }
}
