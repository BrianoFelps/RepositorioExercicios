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
public class Contagem_caracteres {
    public static void main (String [] args){
    Scanner scanner = new Scanner (System.in);
    
    String p;
    
    Boolean repetir = true;
    
    while (repetir){
        System.out.println("Contagem de caracteres");
        System.out.println("Digite a frase abaixo:");
        p = scanner.nextLine();
       
        final String pWithnoSpaces = p.replaceAll(" ", "");
        System.out.println(pWithnoSpaces.length() + " caracteres ");
    }
    }
}
//Peça ao usuário para digitar uma frase e conte quantos caracteres ela possui (sem contar espaços em branco).