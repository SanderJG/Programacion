
package album.facade;

import albumes.Cancion;
import albumes.dao.CancionDao;

public class CancionFacade {
    
    CancionDao cancionDao= new CancionDao();
	
	public void agregarCancion(Cancion cancion) {
		cancionDao.agregarCancion(cancion);
	}
	
	public void leerCancion(){
		cancionDao.MostrarListaDeCanciones();
		
	} 
	
	public void actualizarCancion(Cancion cancion) {
		cancionDao.actualizarCancion(cancion);
	}
	
	public void eliminarCancion(Cancion cancion) {
		cancionDao.eliminarCancion(cancion);
	}
    
}
