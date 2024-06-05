public class Usuario {
    
    public static void main(String[] args) throws Exception {
    
        SmartTv smartTv = new SmartTv();

        System.out.println("TV está ligada? "+smartTv.ligada);
        System.out.println("TV está em qual canal? "+smartTv.canal);
        System.out.println("TV está em qual volume?"+smartTv.volume);

        smartTv.ligar();
        System.out.println("TV está ligada? "+smartTv.ligada);

        System.out.println(smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println(smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);

        System.out.println(smartTv.canal);
        smartTv.aumentarCanal();
        System.out.println(smartTv.canal);
        smartTv.diminuirCanal();
        System.out.println(smartTv.canal);
        smartTv.mudarCanal(21);
        System.out.println(smartTv.canal);

        smartTv.desligar();

    }
}
