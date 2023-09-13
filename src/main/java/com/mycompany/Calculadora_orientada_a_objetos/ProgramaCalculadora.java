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
        Calculadora_MédiasAritméticas ma = new Calculadora_MédiasAritméticas();
        
        float soma, sub, mult, div, num1, num2;
        Double RQ, Pot, MS, MP,  num3, num4, num5, num6, num7, num8, numn;
        Double Pes1, Pes2, Pes3;
        
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
        
            //Media aritmética simples
            System.out.println("------Média aritmética simples------");
            
             System.out.println("Informe o primeiro número: ");
             num6 = scanner.nextDouble();
             System.out.println("Informe o segundo número: ");
             num7 = scanner.nextDouble();
             System.out.println("Informe o terceiro número: ");
             num8 = scanner.nextDouble();
             
             numn = 3.0;
             MS = ma.MedS(num6, num7, num8, numn);
             
             System.out.println("A média dos valores apresentados é: " + MS);
            
              //Média aritmética ponderada
              System.out.println("------Média aritmética ponderada------");
              
              System.out.println("Informe o primeiro número: ");
              num6 = scanner.nextDouble();
              System.out.println("Informe o seu peso: ");
              Pes1 = scanner.nextDouble();
              System.out.println("Informe o segundo número: ");
              num7 = scanner.nextDouble();
              System.out.println("Informe o seu peso: ");
              Pes2 = scanner.nextDouble();
              System.out.println("Informe o terceiro número: ");
              num8 = scanner.nextDouble();
              System.out.println("Informe o seu peso: ");
              Pes3 = scanner.nextDouble();
              
              MP = ma.MedP(num6, num7, num8, Pes1, Pes2, Pes3);
              
              System.out.println("A média ponderada dos resultados oferecidos é de: " + MP);
    }
    }

