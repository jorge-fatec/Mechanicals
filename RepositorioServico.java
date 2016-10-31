/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicals;

import java.util.ArrayList;



/**
 *
 * @author JorgeLuis
 */
public class RepositorioServico {

    private final ArrayList<Servico> lista;
    private static RepositorioServico instanciaRep;
    
    public RepositorioServico(){
        this.lista = new ArrayList<>();
    }
    
    public static RepositorioServico obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioServico();
        }
        return instanciaRep;
    }
    
    public ArrayList<Servico> listarTodos(){
        return this.lista;
    }
    
    public void inserir(Servico servico) throws Exception{
        if(servico == null){
            throw new Exception("O Serviço não foi instanciado!");
        }
        
        if(servico.getCodigoServico() == null){
            throw new Exception("Digite o código do Serviço");   
        }
        if(servico.getCodigoServico().trim().equals("")){
            throw new Exception("Digite o código do Serviço");
        }
        if(servico.getDescricao() == null){
            throw new Exception("Digite a descrição do Serviço");
        }
        if(servico.getDescricao().trim().equals("")){
            throw new Exception("Digite a descrição do Serviço");
        }
        if(servico.getValorServico() == 0.0){
            throw new Exception("Digite o Valor do Serviço");
        }
        if(this.verificaExistencia(servico)>=0){
            throw new Exception("Este tipo de Serviço ja está Cadastrado!");
        }
        this.lista.add(servico);
    }
    
    public void remover(Servico servico) throws Exception{
        if(servico == null){
            throw new Exception("O Serviço não foi instanciado!");
        }
        if(servico.getCodigoServico() == null){
            throw new Exception("Informe o código do Serviço");
        }
        if(servico.getCodigoServico().trim().equals("")){
            throw new Exception("Informe o código do Serviço");
        }
        if(this.verificaExistencia(servico) == -1){
            throw new Exception("Serviço não Cadastrado!");
        }
        this.lista.remove(this.verificaExistencia(servico));
    }
    
    public void atualizar(Servico servico) throws Exception{
        if(servico == null){
            throw new Exception("O Serviço não foi instanciado!");
        }
        if(servico.getCodigoServico() == null){
            throw new Exception("Informe o código do Serviço");
        }
        if(servico.getCodigoServico().trim().equals("")){
            throw new Exception("Informe o código do Serviço");
        }
        if(servico.getDescricao() == null){
            throw new Exception("Informe a Descrição do Servico");
        }
        
        if(servico.getDescricao().trim().equals("")){
            throw new Exception("Informe a Descrição do Servico");
        }
        if(servico.getValorServico() <= 0){             
            throw new Exception("Informe o Valor do Serviço");
        }
        if(this.verificaExistencia(servico)< 0){
            throw new Exception("Serviço não Cadastrado!"); 
        }
        
       this.lista.set(this.verificaExistencia(servico), servico);
    }
   
        
     
        public int verificaExistencia(Servico servico){
            int retorno = -1;
            for(int i = 0; i < this.lista.size(); i++){
                if (servico.getCodigoServico().trim().equals(this.lista.get(i).getCodigoServico().trim())){
                    retorno = i;
                    break;
                }
            }
            return retorno;
        }
}
