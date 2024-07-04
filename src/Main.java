import Internet.Pagina;
import Ipod.Album;
import Ipod.Ipod;
import Ipod.Musica;
import Telefone.Contato;

public class Main {
    public static void main(String[] args) {
        Album album1 = new Album("Session1","José jr");
        Musica musica1 = new Musica("Yeshua", album1);
        Musica musica2 = new Musica("Amar como você", album1);
        album1.adicionarMusica(musica1);
        album1.adicionarMusica(musica2);

        Iphone iphone = new Iphone();
        iphone.tocarMusica(musica1);
        iphone.avaliarAlbum(album1,5);
        iphone.tocarAlbum(album1);
        iphone.salvarMusica(musica2);
        iphone.salvarAlbum(album1);
        iphone.adicionarContato("Felipe", "11990205477");
        iphone.adicionarContato("Daniele", "11945567816");
        iphone.adicionarFavorito("Felipe");
        iphone.atenderChamada(new Contato("Bob", "11912345678"));
        iphone.recusarChamada(new Contato("Bob", "11912345678"));
        iphone.realizarChamada(new Contato("Bob", "11912345678"));
        iphone.exibirPagina(new Pagina("DIO", "https://web.dio.me/track/coding-future-gft-desenvolvimento-java-com-ia"));
        iphone.adicionarAba(new Pagina("Linkedin","https://www.linkedin.com/"));
        iphone.fecharAba(new Pagina("Linkedin","https://www.linkedin.com/"));
        iphone.atualizarPagina(new Pagina("DIO", "https://web.dio.me/track/coding-future-gft-desenvolvimento-java-com-ia"));


    }
}
