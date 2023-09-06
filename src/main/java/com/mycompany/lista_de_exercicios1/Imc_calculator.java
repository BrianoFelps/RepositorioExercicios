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
public class Imc_calculator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        float peso, alt, imc;
        
        boolean repetir = true;
        
        while(repetir){
            System.out.println("Calculadora de IMC");
            System.out.println("Informe primeiramente seu peso:");
            peso = scanner.nextFloat();
            
            System.out.println("Agora, a sua altura em metros:");
            alt = scanner.nextFloat();
    
        imc = peso/(alt*alt); 
      
        
            System.out.println("Certo, o seu IMC é de: " + imc);
        
        }
}
}
