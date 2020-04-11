package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Film {


    public Serie(String titulo, int duracion) {
        super(titulo, duracion);
        // TODO Auto-generated constructor stub
    }

    private int numero;
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    

    
    public List<Temporada> temporadas = new ArrayList<>();

    public Temporada getTemporada(int numero) {

        for (Temporada tempo : this.temporadas) {
			if (tempo.getNumero() == numero) {
                return tempo;
            }
				
		}
        return null;
    }

    
}
	
