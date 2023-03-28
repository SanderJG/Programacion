package albumes.dao;

import albumes.Artista;
import java.util.ArrayList;
import java.util.List;

public class ArtistaDao {

    public List<Artista> artistas = new ArrayList<>();

    public void agregarArtista(Artista artista) {
        artistas.add(artista);
    }

    public void eliminarArtista(Artista artista) {
        artistas.remove(artista);
    }

    public Artista buscarArtista(int id) {
        for (int i = 0; i < artistas.size(); i++) {
            Artista a = artistas.get(i);
            if (a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    public void actualizarArtista(Artista artista) {
        for (int i = 0; i < artistas.size(); i++) {
            if (artistas.get(i).getId() == artista.getId()) {
                artistas.get(i).setAlias(artista.getAlias());
                artistas.get(i).setNombre(artista.getNombre());

            }

        }

    }
    public List<Artista> MostrarListaDeArtistas() {
		 return artistas;
    }             
}
