/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solicitudes.negocio;

import java.util.ArrayList;

/**
 *
 * @author Alfonso
 */
public final class DBLibros {
    public static  ArrayList<Libro> registro;
    
    public DBLibros(){
        registro = new ArrayList<>();
        listaLibros();
    }
    
    public void listaLibros(){
        addLibro(new Libro(
                "El Quijote de la Mancha", 
                "Miguel de Cervantes", 
                "990.889.567ch", 
                "Espana", 
                "Galicia", 
                true));
    }
    
    public boolean buscarLibro(Libro libro){
        for (Libro li : registro){
            if (li.getIsbn().equals(libro.getIsbn())){
                return true;
            }
        }
        return false;
    }
    
    
    
    public boolean addLibro(Libro libro){
        if(!buscarLibro(libro)){
           registro.add(libro);
           return true;
        }
        
        return false; 
    }
}
