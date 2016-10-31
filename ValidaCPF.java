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
public class ValidaCPF {
    
    
   int[] cpf = new int[11];
   int[] mult = {10,9,8,7,6,5,4,3,2};
   int[] mult2 = {11,10,9,8,7,6,5,4,3,2};
   int[] controle = new int[11];
   int soma = 0, resto1, resto2, verificador1, verificador2;
   String cpfCalc;
   
   
      
     public String ConverteCPFString(String cpf){ // converte o cpf inteiro em String
      
       char[] numero = cpf.toCharArray();
       if((numero.length < 11) || (numero.length > 11)){
           System.out.print("CPF Inválido -> ");
           return  cpf;
           
       }
       
       int[]array = new int[numero.length];
             
            
        for(int i=0; i< array.length; i++){           
            array[i] = Integer.parseInt(String.valueOf(numero[i]));
            this.cpf[i] = array[i];
            
        }
        
         //Validação do CPF
     
          
        
         for(int i = 0; i<9; i++){
             this.controle[i] = this.cpf[i];
             this.soma = this.soma + (this.cpf[i] * this.mult[i]);
             
         }
         resto1 = this.soma%11;
         if(resto1 < 2){
             verificador1 = 0;
         }else{
             verificador1 = 11 - resto1;
         }
         this.cpf[9] = verificador1;
         this.soma = 0;
         
         
         for(int i=0;i<10;i++){			
		this.soma = this.soma + this.cpf[i] * this.mult2[i];
                
	}
 	resto2 = (soma) % 11;

	if(resto2<2){
		verificador2 = 0;
	}else{
		verificador2 = 11 - resto2;
	}
	this.cpf[10] = verificador2;
        
           cpfCalc = Arrays.toString(this.cpf);
           
       cpfCalc = cpfCalc.replace(",", "");
       cpfCalc = cpfCalc.replace("[", "");
        cpfCalc = cpfCalc.replace("]", "");
         cpfCalc = cpfCalc.replace(" ", "");
        
       return cpfCalc;
   }   
       
}
