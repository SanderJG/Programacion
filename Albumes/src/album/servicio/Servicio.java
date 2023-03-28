
package album.servicio;

import album.facade.*;
import albumes.*;
import java.util.ArrayList;
import java.util.List;

public interface Servicio {
    
    public List<Artista> agregarArtista(Artista artista);
    public List<Artista> eliminarArtista(Artista artista);
    public List<Artista> buscarArtista(Artista artista);
    public List<Artista> actualizarArtista(Artista artista);
    public ArrayList<Artista> imprimirArtista(Artista artista);
    
    public List<Album> agregarAlbum(Album album);
    public List<Album> eliminarAlbum(Album album);
    public List<Album> buscarAlbum(Album album);
    public List<Album> actualizarAlbum(Album album);
    public ArrayList<Album> imprimirAlbum(Album album);
    
    public List<Cancion> agregarCancion(Cancion cancion);
    public List<Cancion> eliminarCancion(Cancion cancion);
    public List<Cancion> buscarCancion(Cancion cancion);
    public List<Cancion> actualizarCancion(Cancion cancion);
    public ArrayList<Cancion> imprimirCancion(Cancion cancion);
        
}
