package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Temporada
 */
public class Temporada {

    
    public List<Capitulo> capitulos = new ArrayList<>();
    public List<Serie> series1 = new ArrayList<>();

    public Temporada(int numero, String name){
        this.numero = numero;
        this.name = name;
    }
    public Temporada(int numero){
        this.numero = numero;
    }

    private int numero;
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    private int cantSeries;
    public int getCantSeries(){
        return cantSeries;
    }
    public void setCantSeries(int cantSeries){
        this.cantSeries = cantSeries;
    }



    public Capitulo getEpisodio(int nro) {
        for (Capitulo c : this.capitulos) {
			if (c.getNumero() == nro)
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
            if (epi.getNumero() == nro) {
                return pos;
            }
            pos++;
        }
        if (this.capitulos.size() == pos)
            return -1;
        return pos;
    }
	

    
}