/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculadora_orientada_a_objetos;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora ();        
        Calculadora_Científica cc = new Calculadora_Científica();
        
        float soma, sub, mult, div, num1, num2 ;
        Double RQ, Pot, num3, num4, num5;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextFloat();
        
        soma = cc.somar(num1, num2);
        sub= cc.subtrair(num1, num2);
        mult = cc.multiplicar(num1, num2);
        div = cc.dividir(num1, num2);
     
        
        //Soma, Subtração, Multiplicação e Divisão
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
        
        //Raíz quadrada
        System.out.println("------Raíz quadrada------");
                System.out.println("Agora, informe um número par para extrair a raíz quadrada: ");
            num3 = scanner.nextDouble();
            
               RQ = cc.raizQuadrada(num3);
               
               System.out.println("A raíz quadrada de " + num3 + " é: " + RQ);
         //Potência
         System.out.println("------Potência------");
         
                         System.out.println("Agora, informe o número para potencializar: ");
            num4 = scanner.nextDouble();
            
        System.out.println("E a potencia:");
            num5 = scanner.nextDouble();
            
            Pot = cc.Potencia(num4, num5);
            
            System.out.println("O número " + num4 + " elevado a " + num5 + " resulta em: " + Pot);
        
    }
}
