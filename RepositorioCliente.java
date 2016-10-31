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
public class RepositorioCliente{
    
    private final ArrayList<Cliente> lista;
    private static RepositorioCliente instanciaRep;
    public static final boolean FISICA = true;
    public static final boolean JURIDICA = false;
    
    private RepositorioCliente(){
        this.lista = new ArrayList<>();
    }
    
    private RepositorioCliente obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioCliente();
        }
        return instanciaRep;
    }
    
    public ArrayList<Cliente> listarTodos(){
        return this.lista;
    }
    
    
    
    public void inserir(Cliente cliente) throws Exception{
        if(cliente == null){
            throw new Exception("O Cliente não foi instanciado!");
        }    
        if(cliente.tipoPessoa(FISICA)){
            
        if(cliente.pf.getCPF() == null){
            throw new Exception("Informar o CPF do Cliente!");
        }                  
        if(cliente.pf.getNome()== null){
            throw new Exception("Informe o nome do Cliente!");
        }        
        if(cliente.pf.getSobrenome()== null){
            throw new Exception("Informe o Sobrenome do Cliente!");
        }

        if(cliente.pf.getLogradouro() == null){
            throw new Exception("Informe o Logradouro do Cliente");
        }
        if(cliente.pf.getNumero() == 0){
            throw new Exception("Informe o número");
        }
        if(cliente.pf.getBairro() == null){
            throw new Exception("Informe o Bairro");
        }
        if(cliente.pf.getCep() == 0){
            throw new Exception("Informe o CEP");
        }
        if(cliente.pf.getCidade() == null){
            throw new Exception("Informe a Cidade");
        }
        if(cliente.pf.getUF() == ' '){
            throw new Exception("Informe UF");
        }
        if(cliente.pf.v.getFabricante() == null){
          throw new Exception("Informe Fabricante");
        }
        if(cliente.pf.v.getModelo() == null){
          throw new Exception("Informe Modelo");
        }
        if(cliente.pf.v.getPlaca() == null){
          throw new Exception("Informe Placa");
        }
        if(cliente.pf.v.getCor() == null){
          throw new Exception("Informe a cor");
        }
        if(cliente.pf.v.getKm() == 0.0){
          throw new Exception("Informe KM");
        }
    }else if(cliente.tipoPessoa(JURIDICA)){
              
              if(cliente.pj.getCNPJ() == null){
                  throw new Exception("Informe o CNPJ do Cliente");
              }
              if(cliente.pj.getInscricaoEstadual() == null){
                   throw new Exception("Informe a Inscrição Estadual do Cliente");
              }
              if(cliente.pj.getInscricaoMunicipal() == null){
                   throw new Exception("Informe a Inscrição Municipal do Cliente");
              }
              if(cliente.pj.getRazaoSocial() == null){
                  throw new Exception("Informe a Razão Social do Cliente");
              }
              if(cliente.pj.getNomeFantasia() == null){
                  throw new Exception("Informe o Nome Fantasia do Cliente");
              }
              if(cliente.pj.getLogradouro() == null){
                  throw new Exception("Informe o Logradouro do Cliente");
              }
              if(cliente.pj.getNumero() == 0){
                  throw new Exception("Informe o número");
              }
              if(cliente.pj.getBairro() == null){
                  throw new Exception("Informe o Bairro");
              }
              if(cliente.pj.getCep() == 0){
                  throw new Exception("Informe o CEP");
              }
              if(cliente.pj.getCidade() == null){
                  throw new Exception("Informe a Cidade");
              }
              if(cliente.pj.getUF() == ' '){
                  throw new Exception("Informe UF");
              }
              if(cliente.pj.v.getFabricante() == null){
                  throw new Exception("Informe Fabricante");
              }
              if(cliente.pj.v.getModelo() == null){
                  throw new Exception("Informe Modelo");
              }
              if(cliente.pj.v.getPlaca() == null){
                  throw new Exception("Informe Placa");
              }
              if(cliente.pj.v.getCor() == null){
                  throw new Exception("Informe a cor");
              }
              if(cliente.pj.v.getKm() == 0.0){
                  throw new Exception("Informe KM");
              }
         }
      
        if(this.verificaExistencia(cliente)>=0){
            throw new Exception("Cliente já cadastrado!");
        }
        this.lista.add(cliente);
    }
    
    public void remover(Cliente cliente) throws Exception{
        if(cliente == null){
             throw new Exception("Cliente não instanciado!");
            
        }
        if(cliente.tipoPessoa(FISICA)){
                         
            if(cliente.pf.getCPF() == null){
                 throw new Exception("Informe o CPF do Cliente");
            }
            if(cliente.pf.getCPF().trim().equals("")){
                 throw new Exception("Informe o CPF do Cliente");
            }
            
        }else if(cliente.tipoPessoa(JURIDICA)){
            
            if(cliente.pj.getCNPJ() == null){
                  throw new Exception("Informe o CNPJ do Cliente");
              }
            if(cliente.pj.getCNPJ().trim().equals(" ")){
                  throw new Exception("Informe o CNPJ do Cliente");
            }
    }
        if(this.verificaExistencia(cliente)==-1){
            throw new Exception("Cliente não cadastrado!");
        }   
        this.lista.remove(this.verificaExistencia(cliente));
    }
    public void atualizar (Cliente cliente) throws Exception{
        if(cliente == null){
             throw new Exception("Cliente não instanciado!");
            
        }
        if(cliente.tipoPessoa(FISICA)){
                         
            if(cliente.pf.getCPF() == null){
                 throw new Exception("Informe o CPF do Cliente");
            }
            if(cliente.pf.getCPF().trim().equals("")){
                 throw new Exception("Informe o CPF do Cliente");
            }
            
        }else if(cliente.tipoPessoa(JURIDICA)){
            
            if(cliente.pj.getCNPJ() == null){
                  throw new Exception("Informe o CNPJ do Cliente");
              }
            if(cliente.pj.getCNPJ().trim().equals(" ")){
                  throw new Exception("Informe o CNPJ do Cliente");
            }
    }
        if(this.verificaExistencia(cliente)==-1){
            throw new Exception("Cliente não cadastrado!");
        }   
        this.lista.set(this.verificaExistencia(cliente), cliente);
    }
    
public int verificaExistencia(Cliente cliente){
        int retorno = -1;
        for(int i = 0; i < this.lista.size(); i++){
            if((cliente.pf.getCPF().trim().equals(this.lista.get(i).pf.getCPF().trim()))
                    || (cliente.pj.getCNPJ().trim().equals(this.lista.get(i).pj.getCNPJ()))){
                retorno = i;
            break;
            }
            
        }
        return retorno;
    }
}
