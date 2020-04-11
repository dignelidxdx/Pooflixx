package app;

public class Websodio extends Capitulo {

    public String url;

    public Websodio(int numero, String nombre){
        super(numero,nombre);
        this.url = "http://movies.com";
    }

    @Override 
    // Redefinicion
    public void reproducir(){
        System.out.println("Reproduciendo websodio " + this.getNombre() + this.url);
    }

     /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }
}