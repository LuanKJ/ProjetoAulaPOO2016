package br.edu.grupointegrado.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

/**
 *
 * @author acsantana 01/03/2016 Conexao com banco de dados Oracle
 */
public class ConexaoOracle {

    public static Connection ConexaoOracle;
    public static Statement statement;
    public static ResultSet resultset;
    public ResultSetMetaData metaData;
    public int retorno = 0;

    public ConexaoOracle() { // metodo construtor
        conecta();
    }

    public static Connection conecta() {
        if (ConexaoOracle != null) {
            return ConexaoOracle;
        } else {
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                ConexaoOracle = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "poo", "poo");
                System.out.println("Conectado");
                // JOptionPane.showMessageDialog(null, "Conectado com sucesso");
                return ConexaoOracle;

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não localizado: " + ex);
                ex.printStackTrace();
                return null;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro na conexão com a fonte"
                        + " de dados: ");
                ex.printStackTrace();
                return null;
            }
        }
    }

    public void desconecta() {
        boolean result = true;
        try {
            ConexaoOracle.close();
            // JOptionPane.showMessageDialog(null, "banco fechado");
        } catch (SQLException fecha) {
            JOptionPane.showMessageDialog(null, "Não foi possivel "
                    + "fechar o banco de dados: " + "\n" + fecha);
            result = false;
        }
    }

    public void incluirSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 00001) {
                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
                        + "incluido pois já está cadastrado ");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql ," + sqlex
                        + ", o sql passado foi " + sql);
            }
            retorno = 0;
        }
    }

    public void executeSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar o registro \n"
                    + sqlex);
        }
        try {
            metaData = resultset.getMetaData();
        } catch (SQLException erro) {
        }
    }

    public void incluirsql(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            if (sqlex.getErrorCode() == 00001) {
                JOptionPane.showMessageDialog(null, "O registro não pôde ser "
                        + "incluido pois já está cadastrado ");
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível "
                        + "executar o comando sql ," + sqlex
                        + ", o sql passado foi " + sql);
            }
            retorno = 0;
        }
    }

    public void deleteSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar o registro \n"
                    + sqlex);
        }

    }

    public void atualizarSQL(String sql) {
        try {
            statement = ConexaoOracle.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statement.execute("ALTER SESSION SET NLS_DATE_FORMAT = 'DD-MM-YYYY'");
            resultset = statement.executeQuery(sql);
            retorno = 1;
        } catch (SQLException sqlex) {
            JOptionPane.showMessageDialog(null, "Não foi possível localizar o registro \n"
                    + sqlex);
        }

    }

    public String ultimasequencia(String tabela, String atributo) {
        String sql = "SELECT COALESCE(MAX(" + atributo + " + 1),0) AS ULTIMO FROM "
                + tabela;
        executeSQL(sql);

        try {
            resultset.first();
            return resultset.getString("ULTIMO");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas ao buscar o numero de sequencia.");
            return "";
        }
    }

    public static void main(String[] args) {

  
        ConexaoOracle conexao = new ConexaoOracle();

  //      JOptionPane.showMessageDialog(null, conexao.ultimasequencia("CIDADE", "CD_CIDADE"));
        
        String x = JOptionPane.showInputDialog("1 - Incluir\n"
                + "2 - Alterar\n"
                + "3 - Excluir\n"
                + "4 - Listar");

        switch (x) {
            case "1": {
                String cidade = JOptionPane.showInputDialog("Informe o nome da cidade");
                String estado = JOptionPane.showInputDialog("Informe o estado");
                conexao.executeSQL("INSERT INTO CIDADE (CD_CIDADE,DS_CIDADE,DS_UF) VALUES ("
                        + conexao.ultimasequencia("CIDADE", "CD_CIDADE") + ","
                        + "'" + cidade + "',"
                        + "'" + estado + "')");
                break;
            }
            case "2": {
                String codigo = JOptionPane.showInputDialog("Informe o Código da cidade");
                conexao.executeSQL("SELECT * FROM CIDADE WHERE CD_CIDADE = " + codigo);
                String resultado = "";
            try {
                conexao.resultset.first();
                resultado = conexao.resultset.getString("DS_CIDADE");
            } catch (SQLException ex) {
            }
                String novoresultado = JOptionPane.showInputDialog("Voce selecionou a cidade com nome de : " + resultado 
                        + " Informe o novo nome ");
                
                conexao.atualizarSQL("UPDATE CIDADE SET DS_CIDADE = '" + novoresultado
                        + "' \nWHERE CD_CIDADE = " + codigo);
                
                break;
            }
        }
// BUSCAR UM UNICO REGISTRO        
//        String x = JOptionPane.showInputDialog("Informe o codigo");
//        String sql = "SELECT * FROM CIDADE WHERE CD_CIDADE = " + x;
//        conexao.executeSQL(sql);
//        try {
//            conexao.resultset.first();
//            JOptionPane.showMessageDialog(null,
//                    conexao.resultset.getString("CD_CIDADE") + " - "
//                    + conexao.resultset.getString("DS_CIDADE"));
//        } catch (SQLException ex) {
//        }
//BUSCAR TODOS REGISTROS        
//        try {
//            String sql = "SELECT * FROM CIDADE " ;
//            conexao.executeSQL(sql);
//            String resultado = "";
//            while (conexao.resultset.next()) {
//                resultado = resultado + conexao.resultset.getString("DS_CIDADE") + "\n"; 
//            }
//            JOptionPane.showMessageDialog(null, resultado);
//        } catch (SQLException ex) {
//
//        }
    }

}
