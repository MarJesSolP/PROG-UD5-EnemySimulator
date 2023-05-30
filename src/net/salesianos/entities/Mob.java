package net.salesianos.entities;

public abstract class Mob {
    protected int salud;

    public Mob(int salud) {
        this.salud = salud;
    }

    protected abstract void moverse();

}
