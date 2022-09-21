package aulas_java;

import java.util.Scanner;

public class LacosDeDecisaoEx1 {
	
	public static void main(String[] args) {
		
		 int n=0,contP=0,contI=0,x;
	
		 Scanner leia = new Scanner(System.in);
		
		 for(x=0;x<10;x++) {
			 
			 System.out.println("\nDigite um número: ");
			 n = leia.nextInt();		 
			 
				 			 
			 if(x%2==0){
				 
				contP++;				 
			 }else {
				 
				 contI++;		 
			 }					
		 }
		 System.out.println("\nO total de números pares é: "+contP);
		 System.out.println("\nO total de número ímpares é: "+contI);

	}
}






	

	


