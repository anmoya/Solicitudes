/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.solicitudes.negocio;

/**
 *
 * @author Alfonso
 */
public class Libro {
    private int codigo;
    private String titulo, autor, isbn, ciudad, pais;
    private boolean nuevo;
    private Usuario usuario;

    public Libro(String titulo, String autor, String isbn, String ciudad, String pais, boolean nuevo) {
        int cod = 0;
        cod++;
        this.codigo = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.ciudad = ciudad;
        this.pais = pais;
        this.nuevo = nuevo;
        this.usuario = new Usuario(null,null,null);
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isNuevo() {
        return nuevo;
    }

    public void setNuevo(boolean nuevo) {
        this.nuevo = nuevo;
    }
    
    
    
}
