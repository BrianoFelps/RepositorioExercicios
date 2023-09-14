/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.modelo.Videogame;
import java.util.Scanner;

/**
 *
 * @author brian.7908
 */

//é a parte visível do programa, onde se colocam as telas
public class Visao_videogame {
        public static Videogame menuCadastroVideogame(){
        
            Videogame videogame = new Videogame ();
            
            System.out.println("Nome: ");
            videogame.setNome(new Scanner(System.in).nextLine());
            System.out.println("Preço: ");
            videogame.setPreço(new Scanner (System.in).nextDouble());
            
        }
}
