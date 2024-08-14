import Interfaces.AparelhoTelefonico;
import Interfaces.NavegadorInternet;
import Interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        System.out.println("Acessando o Reprodutor Musical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("");

        System.out.println("Acessando o Aparelho Telefonico");
        iphone.ligar();
        iphone.atender();
        iphone.inciarCorreioDeVoz();
        System.out.println("");

        System.out.println("Acessando o Navegador de Internet");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo a uma chamada...");
    }

    @Override
    public void inciarCorreioDeVoz() {
    System.out.println("Iniciando correiro de voz...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo uma página web...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Acidionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando uma página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }
}
   
