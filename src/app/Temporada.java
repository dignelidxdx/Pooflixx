package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    public int numero;
    public String name;
    public int cantSeries;
    public List<Capitulo> capitulos = new ArrayList<>();
    public List<Serie> series1 = new ArrayList<>();

    public Capitulo getEpisodio(int nro) {
        for (Capitulo c : this.capitulos) {
			if (c.numero == nro)
				return c;
		}
		
		return null;
    }
	

    
}