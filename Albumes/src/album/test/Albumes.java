
package album.test;

import albumes.Album;
import albumes.Artista;
import albumes.Cancion;
import albumes.Genero;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Albumes {


    public static void main(String[] args) {
        
        Genero genero1 = new Genero();
        genero1.setId(32);
        genero1.setNombreGenero("Indie");
        
        Artista artista1 = new Artista();
        artista1.setId(4);
        artista1.setNombre("Grupo");
        artista1.setAlias("Foster the people");
        
         Cancion cancion1 = new Cancion();
        cancion1.setId(54);
        cancion1.setNombreCancion("Imagination");
        cancion1.setDuracion(416);
       
        
        Cancion cancion2 = new Cancion();
        cancion2.setId(343);
        cancion2.setNombreCancion("Pumped Up kicks");
        cancion2.setDuracion(400);
        
        List<Cancion> albun = new ArrayList<>();
        albun.add(cancion1);
        albun.add(cancion2);
        
        Album album = new Album ();
        
        album.setId(1);
        Date  FechaDate = new Date();
        album.setFechaDate(FechaDate);
        album.setPersona(artista1);
        album.setGenero(genero1);
        album.setNombreAlbum("Torches");
        album.setCanciones(albun);
        
        Genero genero2 = new Genero();
        genero2.setId(31);
        genero2.setNombreGenero("Rock");
        
        Cancion cancion3 = new Cancion();
        cancion3.setId(34);
        cancion3.setNombreCancion("Aprovechate");
        cancion3.setDuracion(414);
        
                
        Artista artista2 = new Artista();
        artista2.setId(12);
        artista2.setAlias("Cafe Tacvba");
        artista2.setNombre("Grupo");
        
        List<Cancion> albun2 = new ArrayList<>();
        albun2.add(cancion3);
            
        Album album2 = new Album ();
        album2.setId(0);
        album2.setFechaDate(FechaDate);
        album2.setGenero(genero2);
        album2.setPersona(artista2);
        album2.setNombreAlbum("El objeto antes llamado disco");
        album2.setCanciones(albun2);
        
        Genero genero3 = new Genero();
        genero3.setId(1);
        genero3.setNombreGenero("Elctronica");
        
        Artista artista3 = new Artista();
        artista3.setId(37);
        artista3.setAlias("Skrillex");
        artista3.setNombre("Sonny");
  
        Cancion cancion4 = new Cancion();
        cancion4.setId(34);
        cancion4.setNombreCancion("SELECTA");
        cancion4.setDuracion(256);
        
        Cancion cancion5 = new Cancion();
        cancion5.setId(34);
        cancion5.setNombreCancion("Real Spring");
        cancion5.setDuracion(256);
        
        List<Cancion> albun3 = new ArrayList<>();
        albun3.add(cancion4);
        albun3.add(cancion5);
        
        Album album3 = new Album ();
        album3.setId(0);
        album3.setFechaDate(FechaDate);
        album3.setGenero(genero3);
        album3.setPersona(artista3);
        album3.setNombreAlbum("Dont Get to Close");
        album3.setCanciones(albun3);
        
        
        System.out.println(album);
        System.out.println(album2);
        System.out.println(album3);
    }
    
}
