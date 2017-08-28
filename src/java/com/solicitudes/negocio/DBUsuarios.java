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
public final class DBUsuarios {
    public static  ArrayList<Usuario> registro;
    
    public DBUsuarios(){
        registro = new ArrayList<>();
        listaUsuarios();
    }
    
    public void listaUsuarios(){
        addUser(new Usuario("anmoya", "asdf", "Alfonso"));
        addUser(new Usuario("nelastra", "asdf", "Nicolas"));
        addUser(new Usuario("jmunoz", "asdf", "Joce"));
    }
    public boolean buscarUsuario(Usuario user){
        for (Usuario us : registro){
            if (us.getUser().equals(user.getUser())){
                return true;
            }
        }
        return false;
    }
    
    public boolean validarUsuario(Usuario user){
        for (Usuario us : registro){
            if (user.getUser().equals(us.getUser())){
                if (user.getPass().equals(us.getPass())){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean addUser(Usuario user){
        if(!buscarUsuario(user)){
           registro.add(user);
           return true;
        }
        
        return false; 
    }
    
    
    
}
