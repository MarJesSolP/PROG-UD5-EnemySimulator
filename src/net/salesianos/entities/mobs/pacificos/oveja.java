package net.salesianos.entities.mobs.pacificos;

import net.salesianos.entities.mobs.Mob;
import net.salesianos.entities.mobs.MobPacifico;

public class oveja extends MobPacifico {

    public oveja(int salud) {
        super(salud);
    }
    @Override
    public void moverse() {
        System.out.println("Se mueve por el campo");
    }

}
