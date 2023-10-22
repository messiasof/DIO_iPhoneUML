package Entidade;

import Interface.CelularIphone;
import Interface.Browser;
import Interface.Spotify;

public class Iphone implements CelularIphone, Browser, Spotify {
    @Override
    public void Call(String cell) {
        System.out.println("ligando para " + cell);
    }

    @Override
    public void AcceptCall() {
        System.out.println("Atendendo a ligação!");
    }

    @Override
    public void CaixaPostal() {
        System.out.println("Reproduzindo correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }

    @Override
    public void Play(String musica) {

        System.out.println("Tocando " + musica);
    }

    @Override
    public void Pause() {
        System.out.println("Música pausada!");
    }

    @Override
    public void SelectMusic() {
        System.out.println("Música selecionada!");
    }
}
