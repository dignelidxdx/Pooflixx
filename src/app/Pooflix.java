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
		this.agregarTheWalkingDead();
	
	}

	public void agregarTheWalkingDead() {

		Serie theWD = new Serie();
		theWD.titulo = "The Walking Dead";

		Genero generoTWD = new Genero();
		generoTWD.nombre = "horror";
		theWD.generos.add(generoTWD);

		Temporada temp1 = new Temporada();
		temp1.numero = 1;
		
		Capitulo cap1 = new Capitulo();
		cap1.numero = 1;
		cap1.nombre = "Days Gone Bye";
		cap1.duracion = 41;
		temp1.capitulos.add(cap1);

		Capitulo cap3 = new Capitulo();
		cap3.numero = 3;
		cap3.nombre = "Tell It To The Frogs";
		cap3.duracion = 40;
		temp1.capitulos.add(cap3);

		theWD.temporadas.add(temp1);

		Temporada temp3 = new Temporada();
		temp3.numero = 3;

		Capitulo cap4 = new Capitulo();
		cap4.numero = 4;
		cap4.nombre = "Walk With Me";
		cap4.duracion = 47;
		temp3.capitulos.add(cap4);

		Capitulo cap5 = new Capitulo();
		cap5.numero = 5;
		cap5.nombre = "Say the Word";
		cap5.duracion = 50;
		temp3.capitulos.add(cap5);

		theWD.temporadas.add(temp3);

		this.series.add(theWD);


		Websodio sodio = new Websodio();
		sodio.nombre = "A new day";
		sodio.numero = 1;
		sodio.duracion = 5;
		sodio.url = "https://es.wikipedia.org/wiki/The_Walking_Dead:_Torn_Apart";
		
		temp3.capitulos.add(sodio);

		sodio = new Websodio();
		sodio.nombre = "Alone";
		sodio.numero = 2;
		sodio.duracion = 10;
		sodio.url = "https://es.wikipedia.org/wiki/The_Walking_Dead:_Torn_Apart";
		
		temp3.capitulos.add(sodio);

		theWD.temporadas.add(temp3);
		 
		this.series.add(theWD); 
	

	}

	public void agregarBreakingBAD() {

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