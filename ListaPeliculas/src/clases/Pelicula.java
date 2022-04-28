/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.time.LocalDate;

/**
 *
 * @author Luis
 */
public class Pelicula {
    private int idPelicula;
    private String titulo;
    private int duracion;
    private int idCategoria;
    private String protagonista;
    private int anio;
    private String pais;
    private LocalDate fechaEstreno;

    public Pelicula(int idPelicula, String titulo, int duracion, int idCategoria, String protagonista, int anio, String pais,LocalDate fechaEstreno) {
        this.idPelicula = idPelicula;
        this.titulo = titulo;
        this.duracion = duracion;
        this.idCategoria = idCategoria;
        this.protagonista = protagonista;
        this.anio = anio;
        this.pais = pais;
        this.fechaEstreno=fechaEstreno;
    }
    public Pelicula() {
        this.idPelicula = 0;
        this.titulo = "";
        this.duracion = 0;
        this.idCategoria = 0;
        this.protagonista = "";
        this.anio = 0;
        this.pais = "";
        this.fechaEstreno=null;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
    
    public void imprimirPelicula(){
        System.out.println("ID Pelicual : "+this.idPelicula);
        System.out.println("Titulo : "+this.titulo);
        System.out.println("Duración : "+this.duracion);
        System.out.println("Categoria : "+this.idCategoria);
        System.out.println("Protagonista : "+this.protagonista);
        System.out.println("Año : "+this.anio);
        System.out.println("Pais : "+this.pais);
    }
    
    
}
