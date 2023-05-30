package net.salesianos.entities.mobs.hostiles;

import net.salesianos.entities.mobs.MobHostil;

public class enderman extends MobHostil {

    public enderman(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public void moverse() {
        System.out.println("Se teletrasporta detrás");
    }
}
