/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author cruza
 */
public class DoadorVO {
    
    private long idDoador;
    private Date dataNascDoador;
    private String 
            nomeDoador,
            tipoSanguinioDoador,
            emailDoador,
            endBairroDoador,
            endCidadeDoador,
            endUFDoador,
            dataUltDoacao,
            quemRecebUltDoacao;

    public long getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(long idDoador) {
        this.idDoador = idDoador;
    }

    public String getNomeDoador() {
        return nomeDoador;
    }

    public void setNomeDoador(String nomeDoador) {
        this.nomeDoador = nomeDoador;
    }

    public Date getDataNascDoador() {
        return dataNascDoador;
    }

    public void setDataNascDoador(Date dataNascDoador) {
        this.dataNascDoador = dataNascDoador;
    }
    
    /**
     * Define a data de nascimento a partir de uma string no formato "dd/MM/yyyy".
     * Converte a data para o formato "yyyy-MM-dd" antes de armazená-la.
     *
     * @param dataNascDoador Data de nascimento no formato "dd/MM/yyyy"
     * @throws ParseException Se a conversão da data falhar
     */
    public void setDataNascDoadorMySQL(String dataNascDoador) throws ParseException {
        SimpleDateFormat dataDigitada = new SimpleDateFormat("dd/MM/yyyy");
        
        // Converte a data para o formato "yyyy-MM-dd"
        java.util.Date dataParaMySQL = dataDigitada.parse(dataNascDoador);
        
        // Converta java.util.Date para java.sql.Date
        this.dataNascDoador = new Date(dataParaMySQL.getTime());
    }

    /**
     * Obtém a data de nascimento formatada no padrão "dd/MM/yyyy".
     *
     * @return Data de nascimento formatada no formato "dd/MM/yyyy"
     */
    public String getDataNascDoadorFormatada() {
        SimpleDateFormat dataDoMySQL = new SimpleDateFormat("dd/MM/yyyy");
        return dataDoMySQL.format(dataNascDoador);
    }

    public String getTipoSanguinioDoador() {
        return tipoSanguinioDoador;
    }

    public void setTipoSanguinioDoador(String tipoSanguinioDoador) {
        this.tipoSanguinioDoador = tipoSanguinioDoador;
    }

    public String getEmailDoador() {
        return emailDoador;
    }

    public void setEmailDoador(String emailDoador) {
        this.emailDoador = emailDoador;
    }

    public String getEndBairroDoador() {
        return endBairroDoador;
    }

    public void setEndBairroDoador(String endBairroDoador) {
        this.endBairroDoador = endBairroDoador;
    }

    public String getEndCidadeDoador() {
        return endCidadeDoador;
    }

    public void setEndCidadeDoador(String endCidadeDoador) {
        this.endCidadeDoador = endCidadeDoador;
    }

    public String getEndUFDoador() {
        return endUFDoador;
    }

    public void setEndUFDoador(String endUFDoador) {
        this.endUFDoador = endUFDoador;
    }

    public String getDataUltDoacao() {
        return dataUltDoacao;
    }

    public void setDataUltDoacao(String dataUltDoacao) {
        this.dataUltDoacao = dataUltDoacao;
    }

    public String getQuemRecebUltDoacao() {
        return quemRecebUltDoacao;
    }

    public void setQuemRecebUltDoacao(String quemRecebUltDoacao) {
        this.quemRecebUltDoacao = quemRecebUltDoacao;
    }

    
}



    