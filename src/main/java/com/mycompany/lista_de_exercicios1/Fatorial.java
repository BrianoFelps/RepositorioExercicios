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
public class Fatorial {
    public static void main (String [] args){
      Scanner scanner = new Scanner (System.in);
      
      int num;
      long fatorial = 1;
      
        System.out.println("Informe o primeiro número abaixo;");
        num = scanner.nextInt();
        for (int i = 1; i<= num; i++){
            fatorial = fatorial * i;
        }
        System.out.println(num + "! é igual a " + fatorial);
      }

    }
