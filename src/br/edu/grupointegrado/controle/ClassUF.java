package br.edu.grupointegrado.controle;

import br.edu.grupointegrado.conexao.ConexaoOracle;
import java.sql.ResultSet;

/**
 *
 * @author BrunoSouzaPicinini
 */
public class ClassUF extends ConexaoOracle {

    private String dsuf;
    private String nmuf;
    StringBuffer sql = new StringBuffer();

    public ResultSet consultageral() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM UF");
        executeSQL(sql.toString());
        return resultset;
    }
    public ResultSet consultasigla() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM UF WHERE DS_UF LIKE '%").append(getDsuf()).append("%'");
        executeSQL(sql.toString());
        return resultset;
    }
    public ResultSet consultadescricao() {
        sql.delete(0, sql.length());
        sql.append("SELECT * FROM UF WHERE NM_UF LIKE '%").append(getNmuf()).append("%'");
        executeSQL(sql.toString());
        return resultset;
    }

    public String getDsuf() {
        return dsuf;
    }

    public void setDsuf(String dsuf) {
        this.dsuf = dsuf;
    }

    public String getNmuf() {
        return nmuf;
    }

    public void setNmuf(String nmuf) {
        this.nmuf = nmuf;
    }

}
