/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexao.ConexaoBancoDados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DoadorVO;
import modelo.LoginVO;

/**
 *
 * @author cruza
 */
public class DoadorDAO {
    
    public void cadastrarDoador(DoadorVO cdVO, LoginVO lVO) throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        
        try {
            //mySQL
            String sqlDoador = "insert into doador values (null,?,?,?,?,?,?,?)";
            String sqlLogin = "insert into login values (null,?,?)";
            
            PreparedStatement pstmDoador = con.prepareStatement(sqlDoador);
            pstmDoador.setString(1, cdVO.getNomeDoador());
            pstmDoador.setDate(2, cdVO.getDataNascDoador());
            pstmDoador.setString(3, cdVO.getTipoSanguinioDoador());
            pstmDoador.setString(4, cdVO.getEmailDoador());
            pstmDoador.setString(5, cdVO.getEndBairroDoador());
            pstmDoador.setString(6, cdVO.getEndCidadeDoador());
            pstmDoador.setString(7, cdVO.getEndUFDoador());
            pstmDoador.execute();            
            
            PreparedStatement pstmLogin = con.prepareStatement(sqlLogin);
            pstmLogin.setString(1, lVO.getUsrLogin());
            pstmLogin.setString(2, lVO.getSenhaLogin());
            pstmLogin.execute();
            
            pstmDoador.close();
            pstmLogin.close();
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar! " + se);
            
        } finally {
            con.close();
        }
    }
    
    public ArrayList<DoadorVO> buscarInfoDoador() throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();

        try {
            //mySQL
            String sql = "select * from doador";

            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();

            ArrayList<DoadorVO> doadorArrayList = new ArrayList<>();
            
            while(rs.next()) {
                DoadorVO dVO = new DoadorVO();
                
                dVO.setIdDoador(rs.getLong("idDoador"));
                dVO.setNomeDoador(rs.getString("nomeDoador"));
                dVO.setDataNascDoador(rs.getDate("dataNascimentoDoador"));
                dVO.setTipoSanguinioDoador(rs.getString("tipoSanguinioDoador"));
                dVO.setEmailDoador(rs.getString("emailDoador"));
                dVO.setEndBairroDoador(rs.getString("enderecoBairroDoador"));
                dVO.setEndCidadeDoador(rs.getString("enderecoCidadeDoador"));
                dVO.setEndUFDoador(rs.getString("enderecoUFdoador"));
                
                doadorArrayList.add(dVO);
            }
            
            pstm.close();
            
            return doadorArrayList;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscarInfoHospital! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    public ArrayList<DoadorVO> pesquisarDoador(String query) throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        try {
            String sql = "select * from doador" + query;
            
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<DoadorVO> doadorPesquisar = new ArrayList<>();
            while(rs.next()) {
                DoadorVO dVO = new DoadorVO();
                
                dVO.setIdDoador(rs.getLong("idDoador"));
                dVO.setNomeDoador(rs.getString("nomeDoador"));
                dVO.setDataNascDoador(rs.getDate("dataNascimentoDoador"));
                dVO.setTipoSanguinioDoador(rs.getString("tipoSanguinioDoador"));
                dVO.setEmailDoador(rs.getString("emailDoador"));
                dVO.setEndBairroDoador(rs.getString("enderecoBairroDoador"));
                dVO.setEndCidadeDoador(rs.getString("enderecoCidadeDoador"));
                dVO.setEndUFDoador(rs.getString("enderecoUFdoador"));
       
                doadorPesquisar.add(dVO);
            }
            pstm.close();
            return doadorPesquisar;
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao pesquisarHospital! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    public void excluirDoador(long idDoador) throws  SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        
        try {
                        
            String sqlLogin = "delete from login where idLogin = ?";
            String sqlDoador = "delete from doador where idDoador = ?";
            
            PreparedStatement pstmLogin = con.prepareStatement(sqlLogin);
            
            pstmLogin.setLong(1, idDoador);
            pstmLogin.execute();
            pstmLogin.close();           
            
            PreparedStatement pstmDoador = con.prepareStatement(sqlDoador);
            pstmDoador.setLong(1, idDoador);
            pstmDoador.execute();
            pstmDoador.close();           
            
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao excluirDoador! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    public void atualizarDoador(DoadorVO adVO) throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        
        try {
            String sql = "update doador set "
                    + "nomeDoador = '" + adVO.getNomeDoador() + "', "
                    + "dataNascimentoDoador = '" + adVO.getDataNascDoador() + "', "
                    + "tipoSanguinioDoador = '" + adVO.getTipoSanguinioDoador() + "', "
                    + "emailDoador = '" + adVO.getEmailDoador() + "', "
                    + "enderecoBairroDoador = '" + adVO.getEndBairroDoador() + "', "
                    + "enderecoCidadeDoador = '" + adVO.getEndCidadeDoador() + "', "
                    + "enderecoUFdoador = '" + adVO.getEndUFDoador() + "' "
                    + "where idDoador = " + adVO.getIdDoador() + " ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
            
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao atualizarDoador! " + se.getMessage());
        } finally {
            con.close();
        }
    }
}
