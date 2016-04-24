package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassUF;
import br.edu.grupointegrado.ferramentas.PreencherJtableGenerico;
import javax.swing.JOptionPane;

/**
 *
 * @author acsantana
 */
public class ConsultaUF extends javax.swing.JDialog {

    ClassUF uf = new ClassUF();
    PreencherJtableGenerico preencher = new PreencherJtableGenerico();

    public ConsultaUF(java.awt.Frame parent, boolean modal, ClassUF uf) {
        super(parent, modal);
        initComponents();
        this.uf = uf;
        preencher.FormatarJtable(jTbConsulta, new int[]{100, 300});
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTbConsulta = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jCBConsulta = new javax.swing.JComboBox();
        jTFConsulta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta UF");

        jTbConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Sigla", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTbConsulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTbConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTbConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTbConsulta);

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCBConsulta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Sigla", "Descrição" }));

        jButton2.setText("Selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFConsulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jCBConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(590, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (jCBConsulta.getSelectedIndex()) {
            case 0: {
                preencher.PreencherJtableGenerico(jTbConsulta, uf.consultageral());
                break;
            }
            case 1: {
                uf.setDsuf(jTFConsulta.getText());
                preencher.PreencherJtableGenerico(jTbConsulta, uf.consultasigla());
                break;
            }
            case 2: {
                uf.setNmuf(jTFConsulta.getText());
                preencher.PreencherJtableGenerico(jTbConsulta, uf.consultadescricao());
                break;
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTbConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTbConsultaMouseClicked
        uf.setDsuf(jTbConsulta.getValueAt(jTbConsulta.getSelectedRow(), 0)
                                                      .toString());
        uf.setNmuf(jTbConsulta.getValueAt(jTbConsulta.getSelectedRow(), 1)
                                                       .toString());
    }//GEN-LAST:event_jTbConsultaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTbConsulta.getSelectedRow() >= 0) {
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "A pesquisa não "
                    + "retornou valores !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       uf.setDsuf("");
       uf.setNmuf("");
       dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CidadeCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ConsultaUF(this, true, uf).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jCBConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFConsulta;
    private javax.swing.JTable jTbConsulta;
    // End of variables declaration//GEN-END:variables
}
