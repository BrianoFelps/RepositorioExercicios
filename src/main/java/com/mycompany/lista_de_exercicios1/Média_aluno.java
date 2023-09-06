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
public class Média_aluno {
    public static void main (String [] args){
      Scanner scanner = new Scanner (System.in);
      
      int n1, n2, n3, media;
      
      Boolean repetir = true;
      
      while(repetir){
          System.out.println("Média Escolar");
          System.out.println("Indique a nota do primeiro trimestre:");
       n1 = scanner.nextInt();
       
       System.out.println("Indique a nota do segundo trimestre:");
       n2 = scanner.nextInt();
      
      System.out.println("Indique a nota do terceiro trimestre:");
       n3 = scanner.nextInt();
       
       media = (n1+n2+n3)/3;
       
          System.out.println("A média é de:" + media);
          
          if (media < 70){
              System.out.println("O aluno foi reprovado!");
          }
          else{
              System.out.println("O aluno foi aprovado!");
          }
      }
    }
}
//Solicite ao usuário para inserir as notas de um aluno e calcule a média, exibindo se o aluno foi aprovado ou reprovado.