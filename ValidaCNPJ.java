/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mechanicals;

import java.util.Arrays;

/**
 *
 * @author JorgeLuis
 */
public class ValidaCNPJ {
    
    
   int[] cnpj = new int[14];
   int[] mult = {5,4,3,2,9,8,7,6,5,4,3,2};
   int[] mult2 = {6,5,4,3,2,9,8,7,6,5,4,3,2};
   int[] controle = new int[14];
   int soma = 0, resto1, resto2, verificador1, verificador2;
   String cpfCalc;
   
   
      
     public String ConverteCNPJString(String cnpj){ // converte o cpf inteiro em String
      
       char[] numero = cnpj.toCharArray();
       int[]array = new int[numero.length];
       
       if((numero.length < 14) || (numero.length > 14)){
           System.out.print("CNPJ Inválido -> ");
           return  cnpj;
           
       }     
            
        for(int i=0; i< array.length; i++){           
            array[i] = Integer.parseInt(String.valueOf(numero[i]));
            this.cnpj[i] = array[i];
            
        }
        
         //Validação do CPF
     
          
        
         for(int i = 0; i<12; i++){
             this.controle[i] = this.cnpj[i];
             this.soma = this.soma + (this.cnpj[i] * this.mult[i]);
             
         }
         resto1 = this.soma%11;
         if(resto1 < 2){
             verificador1 = 0;
         }else{
             verificador1 = 11 - resto1;
         }
         this.cnpj[12] = verificador1;
         this.soma = 0;
         
         
         for(int i=0;i<13;i++){			
		this.soma = this.soma + this.cnpj[i] * this.mult2[i];
                
	}
 	resto2 = (soma) % 11;

	if(resto2<2){
		verificador2 = 0;
	}else{
		verificador2 = 11 - resto2;
	}
	this.cnpj[13] = verificador2;
        
           cpfCalc = Arrays.toString(this.cnpj);
           
       cpfCalc = cpfCalc.replace(",", "");
       cpfCalc = cpfCalc.replace("[", "");
        cpfCalc = cpfCalc.replace("]", "");
         cpfCalc = cpfCalc.replace(" ", "");
        
       return cpfCalc;
   }   
       
}
