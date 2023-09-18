/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author brian.7908
 */
public class Televisao extends Produto {
    private Double poleg;
    private String resol, marca;
    
    public Televisao() {
    }

    public Double getPoleg() {
        return poleg;
    }

    public void setPoleg(Double poleg) {
        this.poleg = poleg;
    }

    public String getResol() {
        return resol;
    }

    public void setResol(String resol) {
        this.resol = resol;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    @Override
    public String toString() {
        return "Nome: " + super.getNome() + 
                   " | Preço: " + super.getPreço() + 
                   " | Resolução " + this.resol +
                   " | Polegadas: " + this.poleg +
                   " | Marca:  " + this.marca;
                }
}
