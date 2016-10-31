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
public class Veiculo{

    private String placa;
    private String cor;
    private String fabricante;
    private String modelo;
    private float km;
    
    
    
    public String getPlaca(){
        return this.placa;
    }
    public String setPlaca(String placa){
        return this.placa = placa;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the fabricante
     */
    public String getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the km
     */
    public float getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(float km) {
        this.km = km;
    }
}
