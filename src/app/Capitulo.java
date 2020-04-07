package app;

/**
 * Capitulo
 */
public class Capitulo {

    public String nombre;
    public int numero;
    public int duracion;


    public Capitulo() {
        this.duracion = 40;
    }

    public Capitulo(int numero, String nombre, int duracion) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Capitulo(int numero, String nombre) {
        this();
        this.numero = numero;
        this.nombre = nombre;
    }

    
    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }
}
