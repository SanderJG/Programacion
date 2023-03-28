
package albumes;


public class Genero {
    
    private int id;
    private String nombreGenero;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreGenero() {
        return nombreGenero;
    }

    public void setNombreGenero(String nombreGenero) {
        this.nombreGenero = nombreGenero;
    }

    @Override
    public String toString() {
        return "Genero{" + "id=" + id + ", nombreGenero=" + nombreGenero + '}';
    }
    
   
    
}
