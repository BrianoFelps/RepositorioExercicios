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
        System.out.println("Digite a palavra/frase que será verificada:");
        palavra = scanner.nextLine();
        
        palavra = palavra.toLowerCase();
        
         final String pSemEspacos = palavra.replaceAll(" ", "");
        
         String invertida = new StringBuffer(pSemEspacos).reverse().toString();
         
         if (pSemEspacos.equals(invertida)){
             System.out.println("A palavra/frase " + palavra + " é um palíndromo!!");
         } 
         else {
             System.out.println("A palavra/frase " + palavra + " não é um palíndromo. :(");
         }
        }
    }
}