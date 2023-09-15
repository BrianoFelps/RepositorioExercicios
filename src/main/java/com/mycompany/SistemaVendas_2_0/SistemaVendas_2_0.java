/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.SistemaVendas_2_0;

import com.mycompany.Controle.ControleSistema;
import com.mycompany.outros.Constantes;
import com.mycompany.visao.VisaoMenu;

/**
 *
 * @author brian.7908
 */
public class SistemaVendas_2_0 {
    
    public static void main(String[] args) {
        
        int opcaoMenu;
        
        while(true){
            
            opcaoMenu = VisaoMenu.menuPrincipal();
         
            if(opcaoMenu == Constantes.CADASTRAR){
                ControleSistema.cadastrar();
            }
            else if (opcaoMenu == Constantes.ALTERAR) {
                ControleSistema.alterar(VisaoMenu.menuAlteracaoProduto());
            }
            else if (opcaoMenu == Constantes.REMOVER) {
                ControleSistema.remover(VisaoMenu.menuRemocaoProduto());
            }
            else if (opcaoMenu == Constantes.LISTAR) {
                ControleSistema.listar(ControleSistema.prods);
            }
    }    
}
}