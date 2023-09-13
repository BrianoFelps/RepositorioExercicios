/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculadora_orientada_a_objetos;

/**
 *
 * @author brian.7908
 */

//"extends" Tem acesso a todas as propriedades da classe calculadora, e os novos metodos a serem implementados serão referentes somente à científica.
public class Calculadora_Científica extends Calculadora {
    //espera-se receber um double a, e sem colocar return dá erro.
    public Double raizQuadrada(Double a) {
        //o math sqrt representa a raíz quadrada.    
        return Math.sqrt(a);
    }
    public Double Potencia (Double a, Double b){
    //math.pow potencia.    
    return Math.pow(a, b);
    }
}
