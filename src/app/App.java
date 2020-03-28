package app;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * <h1> Pooflix </h1>
 * Pooflix es un programa que permite visualizar peliculas y series, ademas te avisa si la viste o no.
 * Tambien puede colocar la lista de las peliculas y series que mas te gustan
 * <p>
 * Existen algunas reglas al subscribirte y es seguir las politicas de nuestra aplicacion.
 * @author DigCakes
 * @version 1.1
 * @since 2020
 * 
*/

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
		

		Pooflix miPooflix = new Pooflix(); 

		System.out.println("Iniciando Catalogo"); 
		miPooflix.inicializarCatalogo(); 
		Serie bb = miPooflix.buscarSerie("Breaking Bad"); 
		Temporada laMejorTemporada = bb.getTemporada(5); 
		Capitulo elTop; 
		elTop = laMejorTemporada.getEpisodio(7); 

		elTop.reproducir(); 
	
	}  

	
	
}