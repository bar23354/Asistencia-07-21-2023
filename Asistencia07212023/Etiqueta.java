import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Etiqueta extends Actor {
    private String texto;
    private int tamañoFuente;
    private Color colorTexto;
    private int puntaje;

    public Etiqueta(String texto, int tamañoFuente, Color colorTexto) {
        this.texto = texto;
        this.tamañoFuente = tamañoFuente;
        this.colorTexto = colorTexto;
        this.puntaje = 0; // Inicializamos el puntaje en cero
        actualizarImagen();
    }

    public void act() {
        // No necesitas ningún comportamiento específico en este actor.
    }

    public void aumentarPuntaje() {
        puntaje++;
        actualizarImagen();
    }

    public void actualizarImagen() {
        GreenfootImage imagen = new GreenfootImage(texto + puntaje, tamañoFuente, colorTexto, null);
        setImage(imagen);
    }
}

