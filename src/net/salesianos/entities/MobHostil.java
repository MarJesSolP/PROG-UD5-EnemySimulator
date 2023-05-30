package net.salesianos.entities;

import net.salesianos.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    protected int fuerza;

    public MobHostil(int salud) {
        super(salud);
        this.fuerza = fuerza;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        this.salud = this.salud - ataque;
        System.out.println("Ha recibido de daño: " + ataque + " y tienes" + salud +  "de salud:  ");
    }

}
