/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Luis
 */
public class Categoria {

    // paso: 2 declarar los atributos
    private int idCategoria;
     private String nombreCat;

    // paso:3 declarar los constructores
    public Categoria() {
        this.idCategoria = 0;
        this.nombreCat = "";
    }

    public Categoria(int idCategoria, String nombreCat) {
        this.idCategoria = idCategoria;
        this.nombreCat = nombreCat;
    }
// paso : 4 metodos set y get

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }
   // paso: 5 declarar los metodos de clase
    public void imprimirCategoria(){
        System.out.println("ID : "+this.idCategoria);
        System.out.println("Nombre : "+this.nombreCat);
    }
    
    
}
