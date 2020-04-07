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
		iniciarCatalogo();
		miPooflix.inicializarCatalogo();

		Pelicula p = miPooflix.buscarPelicula("El senor de los anillos: La comunidad del anillo");
		Actor losActores = p.getActores(1);
		p.reproducir();

		



		Serie bb = miPooflix.buscarSerie("The Walking Dead");
		Temporada laMejorTemporada = bb.getTemporada(3);
		Capitulo epiDemo;
		int posicion = 0;

		/// En base a un numero de posicion de episodio, obtenerlo de la lista
		System.out.println("Ingrese la posicion");
		posicion = Teclado.nextInt();
		epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);
		epiDemo.reproducir();

		// instanceof: devuelve si la variable es de tipo Clase X
		// En este caso, devuelve si epiDemo declarado como Episodio apunta a una clase
		// Websodio
		if (epiDemo instanceof Websodio) {
			System.out.println("Estoy reproduciendo un websodio");

			// (clase): Operador casteo.
			// Casteo lo que hace es acomodar la variable a castear, a una clase especifica
			// da error si no se puede acomodar. por eso siempre se pregunta antes con un
			// instance of
			Websodio webso = (Websodio) epiDemo;
			webso.enviarAlertaDeQueEstaOnline();
		} else
			System.out.println("Estoy reproduciendo un Episodio");

		Capitulo elTop;
		elTop = laMejorTemporada.getEpisodio(1);
		elTop.reproducir();
		Capitulo otroEpi;
		otroEpi = laMejorTemporada.getEpisodio(3);
		otroEpi.reproducir();

	}

	public static void iniciarCatalogo() {
		System.out.println("Iniciando Catalogo....");
	}

}


