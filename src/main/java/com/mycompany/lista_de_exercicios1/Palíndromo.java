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
public class Palíndromo {
    public static void main(String[] args) {
        String palavra;
        Scanner scanner = new Scanner (System.in);
        Boolean repetir = true;
        
        while (repetir){
        System.out.println("------VERIFICADOR DE PALÍNDROMOS------");
        System.out.println("Digite a palavra que será verificada:");
        palavra = scanner.next();
        
        palavra = palavra.toLowerCase();
        
         String invertida = new StringBuffer(palavra).reverse().toString();
         
         if (palavra.equals(invertida)){
             System.out.println("A palavra digitada é um palíndromo!!");
         } 
         else {
             System.out.println("A palavra digitada não é um palíndromo. :(");
         }
        }
    }
}