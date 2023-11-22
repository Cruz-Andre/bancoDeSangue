/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DoadorDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.DoadorVO;
import modelo.LoginVO;


/**
 *
 * @author cruza
 */
public class DoadorServicos {
    
    public void cadastrarDoador(DoadorVO cdVO, LoginVO lVO) throws SQLException {
        DoadorDAO cdDAO = DAOFactory.getDoadorDAO();
        cdDAO.cadastrarDoador(cdVO, lVO);
    }
    
    public ArrayList<DoadorVO> buscarInfoDoador() throws SQLException {
        DoadorDAO bidDAO = DAOFactory.getDoadorDAO();
        return bidDAO.buscarInfoDoador();
    }
    
    public ArrayList<DoadorVO> pesquisarDador(String query)throws SQLException {
        DoadorDAO pdDAO = DAOFactory.getDoadorDAO();
        return pdDAO.pesquisarDoador(query);
    }
    
    public void excluirDoador(int idDoador) throws SQLException {
        DoadorDAO edDAO = DAOFactory.getDoadorDAO();
        edDAO.excluirDoador(idDoador);
    }
    
    public void atualizarDoador(DoadorVO adVO) throws SQLException {
        DoadorDAO adDAO = DAOFactory.getDoadorDAO();
        adDAO.atualizarDoador(adVO);
    }
}
