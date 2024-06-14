public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		//String appEscolhido define com qual app eu irei enviar a mensagem
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
        
        smi.validarConectadoInternet();
	}
}