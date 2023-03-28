
package albumes;

import java.util.Date;
import java.util.List;


public class Album{
    
    private int id;
    private String nombreAlbum;
    private Date FechaDate;
    private List<Cancion> canciones;
    private Persona persona;
    private Genero genero;

    public Date getFechaDate() {
        return FechaDate;
    }

    public void setFechaDate(Date FechaDate) {
        this.FechaDate = FechaDate;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(List<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nombreAlbum=" + nombreAlbum + ", canciones=" + canciones + ", fecha de lanzamiento:"+FechaDate+", El artista es:"+persona+", Genero:"+genero+'}';
    }

    
    
}
