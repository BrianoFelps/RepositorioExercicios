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
public class Calendario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 
                num,
Jan=31,
Fev= 28,
Mar=31,
Abr=30,
Mai=31,
Jun=30,
Jul=31,
Ago=31,
Set=30,
Out=31,
Nov=30,
Dez=31;
        
        Boolean repetir = true;
        
        while(repetir){
        System.out.println("--------------Dias dos meses do ano--------------");
        System.out.println("Informe o mês abaixo, de 1-12:");
        num = scanner.nextInt();
        
        if (num ==1){
            System.out.println("O mês de janeiro tem " + Jan + " dias ");
        }
        else if (num == 2){
            System.out.println("O mês de fevereiro tem " + Fev + " dias ");
        }  
        else if (num == 3){
            System.out.println("O mês de março tem " + Mar + " dias ");
        }   
        else if (num == 4){
            System.out.println("O mês de abril tem " + Abr + " dias ");
        }   
        else if (num == 5){
            System.out.println("O mês de maio tem " + Mai + " dias ");
        }   
        else if (num == 6){
            System.out.println("O mês de junho tem " + Jun + " dias ");
        }   
        else if (num == 7){
            System.out.println("O mês de julho tem " + Jul + " dias ");
        }   
        else if (num == 8){
            System.out.println("O mês de agosto tem " + Ago + " dias ");
        }   
        else if (num == 9){
            System.out.println("O mês de setembro tem " + Set + " dias ");
        }   
        else if (num == 10){
            System.out.println("O mês de outubro tem " + Out + " dias ");
        }   
        else if (num == 11){
            System.out.println("O mês de novembro tem " + Nov + " dias ");
        }   
        else if (num == 12){
            System.out.println("O mês de dezembro tem " + Dez + " dias ");
        }   
        else{
            System.out.println("O mês informado não existe!");
        
        }
        }
    }
    }       
