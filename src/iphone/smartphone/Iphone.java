package iphone.smartphone;

import iphone.navegador.Navegador;
import iphone.reprodutorMusical.ReprodutorMusical;
import iphone.telefone.Telefone;

public class Iphone implements Navegador, ReprodutorMusical, Telefone {
    @Override
    public void exibirPagina() {
        validarConexao();
        System.out.println("exibir pagina inicial do navegador do iphone.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrir nova aba na pagina inicial do navegador do iphone.");
    }

    @Override
    public void atualizarPagina() {
        validarConexao();
        System.out.println("recaregar a pagina do iphone.");
    }

    @Override
    public void validarConexao() {
        System.out.println("valida se está conectado a internet pelo iphone");
    }

    @Override
    public void tocar() {
        System.out.println("tocando musica no iphone");
    }

    @Override
    public void pausar() {
        System.out.println("pausar a musica que está sendo reproduzida no iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("seleciona uma musica no iphone");
    }

    @Override
    public void ligar() {
        System.out.println("realizar ligação pelo iphone");
    }

    @Override
    public void atender() {
        System.out.println("atender a chamada recebida no iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("gravar uma mensagem no correio de voz direto do iphone");
    }
}
