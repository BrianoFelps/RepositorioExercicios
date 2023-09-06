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
public class Par_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int num1;
        
        Boolean repetir = true;

    while (repetir) {
        
        System.out.println("É par ou ímpar?");
        System.out.println("Informe o número que deseja saber abaixo");
        num1 = scanner.nextInt();
        
        if(num1 % 2 == 0){
        System.out.println("Este número é par");
        }
        else{
            System.out.println("Este número é ímpar");
        }
    }
    }
}
