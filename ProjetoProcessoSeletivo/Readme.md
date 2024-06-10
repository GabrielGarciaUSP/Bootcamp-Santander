# Processo Seletivo

#### Autor
- [Gabriel Garcia](https://github.com/GabrielGarciaUSP)

## Explicação do desafio
Este projeto simula um processo seletivo, onde candidatos são selecionados com base em um salário pretendido e, em seguida, são contatados para informar o resultado da seleção.

## Funcionalidades
- Seleção de Candidatos: Candidatos são selecionados com base em um salário base e em seus salários pretendidos. Apenas os candidatos cujo salário pretendido seja menor ou igual ao salário base são selecionados.
- Impressão de Candidatos Selecionados: Os candidatos selecionados são impressos na tela, informando seus números de índice.
Contato com Candidatos: Os candidatos selecionados são contatados para informar o resultado da seleção. São realizadas até três tentativas de contato por candidato.

## Execução:
-  Para executar o programa, basta compilar a classe ProcessoSeletivo.java e executar o arquivo compilado.
-  O programa solicitará a entrada de dados referentes aos salários dos candidatos.
-  Após a entrada dos dados, o programa realizará a seleção dos candidatos, imprimirá os candidatos selecionados e tentará contatá-los.

## Estrutura do Projeto
O projeto é composto por uma única classe chamada `ProcessoSeletivo.java`, que contém toda a lógica necessária para a interação com o usuário e a exibição da mensagem final.

### Funções
- Temos primeiro a função para definir um valor de salário aleatório, para isso nós importamos a biblioteca Random.
```java
import java.util.Random;

static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
```

- Logo em seguida temos a função para selecionar os candidatos, conforme o salário pretendido.
```java 
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
```
- Após selecionados os candidatos nós temos uma função para imprimir os aprovados.
```java
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
```
- Para finalizar temos a função de entrar em contato com os aprovados, com um limite de 3 tentativas.
```java
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
```

Com isso nosso código é finalizado, selecionando alguns candidatos de acordo com seus salários pretendidos e realiznado contato para que eles sejam contratados.