package albumes;

public class Artista extends Persona {

    private int id;
    private String Alias;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    @Override
    public String toString() {
        return "Artista{" + "id=" + id + ", Alias=" + Alias + '}';
    }
    
    

}
