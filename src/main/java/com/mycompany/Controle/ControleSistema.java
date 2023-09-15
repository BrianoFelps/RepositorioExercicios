/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Controle;

import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Videogame;
import com.mycompany.visao.VisaoMenu;
import com.mycompany.visao.Visao_Computador;
import com.mycompany.visao.Visao_videogame;
import java.util.ArrayList;

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
    }
}