// ExemploFor.java
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
         for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        } 
           
        //Forma abreviada
	for(String aluno : alunos) {
        System.out.println("Nome do aluno é: "+ aluno);
      }
    
    }
}