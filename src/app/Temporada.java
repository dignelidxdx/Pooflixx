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

    public Capitulo getEpisodioAtPosicion(int pos) {
        return this.capitulos.get(pos);
    }

    /**
     * Obtiene el nro de posicion(no el nro de episodio) de un episodio dentro de la
     * lista
     * 
     * @param nro
     * @return
     */
    public int getEpisodioPosition(int nro) {

        int pos = 0;
        for (Capitulo epi : this.capitulos) {
            if (epi.numero == nro) {
                return pos;
            }
            pos++;
        }
        if (this.capitulos.size() == pos)
            return -1;
        return pos;
    }
	

    
}