package app;


import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Film</h1> Film es una clase padre abstracta
 * <p>
 * Esta clase es la clase base de la familia Films {@code view()} que es
 * obligatorio implementar para todo aquel que pertenezca a la familia.
 * 
 * @author Digcakes
 * @version 1.1
 * @since 2020
 */

public class Film {

    
	public String titulo;
	public String genero;
	public String director;
	public int duracion;
	public short anio;
    public boolean viewed;
	
	public List<String> premios = new ArrayList<>();
	public List<Genero> generos = new ArrayList<>();
	public List<Actor> actores = new ArrayList<>();

	public Actor getActores(int numero) {
		for (Actor act : this.actores) {
			if (act.posicion == numero) {
                return act;
            }
				
		}
        return null;
	}
	
	public boolean visto(){
		return true;		
	}

	public void reproducir(){
		System.out.println("Reproduciendo la pelicula: " + this.titulo);

	}

	public void pausar(){

	}
	
    
}