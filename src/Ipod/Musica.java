package Ipod;

public class Musica {
    private String nome;

    private Album album;

    public Musica(String name, Album album) {
        this.nome = name;
        this.album = album;
    }

    public String getName() {
        return nome;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
