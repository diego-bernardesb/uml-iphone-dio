package iphone.navegador;

public class Safari implements Navegador {
    public void exibirPagina(){
        validarConexao();
        System.out.println("exibir pagina inicial do navegador.");
    }
    public void adicionarNovaAba(){
        exibirPagina();
        System.out.println("abrir nova aba na pagina inicial do navegador.");
    }
    public void atualizarPagina(){
        validarConexao();
        System.out.println("recaregar a pagina.");
    }
    public void validarConexao(){
        System.out.println("valida se está conectado a internet");
    }
}
