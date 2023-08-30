import iphone.smartphone.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        String app = "telefone";

        if (app.equals("navegador")){
            iphone.exibirPagina();
            iphone.adicionarNovaAba();
            iphone.atualizarPagina();
        } else if (app.equals("reprodutorMusical")){
            iphone.selecionarMusica();
            iphone.tocar();
            iphone.pausar();
        } else if (app.equals("telefone")){
            iphone.ligar();
            iphone.atender();
            iphone.iniciarCorreioVoz();
        }


    }
}