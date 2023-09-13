/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculadora_orientada_a_objetos;

/**
 *
 * @author brian.7908
 */
public class Calculadora_MédiasAritméticas extends Calculadora{

    public Double MedS(Double a, Double b, Double c, Double n){
    
    return (a+b+c)/n;
    
        }
    
    public Double MedP(Double a, Double b, Double c, Double pes, Double pes1, Double pes2){
    
        return (a*pes+b*pes1+c*pes2)/(pes+pes1+pes2);
    
        }
    }

