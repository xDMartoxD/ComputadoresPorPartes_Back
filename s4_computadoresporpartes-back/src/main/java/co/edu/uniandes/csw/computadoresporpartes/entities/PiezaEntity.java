/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.computadoresporpartes.entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Martin Restrepo M. 201914078
 */
@Entity
public class PiezaEntity extends BaseEntity implements Serializable {
    
    private double valor;
    
    private String nombre; 
    
    private String description;
    
    private String fabricante;
    
    private String imagen;
    
    private String tipo;
    
    private int unidades;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNomre(String nomre) {
        this.nombre = nomre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }   
}
