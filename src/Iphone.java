import Internet.Internet;
import Ipod.Album;
import Ipod.Ipod;
import Ipod.Musica;
import Telefone.Telefone;
import Telefone.Contato;
import Internet.Pagina;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Iphone implements Ipod, Telefone, Internet {
    List<Musica> listaMusicas;
    List<Album> listaAlbuns;

    List<Contato> favoritos;
    List<Contato> contatos;
    List<Pagina> abas;

    public Iphone() {
        this.listaMusicas = new ArrayList<Musica>();
        this.listaAlbuns = new ArrayList<Album>();
        this.favoritos = new ArrayList<Contato>();
        this.contatos = new ArrayList<Contato>();
        this.abas = new ArrayList<Pagina>();
    }

    @Override
    public void tocarMusica(Musica musica) {
        System.out.println(musica.getName() + " tocando no momento");
    }

    @Override
    public void pausarMusica(Musica musica) {
        System.out.println(musica.getName() + " pausada");
    }

    @Override
    public void salvarMusica(Musica musica) {
        listaMusicas.add(musica);
        System.out.println("Músicas salvas: " + listaMusicas);
    }

    @Override
    public void salvarAlbum(Album album) {
        listaAlbuns.add(album);
        System.out.println("Álbuns salvos: " + listaAlbuns);
    }

    @Override
    public void avaliarAlbum(Album album, int avaliacao) {
        album.setAvaliacao(avaliacao);
        System.out.println(album.getAvaliacao());
    }

    @Override
    public void tocarAlbum(Album album) {
        System.out.println("Tocando álbum " + album.getName() + ", artista " + album.getArtista());
    }

    @Override
    public void atenderChamada(Contato contato) {
        System.out.println("Chamada recebida de " + contato.getNumero());
    }

    @Override
    public void recusarChamada(Contato contato) {
        System.out.println("Chamada recusada de " + contato.getNumero());
    }

    @Override
    public void realizarChamada(Contato contato) {
        System.out.println("Ligando para " + contato.getNumero());
    }

    @Override
    public void fazerConferencia(Contato contato) {

    }

    @Override
    public void adicionarFavorito(String nome) {
        Optional<Contato> contato = contatos.stream()
                .filter(item -> item.getNome().equalsIgnoreCase(nome))
                .findFirst();

        if (contato.isPresent()) {
            favoritos.add(contato.get());
        }
        System.out.println("Contato salvo na lista de favoritos: " + favoritos);
    }

    @Override
    public void adicionarContato(String nome, String numero) {
        Contato contato = new Contato(nome, numero);
        contatos.add(contato);
        System.out.println("Contato salvo!");
        System.out.println("Lista de contatos: " + contatos);
    }

    @Override
    public void iniciarCorreioDeVoz() {

    }

    @Override
    public void exibirPagina(Pagina pagina) {
        System.out.println("Exibindo " + pagina.getNome());
        adicionarAba(pagina);
    }

    @Override
    public void adicionarAba(Pagina pagina) {
        abas.add(pagina);
        System.out.println("Nova aba " + pagina.getNome());
        System.out.println("Lista de abas abertas: " + abas);
    }

    @Override
    public void fecharAba(Pagina pagina) {
        abas.removeIf(item -> item.getUrl().equalsIgnoreCase(pagina.getUrl()));
        System.out.println("Aba fechada " + pagina.getNome());
        System.out.println("Lista de abas abertas: " + abas);
    }

    @Override
    public void atualizarPagina(Pagina pagina) {
        System.out.println("Atualizando página " + pagina);
    }
}