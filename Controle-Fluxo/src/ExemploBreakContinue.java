// class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?
    //Resposta: A saída será os números 1 e 2 pois exatamente no 3 temos um break do for.
    
    for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);
		
	    }
    //Qual a saída no console ?
    //Resposta: A saída será todos os números menos o 3, pois diferente do exemplo ácima, no 3
    //ele continuará o for devido o continue.

    }
}