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

    public Double MedS(Double[] a){
    Double soma = 0.0;
//    n = (Double) a.length
            for (int i = 0; i < a.length; i++) {
                soma = soma + a[i];          
        }

            return soma/a.length;
    
        }
    
    public Double MedP(Double[] a, Double[] pes){
        Double conta = 0.0;
        Double soma = 0.0;
        
        for (int i = 0; i < a.length; i++) {
            conta = a[i] * pes[i];
            soma = soma + conta;
        }
        
        Double peso = 0.0;
        
        for (int i = 0; i < pes.length; i++) {
            peso = peso + pes[i];
        }
        
        return soma/peso;
    
        }
    }

