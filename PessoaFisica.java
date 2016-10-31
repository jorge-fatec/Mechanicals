/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicals;

import java.util.Date;

/**
 *
 * @author JorgeLuis
 */
public class PessoaFisica extends Pessoa {
    
    private String rg;
    private String cpf;
    private Date dataNascimento;
    private String telResidencial;
    private String telComercial;
    private String telCelular;
    private String email; 
    
     Veiculo v;  
     
     
     
      public String getRG(){
        return this.rg;
    }
    
    public String setRG(String rg){
        return this.rg = rg;
    }
    
 public String getCPF(){
     
        return this.cpf;
    }
    
    public String setCPF(String cpf){
        this.cpf = cpf;
        ValidaCPF validar = new ValidaCPF();
        
        if((validar.ConverteCPFString(cpf)).equals(this.cpf)){
            return this.cpf;
        }else{
            return "CPF Inválido!";
        }
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the telResidencial
     */
    public String getTelResidencial() {
        return telResidencial;
    }

    /**
     * @param telResidencial the telResidencial to set
     */
    public void setTelResidencial(String telResidencial) {
        this.telResidencial = telResidencial;
    }

    /**
     * @return the telComercial
     */
    public String getTelComercial() {
        return telComercial;
    }

    /**
     * @param telComercial the telComercial to set
     */
    public void setTelComercial(String telComercial) {
        this.telComercial = telComercial;
    }

    /**
     * @return the telCelular
     */
    public String getTelCelular() {
        return telCelular;
    }

    /**
     * @param telCelular the telCelular to set
     */
    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the v
     */
    public Veiculo getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Veiculo v) {
        this.v = v;
    }
    
   
   
    
}
