/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.Controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Videogame;
import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class VisaoMenu {
    public static int menuPrincipal(){
        
        System.out.println("======SISTEMA DE VENDAS 2.0======");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Alterar produto");
        System.out.println("3 - Remover produto");
        System.out.println("4 - Listar produtos");
        System.out.println("=================================");
        
        int opcaoMenu = new Scanner (System.in).nextInt();
        
        return opcaoMenu;
        
    }
    
    public static int MenuEscolhaProd(){
    
        System.out.println("======CADASTRAR PRODUTO======");
        System.out.println("Qual categoria de produto deseja cadastrar?");
        System.out.println("1 - VideoGame");
        System.out.println("2 - Computador");
        System.out.println("================================");
        int opcaoProd = new Scanner (System.in).nextInt();
        
        return opcaoProd;
        
    }
    
    public static int menuAlteracaoProduto(){
        System.out.println("======ALTERAR PRODUTO======");
        System.out.println("Qual produto deseja alterar? ");
        
        //O size conta como o peso da string, e o get i é como o método do vetor "nome[i]", modificado à arraylist
        for (int i = 0; i < ControleSistema.prods.size(); i++) {
            System.out.println(i + 1 + " | " + ControleSistema.prods.get(i));
        }
        System.out.println("=============================");
        int prodAlterar = new Scanner(System.in).nextInt();
                
        return prodAlterar;
    }
    
    public static Object menuAlteracaoProdutoInformacoes(Object object){
        if(object instanceof Videogame){
            System.out.println("Novo nome: ");
            ((Videogame) object).setNome(new Scanner (System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Videogame) object).setPreço(new Scanner (System.in).nextDouble());
            System.out.println("Nova plataforma: ");
            ((Videogame) object).setPlataforma(new Scanner (System.in).nextLine());
        }else if(object instanceof Computador){
            System.out.println("Novo nome: ");
            ((Computador) object).setNome(new Scanner (System.in).nextLine());
            System.out.println("Novo preço: ");
            ((Computador) object).setPreço(new Scanner (System.in).nextDouble());
            System.out.println("Novo processador: ");
            ((Computador) object).setProc(new Scanner (System.in).nextLine());
            System.out.println("Nova quantidade de memória RAM:");
            ((Computador) object).setMemRAM(new Scanner(System.in).nextDouble());
        }
        
        return object;
                
    }
}
