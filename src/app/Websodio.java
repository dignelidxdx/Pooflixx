package app;

public class Websodio extends Capitulo {

    public String url;

    @Override 
    // Redefinicion
    public void reproducir(){
        System.out.println("Reproduciendo websodio " + this.nombre + this.url);
    }

}