/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicos;

/**
 *
 * @author cruza
 */
public class ServicosFactory {
    
    private static DoadorServicos doadorServicos = new DoadorServicos();

    public static DoadorServicos getDoadorServicos() {
        return doadorServicos;
    }
    
    private static HospitalServicos hospitalServicos = new HospitalServicos();
    
    public static HospitalServicos getHospitalServicos() {
        return hospitalServicos;
    }
}
