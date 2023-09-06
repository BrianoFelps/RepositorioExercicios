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
public class Troca_Variáveis {
 public static void main (String [] args){
      Scanner scanner = new Scanner (System.in);
      
      int var1 = 100, var2=200;

          System.out.println("Antes da troca:");
          System.out.println("x = " + var1);
          System.out.println("y = " + var2);
      
      int temp = var1;
      var1 = var2;
      var2 = temp;
      
          System.out.println("Depois da troca");
          System.out.println("x = " + var1);
          System.out.println("y = " + var2);
      }
 }

//desenvolva um algoritmo que troque os valores de duas variáveis