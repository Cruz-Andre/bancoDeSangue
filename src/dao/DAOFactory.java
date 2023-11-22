/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author cruza
 */
public class DAOFactory {
    
    //Cria um objeto e instancia a classe
    private static DoadorDAO doadorDAO = new DoadorDAO();
    
    //faz uma cópia dos métodos da ProdutoDAO e disponibiliza para a classe que solicitar
    public static DoadorDAO getDoadorDAO() {
        return doadorDAO;
    }
    
    
    private static HospitalDAO hospitalDAO = new HospitalDAO();
    
    public static HospitalDAO getHospitalDAO() {
        return hospitalDAO;
    }
    
    
}
