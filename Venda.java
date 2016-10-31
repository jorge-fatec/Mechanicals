/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mechanicals;

import java.util.ArrayList;

/**
 *
 * @author Cpd-2
 */
public class Venda {

    private String data;
    private String descricao;
    private int numero;

    private ArrayList<ItemVenda> itensDeVenda;
    private ArrayList<ItemServico> itensDeServico;

    private Cliente cliente;
    
    public Venda(){
        this.itensDeVenda = new ArrayList<>();
        this.itensDeServico = new ArrayList<>();
        this.cliente = new Cliente();
    }
    
    public float getValorTotal(){
        float retorno = 0;
        for(int i = 0; i < this.itensDeVenda.size(); i++){
            float valor = (this.itensDeVenda.get(i).getQuantidade() * 
                    this.itensDeVenda.get(i).getValor());
            retorno = retorno + valor;
        }
        return retorno;
    }
    
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the itensDeVenda
     */
    public ArrayList<ItemVenda> getItensDeVenda() {
        return itensDeVenda;
    }

    /**
     * @param itensDeVenda the itensDeVenda to set
     */
    public void setItensDeVenda(ArrayList<ItemVenda> itensDeVenda) {
        this.itensDeVenda = itensDeVenda;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the itensDeServico
     */
    public ArrayList<ItemServico> getItensDeServico() {
        return itensDeServico;
    }

    /**
     * @param itensDeServico the itensDeServico to set
     */
    public void setItensDeServico(ArrayList<ItemServico> itensDeServico) {
        this.itensDeServico = itensDeServico;
    }
}
