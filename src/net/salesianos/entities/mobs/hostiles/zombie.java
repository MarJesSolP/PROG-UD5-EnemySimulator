package net.salesianos.entities.mobs.hostiles;

import net.salesianos.entities.mobs.MobHostil;

public class zombie extends MobHostil {

    public zombie(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public void moverse() {
        System.out.println("Se mueve hacia el personaje");

    }
}
