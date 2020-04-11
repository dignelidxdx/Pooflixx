package app;

/**
 * Capitulo
 */
public class Capitulo {

 

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

    private String nombre;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private int numero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    int duracion;

    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    

    public void reproducir(){
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }
}
