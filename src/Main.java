import Entidade.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        //Aparelho Telefonico
        iphone.Call("+5511985327561");
        iphone.AcceptCall();
        iphone.CaixaPostal();

        //Reprodutor de Musica
        iphone.Play("rufi-easily_fraymakersRemix");
        iphone.Pause();
        iphone.SelectMusic();

        //Navegar na internet
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
