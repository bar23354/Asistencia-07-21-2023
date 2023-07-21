import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

public class MyWorld extends World
{
    private Etiqueta etiqueta;

    public MyWorld()
    {    
        super(600, 400, 1);

        Oso oso = new Oso(); // Creamos una instancia del oso
        addObject(oso, 100, 100);

        Random random = new Random();

        for (int i = 0; i < 5; i++){
            int randomPosicionX = random.nextInt(600 - 1) + 1;
            int randomPosicionY = random.nextInt(400 - 1) + 1;
            addObject(new Arbol(), randomPosicionX, randomPosicionY);
        }

        etiqueta = new Etiqueta("Puntaje: ", 24, Color.BLACK);
        addObject(etiqueta, getWidth() / 2, 30);

        oso.setEtiqueta(etiqueta); // Pasamos la etiqueta al oso después de crearlo
    }
}


