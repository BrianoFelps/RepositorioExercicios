/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_de_exercicios1;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class Lista_de_exercicios1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        int num1, num2, resultado;
        
        Boolean repetir = true;
        
        while(repetir){
        System.out.println("-------Calculadora-------");
        System.out.println("Informe o primeiro número abaixo");
        num1 = scanner.nextInt();
        
        System.out.println("Informe, agora, o segundo");
        num2 = scanner.nextInt();
        
        resultado = num1+num2;
        
        System.out.println("O resultado é de: " + resultado);
        }
    }
}
//fazer os exercícios 11, 12, 15, 16, 17 e 20// 
