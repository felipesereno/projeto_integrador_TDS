/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ProdController;
import dao.ProdDAO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produtos;

/**
 *
 * @author 182220040
 */
public class ViewEstabelecimento extends javax.swing.JFrame {

    boolean disponibilidade;
    public ViewEstabelecimento() {
        initComponents();
    }

    String id;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGDispProd = new javax.swing.ButtonGroup();
        abaCadProd = new javax.swing.JTabbedPane();
        jCadProd = new javax.swing.JPanel();
        btCadProd = new javax.swing.JButton();
        tfValorProd = new javax.swing.JTextField();
        lbValorProd = new javax.swing.JLabel();
        lbDescProd = new javax.swing.JLabel();
        lbTipoProd = new javax.swing.JLabel();
        tfNomeProd = new javax.swing.JTextField();
        lbDropTipoProd = new javax.swing.JLabel();
        lbNomeProd = new javax.swing.JLabel();
        dropTipoProd = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        taDescProd = new javax.swing.JTextArea();
        lbReais = new javax.swing.JLabel();
        lbDispProd = new javax.swing.JLabel();
        btRSim = new javax.swing.JRadioButton();
        btRNao = new javax.swing.JRadioButton();
        jEditarProd = new javax.swing.JPanel();
        lbMensEditar = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        tabelaProd = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        abaCadProd.setPreferredSize(new java.awt.Dimension(602, 700));

