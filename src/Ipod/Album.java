package Ipod;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String name;
    private String artista;
    private List<Musica> musicas;

    private int avaliacao;

    public Album(String name, String artista) {
        this.name = name;
        this.musicas = new ArrayList<>();
        this.artista = artista;
    }

    public void adicionarMusica(Musica musica){
        musicas.add(musica);
    }

    public String getName() {
        return name;
    }

    public String getArtista() {
        return artista;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    @Override
    public String toString() {
        return "Album{" +
                "name='" + name + '\'' +
                ", artista='" + artista + '\'' +
                ", musicas=" + musicas +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
