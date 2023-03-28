
package album.facade;

import albumes.Album;
import albumes.dao.AlbumDao;

public class AlbumFacade {
    
    AlbumDao albumDao= new AlbumDao();
	
	public void agregarAlbum(Album album) {
		albumDao.agregarAlbum(album);
	}
	
	public void leerAlbum(){
		albumDao.MostrarListaDeAlbums();
		
	} 
	
	public void actualizarAlbum(Album album) {
		albumDao.actualizarAlbum(album);
	}
	
	public void eliminarAlbum(Album album) {
		albumDao.eliminarAlbum(album);
	}
    
}
