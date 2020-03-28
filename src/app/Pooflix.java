package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pooflix {


	public static Scanner Teclado = new Scanner (System.in);



	public List<Pelicula> pelis = new ArrayList<>();
	public List<Serie> series = new ArrayList<>();

	
	public Film buscarPorTitulo(String titulo){		
		return null;
	}

	public Serie buscarSerie(String titulo) {
		for (Serie s : this.series) {
			if (s.titulo.equals(titulo))
				return s;
		}
		
		return null;
	}

	public Pelicula buscarPelicula(String titulo){
		return null;
	}
	
	public Serie buscarSerie(Actor actor){
		return null;
	}

	public void inicializarCatalogo() {
		
		this.agregarBreakingBAD();

	}

	public void agregarBreakingBAD(){

		Serie breakingB = new Serie(); 
		breakingB.titulo = "Breaking Bad";

		Genero genero = new Genero(); 
		genero.nombre = "Drama"; 
		breakingB.generos.add(genero); 

		Temporada t5 = new Temporada(); 
		t5.numero = 5; 

		Capitulo ep = new Capitulo(); 
		ep.numero = 7; 
		ep.nombre = "Say my name"; 
		ep.duracion = 43;
		t5.capitulos.add(ep); 

		Capitulo epOtro = new Capitulo(); 
		epOtro.numero = 5; 
		epOtro.nombre = "Ozymandias"; 
		epOtro.duracion = 41; 
		t5.capitulos.add(epOtro); 

		breakingB.temporadas.add(t5);
		 
		this.series.add(breakingB); 
	}


    

}