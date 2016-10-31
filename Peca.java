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
public class Peca {
    
    private String codigoPeca;
    private String nomePeca;
    private String descricaoPeca;
    private float valorPeca;
    private float precoCusto;
    private float precoVenda;
    private int estoqueMinimo;
    private int estoqueMaximo;

    /**
     * @return the codigoPeca
     */
    public String getCodigoPeca() {
        return codigoPeca;
    }

    /**
     * @param codigoPeca the codigoPeca to set
     */
    public void setCodigoPeca(String codigoPeca) {
        this.codigoPeca = codigoPeca;
    }

    /**
     * @return the nomePeca
     */
    public String getNomePeca() {
        return nomePeca;
    }

    /**
     * @param nomePeca the nomePeca to set
     */
    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    /**
     * @return the descricaoPeca
     */
    public String getDescricaoPeca() {
        return descricaoPeca;
    }

    /**
     * @param descricaoPeca the descricaoPeca to set
     */
    public void setDescricaoPeca(String descricaoPeca) {
        this.descricaoPeca = descricaoPeca;
    }

    /**
     * @return the valorPeca
     */
    public float getValorPeca() {
        return valorPeca;
    }

    /**
     * @param valorPeca the valorPeca to set
     */
    public void setValorPeca(float valorPeca) {
        this.valorPeca = valorPeca;
    }

    /**
     * @return the precoCusto
     */
    public float getPrecoCusto() {
        return precoCusto;
    }

    /**
     * @param precoCusto the precoCusto to set
     */
    public void setPrecoCusto(float precoCusto) {
        this.precoCusto = precoCusto;
    }

    /**
     * @return the precoVenda
     */
    public float getPrecoVenda() {
        return precoVenda;
    }

    /**
     * @param precoVenda the precoVenda to set
     */
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    /**
     * @return the estoqueMinimo
     */
    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    /**
     * @param estoqueMinimo the estoqueMinimo to set
     */
    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    /**
     * @return the estoqueMaximo
     */
    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    /**
     * @param estoqueMaximo the estoqueMaximo to set
     */
    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }
       

}
