package app;


/**
 * <h1> Pelicula </h1>
 * <p> This class Inherited from {@link Film}
 * 
 * @author DigCakes
 * @version 1.1
 * @since 2020
 * 
 * 
 */

public class Pelicula extends Film {

	
	public Pelicula(String titulo, int duracion, int anio){
		super(titulo, duracion);
	}
	
	private boolean filmadaEnImax;
	public boolean getFilmadaEnImax(){
		return filmadaEnImax;
	}
	public void setFilmadaEnImax(boolean filmadaEnImax){
		this.filmadaEnImax = filmadaEnImax;
	}
	

	public void reproducir(){
		System.out.println("Reproduciendo la pelicula: " + getTitulo() + " Interpretado por: " + super.actores);

	}
}