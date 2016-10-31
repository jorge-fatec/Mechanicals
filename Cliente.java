/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicals;



/**
 *
 * @author JorgeLuis
 */
public class Cliente {
    
      
    PessoaFisica pf;
    PessoaJuridica pj;
    
    public boolean tipoPessoa(boolean tipo){
        if(tipo == true){           
            pf = new PessoaFisica();
        }else{
                pj = new PessoaJuridica();
                
        }
        return tipo;
       }

    
    public PessoaFisica getPf(){
        return pf;
    }
    
    public PessoaFisica setPf(PessoaFisica pf){
        return this.pf = pf;
    }
    
    public PessoaJuridica getPj(){
        return pj;
    }
    
    public PessoaJuridica setPf(PessoaJuridica pj){
        return this.pj = pj;
    }
    
  
}