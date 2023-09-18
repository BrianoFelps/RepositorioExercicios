/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Televisao;
import com.mycompany.modelo.Videogame;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.VisaoTV;
import com.mycompany.visao.Visao_Computador;
import com.mycompany.visao.Visao_videogame;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author brian.7908
 */
public class ControleSistema {
    public static ArrayList<Object> prods = new ArrayList<>();

    public static void cadastrar(){
    
        int opcaoProduto = VisaoMenu.MenuEscolhaProd();
        
        if(opcaoProduto == 1){
            prods.add(Visao_videogame.menuCadastroVideogame());
        } else if (opcaoProduto == 2){
            prods.add(Visao_Computador.menuCadastroComputador());
        } else if (opcaoProduto == 3){
            prods.add(VisaoTV.MenuCadastroTV());
        }
    }
    
    public static void alterar(int indiceProduto){
        indiceProduto = indiceProduto - 1;
        
        Object object = prods.get(indiceProduto);
        
        if (object instanceof Videogame){
            Videogame videogame = new Videogame();
            videogame = (Videogame) object;
            
            System.out.println("Alterando o produto: " + videogame.toString());
            
            videogame = (Videogame) VisaoMenu.menuAlteracaoProdutoInformacoes(videogame);
            ControleSistema.prods.set(indiceProduto, videogame);
        } 
        else if (object instanceof Computador){
            Computador computador = new Computador ();
            computador = (Computador) object;
            
            System.out.println("Alterando o produto: " + computador.toString());
            
            computador = (Computador) VisaoMenu.menuAlteracaoProdutoInformacoes(computador);
            ControleSistema.prods.set(indiceProduto, computador);
        }
        else if (object instanceof Televisao){
            Televisao TV = new Televisao();
            TV = (Televisao) object;
            
            System.out.println("Alterando o produto: " + TV.toString());
            
            TV = (Televisao) VisaoMenu.menuAlteracaoProdutoInformacoes(TV);
            ControleSistema.prods.set(indiceProduto, TV);
        }
    }
    
    public static void listar(ArrayList<Object> prods){
        for (int i = 0; i < prods.size(); i++) {
            Object object = prods.get(i);
            
            if (object instanceof Videogame){
                Videogame videogame = (Videogame) object;
                System.out.println(videogame.toString());
            }
            else if (object instanceof Computador){
                Computador computador = (Computador) object;
                System.out.println(computador.toString());
             }
            else if (object instanceof Televisao){
                Televisao TV = (Televisao) object;
                System.out.println(TV.toString());
             }
        }
    }
    
    public static void remover (int indiceProduto){
//        Object object = prods.get (indiceProduto);
        indiceProduto = indiceProduto - 1;
        
        Object object = prods.get(indiceProduto);
        
                    if(object instanceof Videogame){
            Videogame videogame = new Videogame();
            videogame = (Videogame) object;
                    System.out.println("Deseja realmente remover o produto " + videogame.getNome() + "? (S/N) ");
                    }
                    if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            System.out.println("Deseja realmente remover o produto " + computador.getNome() + "? (S/N) ");
                    }
                     if(object instanceof Televisao){
            Televisao TV = new Televisao();
            TV = (Televisao) object;
            System.out.println("Deseja realmente remover o produto " + TV.getNome() + "? (S/N) ");
                    }
        

        String sn = new Scanner (System.in).next().toLowerCase();
        
        if (sn.equals(Constantes.REMOVER_SIM)){

            //O try e o catch são analisadores de erros, que caso dê erro aparece uma mensagem, o e.getMessage aponta o motivo.
            try{
            prods.remove(indiceProduto);
                System.out.println("Produto removido com sucesso!");
        }catch(Exception e){
                System.out.println("Produto inexistente!");
        }
     }
//            prods.remove(indiceProduto);
    }
    
    public static void Vender (ArrayList<Object> prods, int indiceProduto){
            indiceProduto = indiceProduto - 1;
            
            Object object = prods.get(indiceProduto);
            Scanner scanner = new Scanner(System.in);
            
            if(object instanceof Videogame){
            Videogame videogame = new Videogame();
            videogame = (Videogame) object;
                    System.out.println("Deseja vender o produto " + videogame.getNome() + ", de R$" + videogame.getPreço() + ". Quantos serão vendidos? ");
                    Double qnt = scanner.nextDouble();
                     
                     Double valor = qnt * videogame.getPreço();
                     
                     System.out.println("Tem certeza que deseja vender " + qnt + " unidades de " + videogame.getNome() + " por R$" + valor + "? (S/N) ");
                    }
                    if(object instanceof Computador){
            Computador computador = new Computador();
            computador = (Computador) object;
            System.out.println("Deseja vender o produto " + computador.getNome() +  ", de R$" + computador.getPreço() + ". Quantos serão vendidos? ");
            Double qnt = scanner.nextDouble();
                     
                    Double valor = qnt * computador.getPreço() ;
                    
                    System.out.println("Tem certeza que deseja vender " + qnt + " unidades de " + computador.getNome() + " por R$" + valor + "? (S/N) ");
                    }
                     if(object instanceof Televisao){
            Televisao TV = new Televisao();
            TV = (Televisao) object;
            System.out.println("Deseja vender o produto " + TV.getNome() +  ", de R$" + TV.getPreço() + ". Quantos serão vendidos? ");
            Double qnt = scanner.nextDouble();
                     
                     Double valor = qnt * TV.getPreço();
                     
                         System.out.println("Tem certeza que deseja vender " + qnt + " unidades de " + TV.getNome() + " por R$" + valor + "? (S/N) ");
                    }
                     
                     String sn = new Scanner (System.in).next().toLowerCase();
                     
                     
                     if (sn.equals(Constantes.REMOVER_SIM)){

            try{
                System.out.println("Produto(s) vendido(s) com sucesso!");
        }catch(Exception e){
                System.out.println("Produto(s) inexistente(s)!");
        }
    }
}
}