public class ComputadorPedrinho {
   public static void main(String[] args) {
       System.out.println("MSN Messenger");
       MSNMessenger msn = new MSNMessenger();
       msn.enviarMensagem();
       msn.receberMensagem();

       System.out.println("Facebook Messenger");
       FacebookMessenger fcbk = new FacebookMessenger();
       fcbk.enviarMensagem();
       fcbk.receberMensagem();
       
       System.out.println("Telegram");
       Telegram tlg = new Telegram();
       tlg.enviarMensagem();
       tlg.receberMensagem();
   } 
}   
