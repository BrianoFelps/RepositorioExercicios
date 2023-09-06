/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_de_exercicios1;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class Calculadora_Simples {
      public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int opcao;
        float num1, num2, resultado;
        
        Boolean repetir = true;

    while (repetir) {
        System.out.println("Informe a operação a ser realizada: ");
    System.out.println("1 - ADIÇÃO");
    System.out.println("2 - SUBTRAÇÃO");
    System.out.println("3 - MULTIPLICAÇÃO");
    System.out.println("4 - DIVISÃO");
     
    opcao = scanner.nextInt();
    
    if(opcao == 1){//adicao
        System.out.println("Informe o primeiro número abaixo: ");
        num1 = scanner.nextFloat();
        System.out.println("Agora, o segundo:");
        num2 = scanner.nextFloat();
        
        resultado = num1+num2;
        
        System.out.println("O resultado final é de: " + resultado);
    }
    
    else if(opcao ==2){//subtração
     System.out.println("Informe o primeiro número abaixo: ");
        num1 = scanner.nextFloat();
        System.out.println("Agora, o segundo:");
        num2 = scanner.nextFloat();
        
        resultado = num1-num2;
        
        System.out.println("O resultado final é de: " + resultado);
    }
    
     else if(opcao ==3){//multiplicação
      System.out.println("Informe o primeiro número abaixo: ");
        num1 = scanner.nextFloat();
        System.out.println("Agora, o segundo:");
        num2 = scanner.nextFloat();
        
        resultado = num1*num2;
        
        System.out.println("O resultado final é de: " + resultado);
     }
    
     else if(opcao ==4){//divisão
      System.out.println("Informe o primeiro número abaixo: ");
        num1 = scanner.nextFloat();
        System.out.println("Agora, o segundo:");
        num2 = scanner.nextFloat();
        
        resultado = num1/num2;
        
        System.out.println("O resultado final é de: " + resultado);
     }
     else{
        System.out.println("A operação não pode ser realizada");
     }
        }
      }
}
