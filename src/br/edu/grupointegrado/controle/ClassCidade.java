package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author acsantana
 */
public class ClassCidade extends ConexaoOracle {

    private int codcidade;
    private String descidade;
    private String descuf;
    private StringBuffer sql = new StringBuffer();
    private ClassUF uf;

    public ClassCidade() {
        this.uf = new ClassUF();

    }

    public void incluircidade() {
        sql.delete(0, sql.length());
        sql.append("INSERT INTO CIDADE (CD_CIDADE,DS_CIDADE,DS_UF) VALUES (");
        sql.append(ultimasequencia("cidade", "cd_cidade")).append(",'");
        sql.append(getDescidade().toUpperCase()).append("','");
        sql.append(getDescuf()).append("')");
        incluirSQL(sql.toString());
    }

    public void alterarcidade() {
        sql.delete(0, sql.length());
        sql.append("UPDATE CIDADE SET DS_CIDADE = '");
        sql.append(getDescidade()).append("', DS_UF = '");
        sql.append(getDescuf()).append("' ");
        sql.append(" WHERE CD_CIDADE = ").append(getCodcidade());
        atualizarSQL(sql.toString());
    }

    public void excluircidade() {
        sql.delete(0, sql.length());
        sql.append("DELETE FROM CIDADE WHERE CD_CIDADE = ");
        sql.append(getCodcidade());
        deleteSQL(sql.toString());
    }

    public ResultSet consultageral() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE");
        executeSQL(sql.toString());
        return resultset;
    }

    public ResultSet consultacodigo() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE CD_CIDADE = ");
        sql.append(getCodcidade());
      
        executeSQL(sql.toString());
        return resultset;
    }
    
        public ResultSet consultacc() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE CD_CIDADE = ").append(uf.getNmuf());
        sql.append(getCodcidade());
      
        executeSQL(sql.toString());
        return resultset;
    }

    public ResultSet consultadescricao() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE DS_CIDADE LIKE '%");
        sql.append(getDescidade().toUpperCase()).append("%'");
        executeSQL(sql.toString());
        return resultset;
    }

    public ResultSet consultaestado() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE DS_UF LIKE '%");
        sql.append(getUf().getDsuf()).append("%'");
        executeSQL(sql.toString());
        return resultset;
    }

    public void retornacidade() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM CIDADE WHERE CD_CIDADE = ");
        sql.append(getCodcidade());
        executeSQL(sql.toString());
        try {
            resultset.first();
            setCodcidade(resultset.getInt("CD_CIDADE"));
            setDescidade(resultset.getString("DS_CIDADE"));
            setDescuf(resultset.getString("DS_UF"));
        } catch (SQLException ex) {
        }
    }

    public static void main(String[] args) {
        ClassCidade cidade = new ClassCidade();
        cidade.setDescidade("CIDADE AULA");
        cidade.setDescuf("MS");
        cidade.incluircidade();

    }

    public int getCodcidade() {
        return codcidade;
    }

    public void setCodcidade(int codcidade) {
        this.codcidade = codcidade;
    }

    public String getDescidade() {
        return descidade;
    }

    public void setDescidade(String descidade) {
        this.descidade = descidade;
    }

    public String getDescuf() {
        return descuf;
    }

    public void setDescuf(String descuf) {
        this.descuf = descuf;
    }

    public ClassUF getUf() {
        return uf;
    }

    public void setUf(ClassUF uf) {
        this.uf = uf;
    }

    
    
    
}
