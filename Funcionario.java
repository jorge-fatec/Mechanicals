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
public class Funcionario extends Pessoa {

    
    private String cargo;
    private double salario;
    
    PessoaFisica pf = new PessoaFisica();
    
     public PessoaFisica getPf(){
        return pf;
    }
    
    public PessoaFisica setPf(PessoaFisica pf){
        return this.pf = pf;
    }
   
    public String getCargo(){
        return this.cargo;
    }
    
    public String setCargo(String funcao){
        return this.cargo = funcao;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public double setSalario(double salario){
        return this.salario = salario;
    }
    
    public double aumentaSalario(double percentual){
        double salarioAntigo = this.salario;
        this.salario *= (percentual/100);
        return this.salario += salarioAntigo;
        
    }
}