        btCadProd.setText("Cadastrar");
        btCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadProdActionPerformed(evt);
            }
        });

        lbValorProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbValorProd.setText("Valor unitário:");

        lbDescProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbDescProd.setText("Descrição:");

        lbTipoProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTipoProd.setText("Tipo:");

        lbDropTipoProd.setText("Preencha as informações do novo produto a ser cadastrado:");

        lbNomeProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNomeProd.setText("Nome:");

        dropTipoProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Lanche", "Bebida", "Adicional", "Outro..." }));
        dropTipoProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropProdActionPerformed(evt);
            }
        });

        taDescProd.setColumns(20);
        taDescProd.setRows(5);
        jScrollPane1.setViewportView(taDescProd);

        lbReais.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbReais.setText("R$");

        lbDispProd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbDispProd.setText("Produto disponível?");

        btGDispProd.add(btRSim);
        btRSim.setText("Sim");

        btGDispProd.add(btRNao);
        btRNao.setText("Não");

        javax.swing.GroupLayout jCadProdLayout = new javax.swing.GroupLayout(jCadProd);
        jCadProd.setLayout(jCadProdLayout);
        jCadProdLayout.setHorizontalGroup(
            jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCadProdLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDropTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jCadProdLayout.createSequentialGroup()
                        .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbValorProd)
                            .addComponent(lbTipoProd)
                            .addComponent(lbNomeProd)
                            .addComponent(lbDescProd)
                            .addComponent(lbDispProd))
                        .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jCadProdLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfNomeProd, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(dropTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1)))
                            .addGroup(jCadProdLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(lbReais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                                .addComponent(btCadProd))
                            .addGroup(jCadProdLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btRSim)
                                .addGap(18, 18, 18)
                                .addComponent(btRNao)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jCadProdLayout.setVerticalGroup(
            jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCadProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDropTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeProd)
                    .addComponent(tfNomeProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoProd)
                    .addComponent(dropTipoProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescProd)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDispProd)
                    .addComponent(btRSim)
                    .addComponent(btRNao))
                .addGap(18, 18, 18)
                .addGroup(jCadProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorProd)
                    .addComponent(tfValorProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbReais)
                    .addComponent(btCadProd))
                .addContainerGap(287, Short.MAX_VALUE))
        );

        abaCadProd.addTab("Cadastrar Produtos", jCadProd);

        lbMensEditar.setText("Selecione um elemento na tabela para editar ou excluir:");

        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Tipo", "Descrição", "Valor unitário", "Disponível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaProd.setViewportView(jTable3);

        javax.swing.GroupLayout jEditarProdLayout = new javax.swing.GroupLayout(jEditarProd);
        jEditarProd.setLayout(jEditarProdLayout);
        jEditarProdLayout.setHorizontalGroup(
            jEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditarProdLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbMensEditar)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEditarProdLayout.createSequentialGroup()
                            .addComponent(btEditar)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jEditarProdLayout.createSequentialGroup()
                        .addComponent(tabelaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jEditarProdLayout.setVerticalGroup(
            jEditarProdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEditarProdLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMensEditar)
                .addGap(18, 18, 18)
                .addComponent(tabelaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addComponent(btEditar)
                .addGap(35, 35, 35))
        );

        abaCadProd.addTab("Editar Produtos", jEditarProd);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(abaCadProd, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(abaCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        abaCadProd.getAccessibleContext().setAccessibleName("Cadastro de Produtos");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dropProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropProdActionPerformed
        
    }//GEN-LAST:event_dropProdActionPerformed

    private void btCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadProdActionPerformed
        ProdController pc = new ProdController();
        Produtos prod = new Produtos();
        if(btRSim.isSelected()){
            prod.setDisponibilidade("Sim");
        } else{
            prod.setDisponibilidade("Não");
        }
        pc.Incluir(tfNomeProd.getText(),taDescProd.getText(), dropTipoProd.getSelectedItem().toString(), Float.parseFloat(tfValorProd.getText()), prod.getDisponibilidade());
        
        
    }//GEN-LAST:event_btCadProdActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //JFrame j = new janelaEdicao();
        //j.setVisible(false);
        ProdDAO prodDao = new ProdDAO();
        //ATUALIZA A TABELA DE EDIÇÃO DOS PRODUTOS
        DefaultTableModel tabelaColab = (DefaultTableModel) jTable3.getModel();
        Object[] dadosProd = new Object[6];
        int elementosPorLinha = 6;
        for (int i = 0; i < prodDao.consultar().size(); i += elementosPorLinha) {
            for (int j = 0; j < elementosPorLinha && i + j < prodDao.consultar().size(); j++) {
                dadosProd[j] = prodDao.consultar().get(i + j);
            }
            tabelaColab.addRow(dadosProd);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        if(jTable3.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um dos itens da tabela para editar");
        } else{
            DefaultTableModel modeloTabela = (DefaultTableModel) jTable3.getModel();
            Produtos prod = new Produtos();
            prod.setId(jTable3.getValueAt(jTable3.getSelectedRow(), 0).toString());
            //prod.setPed(prod.getId());
            JFrame j = new ViewEdicaoProd();
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            j.setVisible(true);
            j.setSize(407, 460);
        }
    }//GEN-LAST:event_btEditarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(ViewEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEstabelecimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewEstabelecimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane abaCadProd;
    private javax.swing.JButton btCadProd;
    private javax.swing.JButton btEditar;
    private javax.swing.ButtonGroup btGDispProd;
    private javax.swing.JRadioButton btRNao;
    private javax.swing.JRadioButton btRSim;
    private javax.swing.JComboBox<String> dropTipoProd;
    private javax.swing.JPanel jCadProd;
    private javax.swing.JPanel jEditarProd;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lbDescProd;
    private javax.swing.JLabel lbDispProd;
    private javax.swing.JLabel lbDropTipoProd;
    private javax.swing.JLabel lbMensEditar;
    private javax.swing.JLabel lbNomeProd;
    private javax.swing.JLabel lbReais;
    private javax.swing.JLabel lbTipoProd;
    private javax.swing.JLabel lbValorProd;
    private javax.swing.JTextArea taDescProd;
    private javax.swing.JScrollPane tabelaProd;
    private javax.swing.JTextField tfNomeProd;
    private javax.swing.JTextField tfValorProd;
    // End of variables declaration//GEN-END:variables
}
