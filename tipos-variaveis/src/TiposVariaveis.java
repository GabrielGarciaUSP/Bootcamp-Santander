public class TiposVariaveis {
    
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        // Valor int, string, normais podem ser alterados
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        // Com o uso do "final" o valor não pode ser alterado, run não ocorrerá
        final double ValorDePi = 3.14;
        // ValorDePi = 10.34;
        System.out.println(ValorDePi);

    }

}
