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

	
	
	public boolean filmadaEnImax;
	

	public void reproducir(){
		System.out.println("Reproduciendo la pelicula: " + super.titulo + " Interpretado por: " + super.actores);

	}
}