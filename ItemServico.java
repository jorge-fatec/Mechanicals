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
public class ItemServico {

    private double valor;
    private int percentualComissao;
    
    private Servico servico;
    
    public ItemServico(){
        this.servico = new Servico();
    }
    
    
    public double getValor(){
        return this.valor;
    }
    public double setValor(double valor){
        return this.valor = valor;
    }
    
    public int getPercentualComissao(){
        return this.percentualComissao;
    }
     public int setPercentualComissao(int percentual){
        return this.percentualComissao = percentual;
    }
     
     public double calculaValor(double valor, int percentual){
         double aux = valor;
         return this.valor = aux *(percentual/100);
     }
}
