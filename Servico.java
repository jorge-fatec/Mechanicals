/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mechanicals;

/**
 *
 * @author Cpd-2
 */
public class Servico {
    
    private String codigoServico;
    private String descricaoServico;
    private float valorServico;
    
    public String getDescricao(){
        return this.descricaoServico;
    }
    public String setDescricao(String descricao){
        return this.descricaoServico = descricao;
    }
    
    public float getValorServico(){
        return this.valorServico;
    }
    
    public float setValorServico(float valor){
        return this.valorServico = valor;
    }

    /**
     * @return the codigoServico
     */
    public String getCodigoServico() {
        return codigoServico;
    }

    /**
     * @param codigoServico the codigoServico to set
     */
    public void setCodigoServico(String codigoServico) {
        this.codigoServico = codigoServico;
    }

}
