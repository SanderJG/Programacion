package mx.uamex.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.uamex.dto.Alumno;
import mx.uamex.dto.Libro;
import mx.uamex.dto.Prestamo;
import mx.uamex.dto.Profesor;


public class TestPrestamo {

    public static void main(String[] args) {

        Libro libro1 = new Libro();
        libro1.setId(1);
        libro1.setNombre("El periquillo Sarniento");
        libro1.setCategoria("Cuentos");
        libro1.setEditorial("SEP");
        libro1.setIsbn(1355);
        libro1.setStock(35);

        Libro libro2 = new Libro();
        libro2.setId(3121);
        libro2.setNombre("SPIDERWICH");
        libro2.setCategoria("fantasia");
        libro2.setEditorial("EdicionesB");
        libro2.setIsbn(321257);
        libro2.setStock(214);
        
                List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro2);
        listaLibros.add(libro1);
        
                Alumno alumno1 = new Alumno();
        alumno1.setId(2131);
        alumno1.setNombre("Irene");
        alumno1.setApellidoPaterno("Galvez");
        alumno1.setApellidoMaterno("Rojas");
        alumno1.setNumeroCuenta(22270527);
        
                Prestamo prestamo1 = new Prestamo();
        Date fechaIni = new Date();
        prestamo1.setId(1);
        prestamo1.setFolio(1);
        prestamo1.setFechainicio(fechaIni);
        prestamo1.setLibros(listaLibros);
        prestamo1.setPersona(alumno1);
        prestamo1.setEstatus("Finalizado");
        
        Libro libro3 = new Libro();
        libro3.setId(11232);
        libro3.setNombre("Programacion 1");
        libro3.setCategoria("Tecnologia");
        libro3.setEditorial("PROGRT");
        libro3.setIsbn(37);
        libro3.setStock(6);
        
         List<Libro> listaLibros2 = new ArrayList<>();
        listaLibros2.add(libro3);
        
          Alumno alumno2 = new Alumno();
        alumno2.setId(214);
        alumno2.setNombre("Alexander");
        alumno2.setApellidoPaterno("Jimenez");
        alumno2.setApellidoMaterno("Garcia");
        alumno2.setNumeroCuenta(22275);
        
        Prestamo prestamo2 = new Prestamo();
        prestamo2.setId(3421);
        prestamo2.setFolio(11222);
        prestamo2.setFechainicio(fechaIni);
        prestamo2.setLibros(listaLibros2);
        prestamo2.setPersona(alumno2);
        prestamo2.setEstatus("Activo");
        
        Libro libro4 = new Libro();
        libro4.setId(23241215);
        libro4.setNombre("Fisica 1");
        libro4.setCategoria("Ciencias");
        libro4.setEditorial("COURTMAL");
        libro4.setIsbn(73);
        libro4.setStock(3);
        
        Libro libro5 = new Libro();
        libro5.setId(21231231);
        libro5.setNombre("  Calculo integral");
        libro5.setCategoria("Matematicas");
        libro5.setEditorial("CIMAT");
        libro5.setIsbn(4537);
        libro5.setStock(5);
        
          List<Libro> listaLibros3 = new ArrayList<>();
        listaLibros3.add(libro4);
        listaLibros3.add(libro5);
        
        Profesor profesor = new Profesor();
        profesor.setId(4);
        profesor.setNombre("Sergio");
        profesor.setApellidoPaterno("Corona");
        profesor.setApellidoMaterno("Martinez");
        profesor.setNumeroEmpleado(12340);

        
        Prestamo prestamo3 = new Prestamo();
        prestamo3.setId(31232);
        prestamo3.setFolio(4442);
        prestamo3.setFechainicio(fechaIni);
        prestamo3.setLibros(listaLibros3);
        prestamo3.setPersona(profesor); 
        prestamo3.setEstatus("Retraso");

        System.out.println(prestamo1);
        System.out.println(prestamo2);
        System.out.println(prestamo3);
        
        
        

    }
}
