/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.Controle.ControleSistema;
import com.mycompany.modelo.Computador;
import com.mycompany.modelo.Televisao;
import com.mycompany.modelo.Videogame;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author brian.7908
 */
public class MenuLista extends javax.swing.JFrame {

    /**
     * Creates new form MenuLista
     */
    public MenuLista() {
        initComponents();
        
        listarTodos();
    }
    
    public void listarTodos(){
        //se minha lista de produtos não (!) estiver vazia, executa-se isso
        if(!ControleSistema.prods.isEmpty()){
        
        //Instanciação de modelo de tabela, que depois se utiliza para definir a tabela da tela, desbloqueando também novas propriedades
        DefaultTableModel dtm = new DefaultTableModel();
        
        dtm.addColumn("Informações");
        dtm.addColumn("Categoria");
        
        tblista.setModel(dtm);
        
        //pra listar, deve-se voltar o valor de linhas a 0, para não acumular o número de linhas
        dtm.setRowCount(0);
        for (int i = 0; i < ControleSistema.prods.size(); i++) {
            //para cada produto da lista declarado, há de ter uma linha, se instancia tanto a linha quanto o número de colunas. O valor passado será dois, pelo número de colunas criadas acima
                Object[] linha = new Object[dtm.getColumnCount()];
                //o addrow espera um array object
                dtm.addRow(linha);
                
                //Se o produto escolhido for computador, acontecerá o codado
                if(ControleSistema.prods.get(i) instanceof Computador){
                    //quero que toda a informação da tostring seja mostrada na coluna 0 e se converte o produto vindo da lista
                    tblista.setValueAt(((Computador)ControleSistema.prods.get(i)).toString(), i, 0);
                    tblista.setValueAt("Computador", i, 1);
                } else if (ControleSistema.prods.get(i) instanceof Videogame){
                    tblista.setValueAt(((Videogame)ControleSistema.prods.get(i)).toString(), i, 0);
                    tblista.setValueAt("Videogame", i, 1);
                } else if (ControleSistema.prods.get(i) instanceof Televisao){
                    tblista.setValueAt(((Televisao)ControleSistema.prods.get(i)).toString(), i, 0);
                    tblista.setValueAt("Televisão", i, 1);
                }
        }
    }
    }
    public void listarComp(){
        if (!ControleSistema.prods.isEmpty()){
            DefaultTableModel dtm = new DefaultTableModel();
            
            dtm.addColumn("Nome");
            dtm.addColumn("Preço");
            dtm.addColumn("Processador");
            dtm.addColumn("Memória RAM");
            
            tblista.setModel(dtm);
            
            dtm.setRowCount(0);
            
           int linhacont = 0;
           
            for (int i = 0; i < ControleSistema.prods.size(); i++) {
                if(ControleSistema.prods.get(i) instanceof Computador){
            Object[] linha = new Object[dtm.getColumnCount()];
            dtm.addRow(linha);
            
                tblista.setValueAt(((Computador)ControleSistema.prods.get(i)).getNome(), linhacont, 0);
                tblista.setValueAt(((Computador)ControleSistema.prods.get(i)).getPreço(), linhacont, 1);
                tblista.setValueAt(((Computador)ControleSistema.prods.get(i)).getProc(), linhacont, 2);
                tblista.setValueAt(((Computador)ControleSistema.prods.get(i)).getMemRAM(), linhacont, 3);
                
                linhacont ++;
                }
            }
        }
    }
    
    public void listarVG(){
        if(!ControleSistema.prods.isEmpty()){
            DefaultTableModel dtm = new DefaultTableModel();
            
            dtm.addColumn("Nome");
            dtm.addColumn("Preço");
            dtm.addColumn("Plataforma");
        
            tblista.setModel(dtm);
            
            dtm.setRowCount(0);
            
            int linhacont = 0;
            
            for (int i = 0; i < ControleSistema.prods.size(); i++) {
                if(ControleSistema.prods.get(i) instanceof Videogame){
                    Object[] linha = new Object[dtm.getColumnCount()];
                    dtm.addRow(linha);
                    
                    tblista.setValueAt(((Videogame)ControleSistema.prods.get(i)).getNome(), linhacont, 0);
                    tblista.setValueAt(((Videogame)ControleSistema.prods.get(i)).getPreço(), linhacont, 1);
                    tblista.setValueAt(((Videogame)ControleSistema.prods.get(i)).getPlataforma(), linhacont, 2);
                    
                    linhacont ++;
                }
            }
        }
    }

    
    public void listarTV(){
        if(!ControleSistema.prods.isEmpty()){
            DefaultTableModel dtm = new DefaultTableModel();
            
            dtm.addColumn("Nome");
            dtm.addColumn("Preço");
            dtm.addColumn("Resolução");
            dtm.addColumn("Polegadas");
            dtm.addColumn("Marca");
            
            tblista.setModel(dtm);
            
            dtm.setRowCount(0);
            
            int linhacont = 0;
            
            for (int i = 0; i < ControleSistema.prods.size(); i++) {
                if(ControleSistema.prods.get(i) instanceof Televisao){
                    Object[] linha = new Object[dtm.getColumnCount()];
                    dtm.addRow(linha);
                    
                    tblista.setValueAt(((Televisao)ControleSistema.prods.get(i)).getNome(), linhacont, 0);
                    tblista.setValueAt(((Televisao)ControleSistema.prods.get(i)).getPreço(), linhacont, 1);
                    tblista.setValueAt(((Televisao)ControleSistema.prods.get(i)).getResol(), linhacont, 2);
                    tblista.setValueAt(((Televisao)ControleSistema.prods.get(i)).getPoleg(), linhacont, 3);
                    tblista.setValueAt(((Televisao)ControleSistema.prods.get(i)).getMarca(), linhacont, 4);
                    
                    linhacont ++;
                }
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CbCategorias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblista = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lista de produtos");

        CbCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Computador", "Videogame", "Televisão", " " }));
        CbCategorias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbCategoriasItemStateChanged(evt);
            }
        });
        CbCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCategoriasActionPerformed(evt);
            }
        });

        tblista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Preço", "Processador", "Memória RAM"
            }
        ));
        jScrollPane1.setViewportView(tblista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CbCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCategoriasActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_CbCategoriasActionPerformed
//metodo aberto no events da combo box da tela
    private void CbCategoriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbCategoriasItemStateChanged
            switch(CbCategorias.getSelectedIndex()){
                case 0:
                        listarTodos();
                        break;
                case 1:
                        listarComp();
                        break;
                case 2:
                        listarVG();
                        break;
                case 3:
                        listarTV();
                        break;
            }
    }//GEN-LAST:event_CbCategoriasItemStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbCategorias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblista;
    // End of variables declaration//GEN-END:variables
}
