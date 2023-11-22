/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConexaoBancoDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.LoginVO;

/**
 *
 * @author 66191006317
 */
public class LogarSeDAO {
    Connection con;
    
    public ResultSet autenticarLogin(LoginVO lVO) throws SQLException {
        //buscar a conexão com o banco de dados
        con = new ConexaoBancoDados().getConexao();
        
        //Criar um objeto que seja capaz de executar instruções SQL no banco de dados
        try {
            //String que receberá a instrução SQL
            String sql;
            
            //Montando a instrução SELECT para inserir um objeto lVO no banco MySQL
            sql = "select * from login where usrLogin = ? and senhaLogin = ? ";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, lVO.getUsrLogin());
            pstm.setString(2, lVO.getSenhaLogin());
            
            //executando o sql
            ResultSet rs = pstm.executeQuery();
            
            return rs;
            
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "LoginDAO! " + se);
            return null;
        }
    }
}
