package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pooflix {


	public static Scanner Teclado = new Scanner (System.in);



	public List<Pelicula> pelis = new ArrayList<>();
	public List<Serie> series = new ArrayList<>();
	

	public Director getDirector() {
		return null;
	}

	
	public Film buscarPorTitulo(String titulo){		
		return null;
	}

	public Serie buscarSerie(String titulo) {
		for (Serie s : this.series) {
			if (s.getTitulo().equals(titulo))
				return s;
		}
		
		return null;
	}

	public Pelicula buscarPelicula(String titulo){
		for (Pelicula p: this.pelis) {
			if (p.getTitulo().equals(titulo))
				return p;
		}
		return null;
	}
	
	public Serie buscarSerie(Actor actor){
		return null;
	}

	public void inicializarCatalogo() {
		
		this.agregarBreakingBAD();
		this.agregarTheWalkingDead();
		this.agregar1raPelicula();
	}

	private void agregar1raPelicula() {
		
		Pelicula elSenorDeLosAnillos = new Pelicula("El senor de los anillos: La comunidad del anillo", 160, 2003);

		
		Genero genero = new Genero("fantasia");
		elSenorDeLosAnillos.generos.add(genero);

		Actor actor = new Actor();
		actor.posicion = 1;
		actor.name = "Ian McKellen";
		actor.anio = 35;
		elSenorDeLosAnillos.actores.add(actor);

		Actor actor2 = new Actor();
		actor2.posicion = 1;
		actor2.name = "Elijah Wood";
		actor2.anio = 40;
		elSenorDeLosAnillos.actores.add(actor2);

		Director director = new Director();
		director.name = "Peter Jackson";


		this.pelis.add(elSenorDeLosAnillos);
	}

	public void agregarTheWalkingDead() {

		Serie theWD = new Serie("The Walking Dead", 60);

		Genero generoTWD = new Genero("horror");
		theWD.generos.add(generoTWD);

		Temporada temp1 = new Temporada(1);
		
		Capitulo cap1 = new Capitulo(1, "Days Gone Bye", 41);
		temp1.capitulos.add(cap1);

		Capitulo cap3 = new Capitulo(3, "Tell It To The Frogs", 40);
		temp1.capitulos.add(cap3);

		theWD.temporadas.add(temp1);

		Temporada temp3 = new Temporada(3);

		Capitulo cap4 = new Capitulo(4, "Walk With Me", 47);
		temp3.capitulos.add(cap4);

		Capitulo cap5 = new Capitulo(5, "Say the Word", 50);
		temp3.capitulos.add(cap5);

		theWD.temporadas.add(temp3);

		this.series.add(theWD);


		Websodio sodio = new Websodio(1, "A new day");
		
		temp3.capitulos.add(sodio);

		sodio = new Websodio(2, "Alone");

		temp3.capitulos.add(sodio);

		theWD.temporadas.add(temp3);
		 
		this.series.add(theWD); 	

	}

	public void agregarBreakingBAD() {

		Serie breakingB = new Serie("Breaking Bad", 45); 
	

		Genero genero = new Genero("Drama"); 
		breakingB.generos.add(genero); 

		Temporada t5 = new Temporada(5);

		Capitulo ep = new Capitulo(); 
		ep.setNumero(7);
		ep.setNombre("Say my name");
		ep.setDuracion(43);
		t5.capitulos.add(ep); 

		Capitulo epOtro = new Capitulo(); 
		epOtro.setNumero(5);
		epOtro.setNombre("Ozymandias"); 
		epOtro.duracion = 41; 
		t5.capitulos.add(epOtro); 

		breakingB.temporadas.add(t5);
		 
		this.series.add(breakingB); 

	}

	


    

}