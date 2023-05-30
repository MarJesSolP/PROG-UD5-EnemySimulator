package net.salesianos.entities;

import net.salesianos.interfaces.Combate;

public class Personaje implements Combate {
    private int salud;
    private int defensa;
    private int fuerza;

    public Personaje(int defensa, int fuerza) {
        this.defensa = defensa;
        this.fuerza = fuerza;
        this.salud = 12;
    }

    public int getSalud() {
        return salud;
    }

    public int getDefensa() {
        return defensa;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public void recibirAtaque(int ataque) {
        int danioRecibio = ataque - this.defensa;
        this. salud = this.salud - danioRecibio;
        System.out.println("El personaje ha recibido de daño: " + danioRecibio + " y tienes " + salud +  " de salud:  ");
    }



}
