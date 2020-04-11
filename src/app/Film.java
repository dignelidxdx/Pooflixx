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
	
	public List<String> premios = new ArrayList<>();
	public List<Genero> generos = new ArrayList<>();
	public List<Actor> actores = new ArrayList<>();

	
	public Film(String titulo, int duracion) {
		this.titulo = titulo;
		this.duracion = duracion;
	}



	private String titulo;

	public String getTitulo(){
		return titulo;
	}
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}

	private String genero;

	public String getGenero(){
		return genero;
	}
	public void setGenero(String genero){
		this.genero = genero;	
	}

	private String director;
	public String getDirector(){
		return director;
	}
	public void setDirector(String director){
		this.director = director;
	}

	private int duracion;
	public int getDuracion(){
		return duracion;
	}
	public void setDuracion(int duracion){
		this.duracion = duracion;
	}

	private int anio;
	public int getAnio(){
		return anio;
	}
	public void setAnio(int anio){
		this.anio = anio;
	}

	private boolean viewed;
	public boolean getViewed(){
		return viewed;
	}
	public void setViewed(boolean viewed){
		this.viewed = viewed;
	}


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