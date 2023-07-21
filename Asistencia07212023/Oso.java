import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Oso extends Actor {
    private Etiqueta etiqueta;

    public Oso() {
        // Constructor vacío para el oso, no requiere la etiqueta
    }

    public void act() {
        checkKeyPress();
        isTouchingATree();
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    public void checkKeyPress() {
        if (Greenfoot.isKeyDown("up")) {
            setRotation(270);
            move(5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setRotation(90);
            move(5);
        }
        if (Greenfoot.isKeyDown("left")) {
            setRotation(180);
            move(5);
        }
        if (Greenfoot.isKeyDown("right")) {
            setRotation(0);
            move(5);
        }
    }

    public void isTouchingATree() {
        if (isTouching(Arbol.class)) {
            removeTouching(Arbol.class);
            etiqueta.aumentarPuntaje();
        }
    }
}

