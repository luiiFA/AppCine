/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import clases.Categoria;

/**
 *
 * @author Luis
 */
public class GestionCategoria {

    private int tam;
    private Categoria vectCategoria[];

    public GestionCategoria(int tam, Categoria[] vectCategoria) {
        this.tam = tam;
        this.vectCategoria = vectCategoria;
    }

    public GestionCategoria() {
        this.tam = 0;
        this.vectCategoria = new Categoria[20];
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public Categoria[] getVectCategoria() {
        return vectCategoria;
    }

    public void setVectCategoria(Categoria[] vectCategoria) {
        this.vectCategoria = vectCategoria;
    }

    public boolean insertarCategoria(Categoria cat) {
        if (!isFull()) {
            this.vectCategoria[this.tam] = cat;
            this.tam++;
            return true;
        }
        return false;
    }

    public boolean isFull() {
        return this.tam == 20;
    }

    public Categoria buscarPorTitulo(String nomCat) {
        for (int i = 0; i < this.tam; i++) {
            if (nomCat.equals(this.vectCategoria[i].getNombreCat())) {
                return this.vectCategoria[i];
            }
        }
        return null;
    }

    public boolean eliminarCategoria( int index) {
        if (index >= 0 && index < this.tam) {
            for (int i = index; i < this.tam - 1; i++) {
                this.vectCategoria[index] = this.vectCategoria[index + 1];

            }
            this.vectCategoria[this.tam] = new Categoria();
            this.tam--;
        } else {
            return false;
        }
        return true;
    }

    public boolean editarCategoria(Categoria cat, int index) {
        this.vectCategoria[index] = cat;
        return true;
    }
}
