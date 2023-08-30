package iphone.reprodutorMusical;

public class Ipod implements ReprodutorMusical {
    public void tocar(){
        selecionarMusica();
        System.out.println("tocando musica");
    }
    public void pausar(){
        System.out.println("pausar a musica que está sendo reproduzida");
    }
    public void selecionarMusica(){
        System.out.println("seleciona uma musica");
    }
}
