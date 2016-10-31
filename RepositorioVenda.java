
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
public class RepositorioVenda {
    
    private ArrayList<Venda> lista;
    private static RepositorioVenda instanciaRep;
    
    public RepositorioVenda(){
        this.lista = new ArrayList<>();
    }
    
    public static RepositorioVenda obterInstancia(){
        if (instanciaRep == null){
            instanciaRep = new RepositorioVenda();
        }
        return instanciaRep;
    }
    
    public ArrayList<Venda> listarTodos(){
        return this.lista;
    }
    
    //inserir Venda
    
    public void inserir(Venda venda) throws Exception{
        if(venda == null){
            throw new Exception("A Venda não foi instanciada!");
        }        
        if(venda.getNumero() <=0){
            throw new Exception("Digite o número da Venda");
        }
        if(venda.getData() == null){
            throw new Exception("Digite a data da Venda");
        }
        if(venda.getData().trim().equals("")){
            throw new Exception("Digite a data da Venda");
        }
        
        if((venda.getItensDeServico().size() <= 0) || (venda.getItensDeVenda().size() <= 0)){
            throw new Exception("Informe ao menos um Serviço realizado ou uma Peça Vendida");
        }
        if (this.verificaExistencia(venda)>= 0){
            throw new Exception("Venda já Cadastrada");
        }
        this.lista.add(venda);
        
    }
    
    public void remover (Venda venda) throws Exception{
        if(venda == null){
            throw new Exception("A Venda não foi instanciada!");
        }        
        if(venda.getNumero() <=0){
            throw new Exception("Digite o número da Venda");
        }
        if(venda.getData() == null){
            throw new Exception("Digite a data da Venda");
        }
        if(venda.getData().trim().equals("")){
            throw new Exception("Digite a data da Venda");
        }
        
        if((venda.getItensDeServico().size() <= 0) || (venda.getItensDeVenda().size() <= 0)){
            throw new Exception("Informe ao menos um Serviço realizado ou uma Peça Vendida");
        }
        if (this.verificaExistencia(venda)>= 0){
            throw new Exception("Venda já Cadastrada");
        }
        this.lista.remove(this.verificaExistencia(venda));
    }
    
    public void atualiza (Venda venda) throws Exception{
        if(venda == null){
            throw new Exception("A Venda não foi instanciada!");
        }        
        if(venda.getNumero() <=0){
            throw new Exception("Digite o número da Venda");
        }
        if(venda.getData() == null){
            throw new Exception("Digite a data da Venda");
        }
        if(venda.getData().trim().equals("")){
            throw new Exception("Digite a data da Venda");
        }
        
        if((venda.getItensDeServico().size() <= 0) || (venda.getItensDeVenda().size() <= 0)){
            throw new Exception("Informe ao menos um Serviço realizado ou uma Peça Vendida");
        }
        if (this.verificaExistencia(venda)>= 0){
            throw new Exception("Venda já Cadastrada");
        }
        this.lista.set(this.verificaExistencia(venda), venda);
    }
    
    public int verificaExistencia(Venda venda){
        int retorno = -1;
        for(int i = 0; i < this.lista.size(); i++){
            if((venda.getNumero() == this.lista.get(i).getNumero())){
                retorno = i;
            break;
            }
            
        }
        return retorno;
    }
}
