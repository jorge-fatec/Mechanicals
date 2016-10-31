

package mechanicals;

/**
 *
 * @author Jorge Luis
 */
public abstract class Pessoa {
    
    private int codigoPessoa;   
    private String nome;
    private String sobrenome;
    private String logradouro;
    private int numero;
    private int cep;
    private String bairro;
    private String cidade;
    private char uf;
   
    
   
    
   
  
    public String getNome(){
        return this.nome;
    }
    
    public String setNome(String nome){
        return this.nome = nome;
    }   
    
    public String getSobrenome(){
        return this.sobrenome;
    } 
    
    public String setSobrenome(String sobrenome){
        return this.sobrenome = sobrenome;
    } 
    
  public String getLogradouro(){
        return this.logradouro;
    }
    
    public String setLogradouro(String logradouro){
        return this.logradouro = logradouro;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public int setNumero(int numero){
        return this.numero = numero;
    }

    public int getCep(){
        return this.cep;
    }
    
    public int setCep(int cep){
        return this.cep = cep;
    }
    
      public String getBairro(){
        return this.bairro;
    }
    
    public String setBairro(String bairro){
        return this.bairro = bairro;    
    }
    
      public String getCidade(){
        return this.cidade;
    }
    
    public String setCidade(String cidade){
        return this.cidade = cidade;
    }
    
    public char getUF(){
        return this.uf;
    }
    
    public char setUF(char uf){
        return this.uf = uf;
    }
}
