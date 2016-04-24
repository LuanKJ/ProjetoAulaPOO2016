package br.edu.grupointegrado.ferramentas;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acsantana
 */
public class PreencherJtableGenerico {

    ConexaoOracle conecta_Oracle;

    public void FormatarJtable(JTable tabela, int valores[]) {

        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);

        if (modelo.getColumnCount() == valores.length) {
            for (int x = 0; x < valores.length; x++) {
                tabela.getColumnModel().getColumn(x).setPreferredWidth(valores[x]);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor verificar os parametros passados !");
        }
    }

    public void PreencherJtableGenerico(JTable tabela, ResultSet resultado) {
        DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
        modelo.setNumRows(0);
        try {
            int colunas = resultado.getMetaData().getColumnCount();
            while (resultado.next()) {
                Object[] row = new Object[colunas];
                for (int i = 0; i != colunas; i++) {
                    row[i] = resultado.getString(i + 1);
                }
                modelo.addRow(row);
            }
            if (!resultado.first()) {
                JOptionPane.showMessageDialog(null, "Registros não localizados !");
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }

    public void preenchercombo(JComboBox combo, ResultSet resultado,String valor) {
        combo.removeAllItems();
        try {
            while (resultado.next()) {
                combo.addItem(resultado.getString(valor));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não ha UF cadastrada");
        }
    }

    public int[] preenchercomboretornox(JComboBox combo, ResultSet resultado, String primaria, String visao) {
        combo.removeAllItems();
        int[] chave = null;
        try {
            resultado.last();
            int linhas = resultado.getRow();
            chave = new int[linhas];
            int conta = 0;
            resultado.first();
            do {
                chave[conta] = resultado.getInt(primaria);
                combo.addItem(resultado.getString(visao));
                conta++;
            } while (resultado.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não ha cidade cadastrada");
        }
        return chave;
    }

}
