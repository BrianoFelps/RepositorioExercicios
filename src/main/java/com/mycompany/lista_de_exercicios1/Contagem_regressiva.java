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
public class Contagem_regressiva {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        int num, minimo;
        
        Boolean repetir = true;
        
        while (repetir){
        System.out.println("Informe o número da contagem regressiva abaixo");
        num = scanner.nextInt();
        
        while (num >= 0){
            System.out.println(num);
        
            num = num-1;
            
           
        }
         System.out.println("Processo finalizado!");
        }
    }
    }

