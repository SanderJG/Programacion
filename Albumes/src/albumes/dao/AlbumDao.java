
package albumes.dao;

import albumes.Album;
import java.util.ArrayList;
import java.util.List;

public class AlbumDao {
    
    public List<Album> albums = new ArrayList<>();
    
    public void agregarAlbum (Album album) {
        albums.add(album);
    }
    
    public void eliminarAlbum (Album album) {
        albums.remove(album);
    }
    
    public Album buscarAlbum (int id) {
        for (int i = 0; i < albums.size(); i++) {
            Album a = albums.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void actualizarAlbum (Album album) { 
        for (int i = 0; i < albums.size(); i++) {
            if (albums.get(i).getId() == album.getId()){
                albums.get(i).setFechaDate(album.getFechaDate());
                albums.get(i).setGenero(album.getGenero());
                albums.get(i).setPersona(album.getPersona());
                albums.get(i).setNombreAlbum(album.getNombreAlbum());
                albums.get(i).setCanciones(album.getCanciones());
            }
        }
        
    }
    
    public List<Album> MostrarListaDeAlbums() {
		 return albums;
    }
}
