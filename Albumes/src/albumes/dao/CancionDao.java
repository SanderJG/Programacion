
package albumes.dao;

import albumes.Cancion;
import java.util.ArrayList;
import java.util.List;

public class CancionDao {
    
    public List<Cancion> canciones = new ArrayList<>();
    
    public void agregarCancion (Cancion cancion) {
        canciones.add(cancion);
    }
    
    public void eliminarCancion (Cancion cancion) {
        canciones.remove(cancion);
    }
    
    public Cancion buscarCancion (int id) {
        for (int i = 0; i < canciones.size(); i++) {
            Cancion a = canciones.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }
    
    public void actualizarCancion (Cancion cancion) { 
        for (int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getId() == cancion.getId()){
                canciones.get(i).setDuracion(cancion.getDuracion());
                canciones.get(i).setNombreCancion(cancion.getNombreCancion());
                
            }
        }
        
    }
    
    public List<Cancion> MostrarListaDeCanciones() {
		 return canciones;
    }             
}
