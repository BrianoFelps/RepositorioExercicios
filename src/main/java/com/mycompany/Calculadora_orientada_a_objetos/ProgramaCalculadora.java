/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Calculadora_orientada_a_objetos;

import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class ProgramaCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora ();        
        
        float soma, sub, mult, div, num1, num2 ;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Informe o primeiro número: ");
        num1 = scanner.nextFloat();
        
        System.out.println("Informe o segundo número: ");
        num2 = scanner.nextFloat();
        
        soma = calculadora.somar(num1, num2);
        sub= calculadora.subtrair(num1, num2);
        mult = calculadora.multiplicar(num1, num2);
        div = calculadora.dividir(num1, num2);
        
        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtração: " + sub);
        System.out.println("Resultado da multiplicação: " + mult);
        System.out.println("Resultado da divisão: " + div);
    
    }
}
