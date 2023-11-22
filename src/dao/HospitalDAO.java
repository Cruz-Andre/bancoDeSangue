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
import modelo.HospitalVO;

/**
 *
 * @author cruza
 */
public class HospitalDAO {
    
    public void cadastrarHospital(HospitalVO chVO) throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        try {
            //mySQL
            String sqlHosp = "insert into hospital values (null,?,?,?,?,?,?,?,?,?)";
                       
            PreparedStatement pstmHosp = con.prepareStatement(sqlHosp);
            
            pstmHosp.setString(1, chVO.getNomeHosp());
            pstmHosp.setInt(2, chVO.getQtdSangueAMais());
            pstmHosp.setInt(3, chVO.getQtdSangueAMenos());
            pstmHosp.setInt(4, chVO.getQtdSangueBMais());
            pstmHosp.setInt(5, chVO.getQtdSangueBMenos());
            pstmHosp.setInt(6, chVO.getQtdSangueABMais());
            pstmHosp.setInt(7, chVO.getQtdSangueABMenos());
            pstmHosp.setInt(8, chVO.getQtdSangueOMais());
            pstmHosp.setInt(9, chVO.getQtdSangueOMenos());
            
            pstmHosp.execute();
            pstmHosp.close();
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao cadastrar! " + se);
            
        } finally {
            con.close();
        }
    }
    
    public ArrayList<HospitalVO> buscarInfoHospital() throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();

        try {
            //mySQL
            String sql = "select * from hospital";

            PreparedStatement pstm = con.prepareStatement(sql);
            
            ResultSet rs = pstm.executeQuery();

            ArrayList<HospitalVO> hospArrayList = new ArrayList<>();
            
            while(rs.next()) {
                HospitalVO hVO = new HospitalVO();
                
                hVO.setIdHosp(rs.getLong("idHosp"));
                hVO.setNomeHosp(rs.getString("nomeHosp"));
                hVO.setQtdSangueAMais(rs.getInt("qtdSangueAMais"));
                hVO.setQtdSangueAMenos(rs.getInt("qtdSangueAMenos"));
                hVO.setQtdSangueBMais(rs.getInt("qtdSangueBMais"));
                hVO.setQtdSangueBMenos(rs.getInt("qtdSangueBMenos"));
                hVO.setQtdSangueABMais(rs.getInt("qtdSangueABMais"));
                hVO.setQtdSangueABMenos(rs.getInt("qtdSangueABMenos"));
                hVO.setQtdSangueOMais(rs.getInt("qtdSangueOMais"));
                hVO.setQtdSangueOMenos(rs.getInt("qtdSangueOMenos"));
                
                hospArrayList.add(hVO);
            }
            
            pstm.close();
            
            return hospArrayList;

        } catch (SQLException se) {
            throw new SQLException("Erro ao buscarInfoHospital! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    public ArrayList<HospitalVO> pesquisarHospital(String query) throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        try {
            String sql = "select * from hospital" + query;
            
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            
            ArrayList<HospitalVO> hospPesquisar = new ArrayList<>();
            while(rs.next()) {
                HospitalVO hVO = new HospitalVO();
                
                hVO.setIdHosp(rs.getLong("idHosp"));
                hVO.setNomeHosp(rs.getString("nomeHosp"));
                hVO.setQtdSangueAMais(rs.getInt("qtdSangueAMais"));
                hVO.setQtdSangueAMenos(rs.getInt("qtdSangueAMenos"));
                hVO.setQtdSangueBMais(rs.getInt("qtdSangueBMais"));
                hVO.setQtdSangueBMenos(rs.getInt("qtdSangueBMenos"));
                hVO.setQtdSangueABMais(rs.getInt("qtdSangueABMais"));
                hVO.setQtdSangueABMenos(rs.getInt("qtdSangueABMenos"));
                hVO.setQtdSangueOMais(rs.getInt("qtdSangueOMais"));
                hVO.setQtdSangueOMenos(rs.getInt("qtdSangueOMenos"));
                
                hospPesquisar.add(hVO);
            }
            pstm.close();
            return hospPesquisar;
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao pesquisarHospital! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    public void deletarHospital(long idHosp) throws  SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        
        try {
            String sql = "delete from hospital where idHosp = ?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setLong(1, idHosp);
            pstm.execute();
            pstm.close();           
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao deletarHospital! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
    public void atualizarHospital(HospitalVO ahVO) throws SQLException {
        Connection con = new ConexaoBancoDados().getConexao();
        
        try {
            String sql = "update hospital set "
                    + "nomeHosp = '" + ahVO.getNomeHosp()+ "', "
                    + "qtdSangueAMais = " + ahVO.getQtdSangueAMais() + ", "
                    + "qtdSangueAMenos = " + ahVO.getQtdSangueAMenos()+ ", "
                    + "qtdSangueBMais = " + ahVO.getQtdSangueBMais() + ", "
                    + "qtdSangueBMenos = " + ahVO.getQtdSangueBMenos()+ ", "
                    + "qtdSangueABMais = " + ahVO.getQtdSangueABMais() + ", "
                    + "qtdSangueABMenos = " + ahVO.getQtdSangueABMenos()+ ", "
                    + "qtdSangueOMais = " + ahVO.getQtdSangueOMais()+ ", "
                    + "qtdSangueOMenos = " + ahVO.getQtdSangueOMenos()+ " "
                    + "where idHosp = " + ahVO.getIdHosp() + " ";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
            
            
        } catch (SQLException se) {
            throw new SQLException("Erro ao atualizarHospital! " + se.getMessage());
        } finally {
            con.close();
        }
    }
    
}
