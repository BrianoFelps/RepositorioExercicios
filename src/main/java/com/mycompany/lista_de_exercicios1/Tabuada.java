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
public class Tabuada {
    public static void main (String [] args){
      Scanner scanner = new Scanner (System.in);
      
      int num, resultado;
              
        Boolean repetir = true;
        
        while (repetir){
            System.out.println("Digite o valor da tabuada abaixo");
            num = scanner.nextInt();
            
                for (int i= 1; i < 11; i++ ){
                    resultado = num*i;
                    System.out.println(num + " x " + i + " = " + resultado);
                    
                    
                }
         }
    }
    }

   
