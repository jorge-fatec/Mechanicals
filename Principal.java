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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      PessoaFisica p = new PessoaFisica();
      PessoaJuridica pj = new PessoaJuridica();
     
      System.out.println( p.setCPF("34077487870"));
      System.out.println( pj.setCNPJ("10322304000200"));
    }
    
}
