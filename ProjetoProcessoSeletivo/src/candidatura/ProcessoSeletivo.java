package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] aprovados = selecaoCandidatos(); 
		imprimirCandidatos(aprovados);
		for (String candidato: aprovados) {
			entrandoEmContato(candidato);
		}
		
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
	}
		
	
	static boolean atender() {
		return new Random().nextInt(3) == 1;
	}
	
	static String[] selecaoCandidatos() {

		String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
		String[] aprovados = new String[5];
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato +" solicitou este valor de salário "+ salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+ candidato +" foi selecionado para a vaga!");
				aprovados [candidatosSelecionados] = candidato;
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
		return aprovados;
	}

	static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		
		double salarioBase = 2000.0;
		if(salarioBase>salarioPretendido) {
			System.out.println("Ligar para o candidato!");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contra proposta!");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos!");
		}
		
	}
	
	static void imprimirCandidatos(String aprovados[]) {
		String [] candidatos = new String[aprovados.length];
		
		for (int i = 0; i < candidatos.length; i++) {
			candidatos[i] = aprovados[i];
		}
		
		System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
		
		for (int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidato de número "+(i+1)+" é: "+candidatos[i]);
		}
		for (String candidato: candidatos) {
			System.out.println("O candidato selecionado foi: "+candidato);
		}
	}
	
}
