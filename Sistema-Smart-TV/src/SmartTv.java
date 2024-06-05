public class SmartTv {
    
    boolean ligada = false;
    int canal = 0;
    int volume = 0;

    public void ligar(){
        ligada = true;
        canal = 12;
        volume = 25;        
    }

    public void desligar(){
        ligada = false;
        canal = 0;
        volume = 0;        
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
    }
    
    public void diminuirCanal(){
        canal--;

    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }    
}
