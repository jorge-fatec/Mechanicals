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
public class RepositorioPeca {

    private final ArrayList<Peca> lista;
    private static RepositorioPeca instanciaRep;
    
    public RepositorioPeca(){
        this.lista = new ArrayList<>();
    }
    
    public static RepositorioPeca obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioPeca();
        }
        return instanciaRep;
    }
    
    public ArrayList<Peca> listarTodos(){
        return this.lista;
    }
    
    public void inserir(Peca peca) throws Exception{
        if(peca == null){
            throw new Exception("A Peça não foi instanciada!");
        }
        
        if(peca.getCodigoPeca() == null){
            throw new Exception("Digite o código da Peça");   
        }
        if(peca.getCodigoPeca().trim().equals("")){
            throw new Exception("Digite o código da Peça");
        }
        if(peca.getDescricaoPeca() == null){
            throw new Exception("Digite a descrição da Peça");
        }
        if(peca.getDescricaoPeca().trim().equals("")){
            throw new Exception("Digite a descrição da Peça");
        }
        if(peca.getValorPeca() == 0.0){
            throw new Exception("Digite o Valor da Peça");
        }
        if(this.verificaExistencia(peca)>=0){
            throw new Exception("A Peça ja está Cadastrada!");
        }
        this.lista.add(peca);
    }
    
    public void remover(Peca peca) throws Exception{
        if(peca == null){
            throw new Exception("A Peça não foi instanciada!");
        }
        if(peca.getCodigoPeca() == null){
            throw new Exception("Informe o código da Peça");
        }
        if(peca.getCodigoPeca().trim().equals("")){
            throw new Exception("Informe o código da Peça");
        }
        if(this.verificaExistencia(peca) == -1){
            throw new Exception("Peça não Cadastrada!");
        }
        this.lista.remove(this.verificaExistencia(peca));
    }
    
    public void atualizar(Peca peca) throws Exception{
        if(peca == null){
            throw new Exception("A peça não foi instanciada!");
        }
        if(peca.getCodigoPeca() == null){
            throw new Exception("Informe o código da Peça");
        }
        if(peca.getCodigoPeca().trim().equals("")){
            throw new Exception("Informe o código da Peça");
        }
        if(peca.getDescricaoPeca() == null){
            throw new Exception("Informe a Descrição da Peça");
        }
        
        if(peca.getDescricaoPeca().trim().equals("")){
            throw new Exception("Informe a Descrição da Peça");
        }
        if(peca.getValorPeca() <= 0){             
            throw new Exception("Informe o Valor da Peça");
        }
        if(this.verificaExistencia(peca)< 0){
            throw new Exception("Peça nao Cadastrada!"); 
        }
        
       this.lista.set(this.verificaExistencia(peca), peca);
    }
   
        
     
        public int verificaExistencia(Peca peca){
            int retorno = -1;
            for(int i = 0; i < this.lista.size(); i++){
                if (peca.getCodigoPeca().trim().equals(this.lista.get(i).getCodigoPeca().trim())){
                    retorno = i;
                    break;
                }
            }
            return retorno;
        }
}
