/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Televisao;
import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class VisaoTV {
    public static Televisao MenuCadastroTV (){
        Televisao TV = new Televisao ();
        
                    System.out.println("Nome: ");
            TV.setNome(new Scanner(System.in).nextLine());
                System.out.println("Preço: ");
            TV.setPreço(new Scanner (System.in).nextDouble());
                System.out.println("Marca: ");
            TV.setMarca(new Scanner(System.in).nextLine());
                System.out.println("Resolução: ");
            TV.setResol(new Scanner(System.in).nextLine());
                System.out.println("Núm. de polegadas: ");
            TV.setPoleg(new Scanner(System.in).nextDouble());
                System.out.println("=========================================");
            
            return TV;
    }
    }

