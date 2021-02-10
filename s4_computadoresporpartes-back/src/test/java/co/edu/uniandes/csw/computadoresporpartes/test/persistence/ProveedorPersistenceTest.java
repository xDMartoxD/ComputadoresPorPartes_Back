/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.computadoresporpartes.test.persistence;

import co.edu.uniandes.csw.computadoresporpartes.entities.ProveedorEntity;
import co.edu.uniandes.csw.computadoresporpartes.persistence.ProveedorPersistence;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

/**
 *
 * @author estudiante
 */
@RunWith(Arquillian.class)
public class ProveedorPersistenceTest {
    
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addPackage(ProveedorEntity.class.getPackage())
                .addPackage(ProveedorPersistence.class.getPackage())
                .addAsManifestResource("META-INF/persistence.xml", "persistence.xml")
                .addAsManifestResource("META-INF/beans.xml", "beans.xml");
    }
    
    @Inject
    ProveedorPersistence pp;
    
    @PersistenceContext
    private EntityManager em;
    
    @Test
    public void createTest()
    {
        PodamFactory factory = new PodamFactoryImpl();
        ProveedorEntity proveedor = factory.manufacturePojo(ProveedorEntity.class);
        ProveedorEntity result = pp.create(proveedor);
        Assert.assertNotNull(proveedor);
        
        ProveedorEntity entity;
        entity = em.find(ProveedorEntity.class, result.getId());
        
        Assert.assertEquals(proveedor.getName(), entity.getName());
    }
    
}
