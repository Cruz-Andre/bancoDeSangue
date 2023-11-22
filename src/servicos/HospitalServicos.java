/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

import dao.DAOFactory;
import dao.HospitalDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.HospitalVO;

/**
 *
 * @author cruza
 */
public class HospitalServicos {
    
    public void cadastrarHospital(HospitalVO chVO) throws SQLException {
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        hDAO.cadastrarHospital(chVO);
    }
    
    public ArrayList<HospitalVO> buscarInfoHospital() throws SQLException {
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        
        return hDAO.buscarInfoHospital();
    }
    
    public ArrayList<HospitalVO> pesquisarHospital(String query) throws SQLException {
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        return hDAO.pesquisarHospital(query);
    }
    
    public void deletarHospital(int idHosp) throws SQLException {
        
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        
        hDAO.deletarHospital(idHosp);
    }
    
    public void atualizarHospital(HospitalVO ahVO) throws SQLException {
        HospitalDAO hDAO = DAOFactory.getHospitalDAO();
        hDAO.atualizarHospital(ahVO);
    }
}
