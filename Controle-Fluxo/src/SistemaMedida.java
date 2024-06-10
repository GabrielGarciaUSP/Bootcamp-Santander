// SistemaMedida.java
public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
		case "P":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":{
			System.out.println("MÉDIO");
			break;
		}
		case "G":{
			System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
			
		// Modo condicional switch/case

		String plano = "M"; // M / T

		switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
                break;
			}
			case "M": {
				System.out.println("WhatsApp e Instagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
		}
	}
}