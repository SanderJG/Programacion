
package album.test;

import albumes.*;
import albumes.dao.*;
import java.util.List;

public class Test1 {
    
    ArtistaDao artistadao = new ArtistaDao();
    AlbumDao albumdao = new AlbumDao();
    CancionDao canciondao = new CancionDao();

    public void CrearArtista(Artista artista) {
        artistadao.agregarArtista(artista);
    }

    public void CrearAlbum(Album album) {
        albumdao.agregarAlbum(album);
    }

    public void CrearCancion(Cancion cancion) {
        canciondao.agregarCancion(cancion);
    }

    public void ConsultarAlbum(int id) {
        Album a = albumdao.buscarAlbum(id);
        System.out.println("La busqueda desde id es: " + a.toString());
    }

    public void ConsultarTodos() {
        List<Album> albums = albumdao.MostrarListaDeAlbums();
        for (Album a : albums) {
            System.out.println(a.toString());
        }

    }
    
}
