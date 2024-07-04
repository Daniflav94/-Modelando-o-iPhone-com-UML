package Ipod;

import java.util.List;

public interface Ipod {
    public void tocarMusica(Musica musica);
    public void pausarMusica(Musica musica);
    public void salvarMusica(Musica musica);
    public void salvarAlbum(Album album);
    public void avaliarAlbum(Album album, int avaliacao);
    public void tocarAlbum(Album album);



}
