package net.salesianos.entities.mobs;

import net.salesianos.entities.mobs.Mob;
import net.salesianos.interfaces.danio;

public class MobPacifico extends Mob implements danio {

    public MobPacifico(int salud) {
        super(salud);
    }

    @Override
    protected void moverse() {

    }

    @Override
    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
    }
}
