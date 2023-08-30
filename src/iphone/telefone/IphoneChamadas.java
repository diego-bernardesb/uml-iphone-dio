package iphone.telefone;

public class IphoneChamadas implements Telefone{
    public void ligar(){
        System.out.println("realizar ligação");
    }
    public void atender(){
        System.out.println("atender a chamada recebida");
    }
    public void iniciarCorreioVoz(){
        System.out.println("gravar uma mensagem no correio de voz");
    }
}
