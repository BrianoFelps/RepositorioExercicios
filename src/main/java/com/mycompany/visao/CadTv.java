/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.visao;

import com.mycompany.Controle.ControleSistema;
import com.mycompany.modelo.Televisao;
import javax.swing.JOptionPane;

/**
 *
 * @author brian.7908
 */
public class CadTv extends javax.swing.JFrame {

    /**
     * Creates new form CadTv
     */
    public CadTv() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TfMarca = new javax.swing.JTextField();
        BtnPol = new javax.swing.JLabel();
        TfPol = new javax.swing.JTextField();
        BtnCan = new javax.swing.JButton();
        BtnSav = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TfNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TfPreco = new javax.swing.JTextField();
        btnMar = new javax.swing.JLabel();
        btnRes = new javax.swing.JLabel();
        TfRes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de televisão");

        TfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfMarcaActionPerformed(evt);
            }
        });

        BtnPol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BtnPol.setText("POLEGADAS");

        TfPol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfPolActionPerformed(evt);
            }
        });

        BtnCan.setText("Cancelar");
        BtnCan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCanActionPerformed(evt);
            }
        });

        BtnSav.setText("Salvar");
        BtnSav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSavActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("NOME");

        TfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PREÇO");

        TfPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfPrecoActionPerformed(evt);
            }
        });

        btnMar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMar.setText("MARCA");

        btnRes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRes.setText("RESOLUÇÃO");

        TfRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfResActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TfNome)
                    .addComponent(TfMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnCan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSav))
                    .addComponent(TfRes, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(btnMar)
                            .addComponent(BtnPol)
                            .addComponent(TfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfPol, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRes))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnPol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TfPol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCan)
                    .addComponent(BtnSav))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfMarcaActionPerformed

    private void TfPolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfPolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfPolActionPerformed

    private void BtnCanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCanActionPerformed
        dispose();
    }//GEN-LAST:event_BtnCanActionPerformed

    private void BtnSavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSavActionPerformed

        try{
            Televisao tv = new Televisao();
            //pegar o nome da caixinha de texto e settar no banco de dados/ lista de produtos
            tv.setNome(TfNome.getText());
            //Converter String em Double, método Double.parseDouble(), colando o string dentro
            tv.setPreço(Double.parseDouble(TfPreco.getText()));
            tv.setMarca(TfMarca.getText());
            tv.setResol(TfRes.getText());
            tv.setPoleg(Double.parseDouble(TfPol.getText()));

            // Importação do computador do sistema de listas, vindo do ControleSistema.
            ControleSistema.prods.add(tv);

            JOptionPane.showMessageDialog(null, "Televisão " + tv.getNome() + " salva com sucesso!");

            //Limpar os campos
            TfNome.setText("");
            TfPreco.setText("");
            TfMarca.setText("");
            TfRes.setText("");
            TfPol.setText("");

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        }

                for (int i = 0; i < ControleSistema.prods.size(); i++) {
                        System.out.println(ControleSistema.prods.get(i));
                    }
    }//GEN-LAST:event_BtnSavActionPerformed

    private void TfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNomeActionPerformed

    private void TfPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfPrecoActionPerformed

    private void TfResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfResActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfResActionPerformed

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
            java.util.logging.Logger.getLogger(CadTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadTv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadTv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCan;
    private javax.swing.JLabel BtnPol;
    private javax.swing.JButton BtnSav;
    private javax.swing.JTextField TfMarca;
    private javax.swing.JTextField TfNome;
    private javax.swing.JTextField TfPol;
    private javax.swing.JTextField TfPreco;
    private javax.swing.JTextField TfRes;
    private javax.swing.JLabel btnMar;
    private javax.swing.JLabel btnRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
