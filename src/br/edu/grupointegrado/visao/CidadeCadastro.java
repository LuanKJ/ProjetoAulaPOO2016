package br.edu.grupointegrado.visao;

import br.edu.grupointegrado.controle.ClassCidade;
import br.edu.grupointegrado.controle.ClassUF;
import br.edu.grupointegrado.ferramentas.LimparCampos;
import br.edu.grupointegrado.ferramentas.PreencherJtableGenerico;
import br.edu.grupointegrado.ferramentas.Rotinas;
import br.edu.grupointegrado.ferramentas.ValidaCamposObrigatorios;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 *
 * @author acsantana
 */
public class CidadeCadastro extends javax.swing.JFrame {

    PreencherJtableGenerico preencher = new PreencherJtableGenerico();
    LimparCampos limpar = new LimparCampos();
    int situacao;

    ClassCidade cidade = new ClassCidade();
    ClassUF uf = new ClassUF();

    private int[] chave;
    Date data = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    ValidaCamposObrigatorios campos = new ValidaCamposObrigatorios();

    public CidadeCadastro() {
        initComponents();
        situacao = Rotinas.PADRAO;
        preencher.FormatarJtable(jTConsulta, new int[]{80, 300, 80});

        uf.consultageral();
        preencher.preenchercombo(jCbUFDinamica, uf.resultset, "DS_UF");

        jTFData.setText(formatador.format(data));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPCadastro = new javax.swing.JPanel();
        jTfCodigo = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCBEstado = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jBTNovo = new javax.swing.JButton();
        jBTAlterar = new javax.swing.JButton();
        jBTExcluir = new javax.swing.JButton();
        jBTGravar = new javax.swing.JButton();
        jBTCancelar = new javax.swing.JButton();
        jCbUFDinamica = new javax.swing.JComboBox();
        jCbCidadeDinamica = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTFCodigoCidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFUF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTFDescricaoUF = new javax.swing.JTextField();
        jTFData = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPConsulta = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTConsulta = new javax.swing.JTable();
        jCbTipo = new javax.swing.JComboBox();
        jTFConsulta = new javax.swing.JTextField();
        jBtConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro  de Cidade");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTfCodigo.setColumns(1);
        jTfCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código"));

        jTFCidade.setToolTipText("Descrição da Cidade");
        jTFCidade.setName("DS_CIDADE"); // NOI18N
        jTFCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCidadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Cidade");

        jCBEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PR", "SP", "MS", "MT", "SC", "RS", "BH", "RJ" }));

        jLabel3.setText("Estado");

        jBTNovo.setText("Novo");
        jBTNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTNovoActionPerformed(evt);
            }
        });

        jBTAlterar.setText("Alterar");
        jBTAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTAlterarActionPerformed(evt);
            }
        });

        jBTExcluir.setText("Excluir");

        jBTGravar.setText("Gravar");
        jBTGravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTGravarActionPerformed(evt);
            }
        });

        jBTCancelar.setText("Cancelar");
        jBTCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTCancelarActionPerformed(evt);
            }
        });

        jCbUFDinamica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbUFDinamica.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbUFDinamicaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCbUFDinamica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbUFDinamicaActionPerformed(evt);
            }
        });

        jCbCidadeDinamica.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCbCidadeDinamica.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCbCidadeDinamicaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jButton3.setText("Mostrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Carregar Novo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Carregar Novo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Código");

        jTFUF.setBackground(new java.awt.Color(0, 255, 255));
        jTFUF.setToolTipText("Unidade Federativa");
        jTFUF.setName("DS_UF"); // NOI18N

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPCadastroLayout = new javax.swing.GroupLayout(jPCadastro);
        jPCadastro.setLayout(jPCadastroLayout);
        jPCadastroLayout.setHorizontalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addComponent(jBTNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCbCidadeDinamica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCbUFDinamica, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 130, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPCadastroLayout.createSequentialGroup()
                                .addComponent(jTFCodigoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5)
                                    .addGroup(jPCadastroLayout.createSequentialGroup()
                                        .addComponent(jButton3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4))))))
                    .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                        .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFDescricaoUF, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPCadastroLayout.setVerticalGroup(
            jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFDescricaoUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPCadastroLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPCadastroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCbUFDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jTFCodigoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbCidadeDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(1, 1, 1)
                .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBTNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBTAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBTExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBTGravar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBTCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        jTabbedPane1.addTab("Cadastro", jPCadastro);

        jTConsulta.setAutoCreateRowSorter(true);
        jTConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTConsulta.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTConsulta);

        jCbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Geral", "Código", "UF", "Descrição" }));

        jBtConsulta.setText("Consultar");
        jBtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPConsultaLayout = new javax.swing.GroupLayout(jPConsulta);
        jPConsulta.setLayout(jPConsultaLayout);
        jPConsultaLayout.setHorizontalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPConsultaLayout.createSequentialGroup()
                .addComponent(jCbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jBtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPConsultaLayout.setVerticalGroup(
            jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPConsultaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPConsulta);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(736, 547));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtConsultaActionPerformed

        switch (jCbTipo.getSelectedIndex()) {
            case 0: {
                preencher.PreencherJtableGenerico(jTConsulta, cidade.consultageral());
                break;
            }
            case 1: {
                cidade.setCodcidade(Integer.parseInt(jTFConsulta.getText()));
                preencher.PreencherJtableGenerico(jTConsulta, cidade.consultacodigo());
                break;
            }
            case 2: {
                uf.setDsuf(jTFConsulta.getText());
                cidade.setUf(uf);
                preencher.PreencherJtableGenerico(jTConsulta, cidade.consultaestado());
                break;
            }
            case 3: {
                cidade.setDescidade(jTFConsulta.getText());
                preencher.PreencherJtableGenerico(jTConsulta, cidade.consultadescricao());
                break;
            }
        }
    }//GEN-LAST:event_jBtConsultaActionPerformed

    private void jBTGravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTGravarActionPerformed

        campos.ValidaCamposObrigatorios(jPCadastro, "CIDADE");
        if (campos.getRetorno()) {
            if (situacao == Rotinas.INCLUIR) {
                cidade.setDescidade(jTFCidade.getText());
                cidade.setDescuf(jCBEstado.getSelectedItem().toString());
                cidade.incluircidade();
            } else if (situacao == Rotinas.ALTERAR) {
                cidade.setCodcidade(Integer.parseInt(jTFCodigoCidade.getText()));
                cidade.setDescidade(jTFCidade.getText());
                cidade.setDescuf(jCBEstado.getSelectedItem().toString());
                cidade.alterarcidade();
            }
        }
        situacao = Rotinas.PADRAO;
    }//GEN-LAST:event_jBTGravarActionPerformed

    private void jBTCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTCancelarActionPerformed
        if (jTfCodigo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Código Obrigatorio");
            jTfCodigo.grabFocus();
            return;
        } else if (jTFDescricaoUF.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Descrição Obrigatorio");
            jTFDescricaoUF.grabFocus();
            return;
        }
    }//GEN-LAST:event_jBTCancelarActionPerformed

    private void jBTNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTNovoActionPerformed
        situacao = Rotinas.INCLUIR;
        limpar.LimparCampos(jPCadastro);
    }//GEN-LAST:event_jBTNovoActionPerformed

    private void jBTAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTAlterarActionPerformed
        situacao = Rotinas.ALTERAR;
    }//GEN-LAST:event_jBTAlterarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JOptionPane.showMessageDialog(null, chave[jCbCidadeDinamica.getSelectedIndex()]);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        uf.consultageral();
        preencher.preenchercombo(jCbUFDinamica, uf.resultset, "DS_UF");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        cidade.consultageral();
        chave = preencher.preenchercomboretornox(jCbCidadeDinamica, cidade.resultset, "CD_CIDADE", "DS_CIDADE");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jCbUFDinamicaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbUFDinamicaPopupMenuWillBecomeInvisible
        cidade.setDescuf(jCbUFDinamica.getSelectedItem().toString());
        cidade.consultaestado();
        chave = preencher.preenchercomboretornox(jCbCidadeDinamica, cidade.resultset, "CD_CIDADE", "DS_CIDADE");
    }//GEN-LAST:event_jCbUFDinamicaPopupMenuWillBecomeInvisible

    private void jCbCidadeDinamicaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCbCidadeDinamicaPopupMenuWillBecomeInvisible
        jTFCodigoCidade.setText(Integer.toString(chave[jCbCidadeDinamica.getSelectedIndex()]));
    }//GEN-LAST:event_jCbCidadeDinamicaPopupMenuWillBecomeInvisible

    private void jTConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTConsultaMouseClicked

        if (evt.getClickCount() == 2) {
            String x = (String) jTConsulta.getValueAt(jTConsulta.getSelectedRow(), 0);
            cidade.setCodcidade(Integer.parseInt(x));
            cidade.retornacidade();
            retornadados();
            jTabbedPane1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jTConsultaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        final ConsultaUF consultauf = new ConsultaUF(this, true, uf);
        consultauf.setVisible(true);

        consultauf.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jTFUF.setText(uf.getDsuf());
                jTFDescricaoUF.setText(uf.getNmuf());
            }
        });

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCbUFDinamicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbUFDinamicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCbUFDinamicaActionPerformed

    private void jTFCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCidadeActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CidadeCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBTAlterar;
    private javax.swing.JButton jBTCancelar;
    private javax.swing.JButton jBTExcluir;
    private javax.swing.JButton jBTGravar;
    private javax.swing.JButton jBTNovo;
    private javax.swing.JButton jBtConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jCBEstado;
    private javax.swing.JComboBox jCbCidadeDinamica;
    private javax.swing.JComboBox jCbTipo;
    private javax.swing.JComboBox jCbUFDinamica;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPCadastro;
    private javax.swing.JPanel jPConsulta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTConsulta;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFCodigoCidade;
    private javax.swing.JTextField jTFConsulta;
    private javax.swing.JTextField jTFData;
    private javax.swing.JTextField jTFDescricaoUF;
    private javax.swing.JTextField jTFUF;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTfCodigo;
    // End of variables declaration//GEN-END:variables

    public void limparcampos() {
        jTfCodigo.setText("");
        jTFCidade.setText("");
    }

    public void retornadados() {
        jTfCodigo.setText(Integer.toString(cidade.getCodcidade()));
        jTFCidade.setText(cidade.getDescidade());
        jCBEstado.setSelectedItem(cidade.getDescuf());
    }
}
