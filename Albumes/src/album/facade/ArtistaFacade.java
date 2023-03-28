
package album.facade;

import albumes.Artista;
import albumes.dao.ArtistaDao;

public class ArtistaFacade {
    
    ArtistaDao artistaDao= new ArtistaDao();
	
	public void agregarArtista(Artista artista) {
		artistaDao.agregarArtista(artista);
	}
	
	public void leerArtista(){
		artistaDao.MostrarListaDeArtistas();
		
	} 
	
	public void actualizarArtista(Artista artista) {
		artistaDao.actualizarArtista(artista);
	}
	
	public void eliminarArtista(Artista artista) {
		artistaDao.eliminarArtista(artista);
	}
    
}
