package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Genero
 */
public class Genero {

    public Genero(String nombre){
        this.nombre = nombre;
    }

    private String nombre;
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Genero> genero = new ArrayList<>();
	
    
}