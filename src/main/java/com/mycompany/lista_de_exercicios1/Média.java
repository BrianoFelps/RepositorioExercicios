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
public class Média {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int num1, num2, num3, media, resultado;
        
        Boolean repetir = true;
        
        while(repetir){
        System.out.println("Calculadora de média");
            System.out.println("Informe o primeiro número abaixo");
            num1 = scanner.nextInt();
            
            System.out.println("Informe o segundo número abaixo");
            num2 = scanner.nextInt ();
            
            System.out.println("Informe o terceiro número abaixo");
            num3 = scanner.nextInt ();
        
            //resultado= num1+num2+num3
            //media = resultado/3
            media = (num1+num2+num3)/3;
            
            System.out.println("O resultado da média é de: " +media);
        
        
        }
    }
}
