/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author 66191006317
 */
public class ConexaoBancoDados {
    //Método que efetua a conexão com o banco de dados
    public Connection getConexao() {
        Connection c = null;
        try {
            //Banco de Dados MySQL
            String url = "jdbc:mysql://localhost:3306/bancoDeSangue?user=root&password=";
            
            //Banco de dados MS SQL
            //String url = "jdbc:sqlserver://localhost:53183;databaseName=inf3n221;integratedSecurity=false;trustServerCertificate=true;user=sa;password=123";
            
            c = DriverManager.getConnection(url);
            
        } catch (SQLException se) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar! --> " + se.getMessage());
            System.out.println(se.getMessage());
        }
        return c;
    }
    
}
