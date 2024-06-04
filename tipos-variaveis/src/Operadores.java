public class Operadores {
    
    public static void main(String[] args) {
        //Exemplo de concatenação de String
        String nomeCompleto = "Linguagem"+" "+"Java";
        System.out.println(nomeCompleto);

        // Exemplos da concatenção de valor numérico com escrito (Operador Aritmético)
        String concatenacao ="?"; 
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";        
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;        
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";        
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;        
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);        
        System.out.println(concatenacao);

        // Exemplos de Operador Unário
        int numero = 5;
        System.out.println(- numero);
        System.out.println(numero);
        numero = - numero;
        System.out.println(- numero);
        System.out.println(numero);
        numero = + numero; // Não mudará de negativo pra positivo pois o = + é um operador aritmético e não Unário
        System.out.println(- numero);
        System.out.println(numero);
        

        // Exemplos de outra forma de soma
        int numero2 = 5;
        // x repetições
        // numero2 = numero2 + 1 
        numero2++; // Outra forma de somar 1 ao valor
        System.out.println(numero2);

        // Exemplo Variável Booleana
        boolean variavel = true;
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        // Exemplo de condicional
        int a, b;
        a = 5;
        b = 6;

        String resultado = "";
        if(a==b){
            resultado = "Verdadeiro";
        }
        else {
            resultado = "Falso";
        }
        System.out.println(resultado);

        String resultado2 = a==b ? "verdaediro" : "Falso";
        System.out.println(resultado2);

        // Exemplos de Relacionais
        int numero3 = 1;
        int numero4 = 2;
        boolean simNao = numero3 == numero4;
        System.out.println("Numero 1 é igual Numero 2? "+ simNao);
        boolean simNao2 = numero3 != numero4;
        System.out.println("Numero 1 é igual Numero 2? "+ simNao2);
        // Usando equals que compara o conteúdo da string
        String nome2 = "Garcia";
        String nome3 = "Garcia";
        System.out.println(nome2 == nome3);
        String nome4 = "Garcia";
        String nome5 = new String("Garcia");
        System.out.println(nome4 == nome5);
        System.out.println(nome4.equals(nome5));

        // Exemplos de condições conjuntas no IF 
        boolean condicao1 = true;
        boolean condicao2 = false;
        if(condicao1 && condicao2 ){ // As duas tem que ser verdadeiras
            System.out.println("As duas condições são verdadeiras");
        } 
        if(condicao1 || condicao2)   // Uma das duas tem que ser verdadeira
        {
            System.out.println("Uma das condições é verdadeira");
        }

    }

}
