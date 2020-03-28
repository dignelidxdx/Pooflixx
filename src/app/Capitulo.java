package app;

/**
 * Capitulo
 */
public class Capitulo {

    public String nombre;
    public int numero;
    public Temporada temporada;
    public int duracion;
    
    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }
}
