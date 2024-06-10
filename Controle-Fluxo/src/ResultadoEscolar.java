// ResultadoEscolar.java
public class ResultadoEscolar {
    public static void main(String[] args) {

       int nota = 6;
       
       if(nota >= 7){
        System.out.println("Aprovado");
       }
       else if (nota >= 5 && nota < 7) {
        System.out.println("Prova de recuperação");           
       }
       else{
        System.out.println("Reprovado");
       }

       // Cenário 1
		int nota2 = 7;
		String resultado2 = nota2 >=7 ? "Aprovado" : "Reprovado";
		System.out.println(resultado2);

       // Cenário 2
		int nota3 = 6;
		String resultado3 = nota3 >=7 ? "Aprovado" : nota3 >=5 && nota3 <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado3);
	}
}

