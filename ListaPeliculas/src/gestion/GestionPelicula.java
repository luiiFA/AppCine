/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import clases.Categoria;
import clases.Pelicula;

/**
 *
 * @author Luis
 */
public class GestionPelicula {

    private int tam;
    private Pelicula vectPelicula[];

    public GestionPelicula(int tam, Pelicula[] vectPelicula) {
        this.tam = tam;
        this.vectPelicula = vectPelicula;
    }

    public GestionPelicula() {
        this.tam = 0;
        this.vectPelicula = new Pelicula[20];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Pelicula[] getVectPelicula() {
        return vectPelicula;
    }

    public void setVectPelicula(Pelicula[] vectPelicula) {
        this.vectPelicula = vectPelicula;
    }

    public boolean insertarPelicula(Pelicula peli) {
        if (!isFull()) {
            this.vectPelicula[this.tam] = peli;
            this.tam++;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return this.tam == 20;
    }

    public Pelicula buscarPorTitulo(String titulo) {
        for (int i = 0; i < this.tam; i++) {
            if (titulo.equals(this.vectPelicula[i].getTitulo())) {
                return this.vectPelicula[i];
            }
        }
        return null;
    }

    public boolean eliminarPelicula( int index) {
        if (index >= 0 && index < this.tam) {
            for (int i = index; i < this.tam - 1; i++) {
                this.vectPelicula[index] = this.vectPelicula[index + 1];

            }
            this.vectPelicula[this.tam] = new Pelicula();
            this.tam--;
        } else {
            return false;
        }
        return true;
    }

    public boolean editarPelicula(Pelicula peli, int index) {
        this.vectPelicula[index] = peli;
        return true;
    }
}
