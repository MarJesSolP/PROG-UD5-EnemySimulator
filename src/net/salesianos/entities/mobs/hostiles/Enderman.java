package net.salesianos.entities.mobs.hostiles;

import net.salesianos.entities.mobs.MobHostil;

public class Enderman extends MobHostil {

    public Enderman(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    protected void moverse() {
        System.out.println("Se teletrasporta detrás");
    }
}
