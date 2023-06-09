import net.salesianos.entities.Personaje;
import net.salesianos.entities.mobs.hostiles.enderman;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido...");
        System.out.println("Seleccione el tipo de arma");
        System.out.println("Opcion 1: Ninguna ");
        System.out.println("Opcion 2: Espada de madera");
        System.out.println("Opcion 3: Espada de hierro ");
        System.out.println("Opcion 4: Espada de diamante ");
        Scanner teclado = new Scanner(System.in);
        int opcion;
        int fuerzaElegida = -1;
        int armaduraElegida= -1;
        int turnos = 0;
        opcion = teclado.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Has elegido ir sin arma");
                fuerzaElegida = 1;
                break;
            case 2:
                System.out.println("Has elegido la espada de madera");
                fuerzaElegida = 2;
                break;
            case 3:
                System.out.println("Has elegido espada de hierro");
                fuerzaElegida = 3;
                break;
            case 4:
                System.out.println("Has elegido espada de diamante");
                fuerzaElegida = 5;
                break;
            default:
                System.out.println("Debe introducir una valor válido");
                break;

        }
        System.out.println("Seleccione una armadura \n" +
                "opcion 1: Ninguna  \n" +
                "opcion 2: De cuero   \n" +
                "opcion 3: De hierro  \n" +
                "opcion 4: De diamante ");

        opcion = teclado.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Has elegido ir sin armadura");
                armaduraElegida = 0;
                break;
            case 2:
                System.out.println("Has elegido ir con armadura de cuero");
                armaduraElegida = 1;
                break;
            case 3:
                System.out.println("Has elegido ir con armadura de hierro");
                armaduraElegida = 2;
                break;
            case 4:
                System.out.println("Has elegido ir con armadura de diamante");
                armaduraElegida = 3;
                break;
            default:
                System.out.println("Debe introducir una valor válido");
                break;

        }
        Personaje personajillo = new Personaje(armaduraElegida,fuerzaElegida);
        enderman enderman1 = new enderman(14,6);
        Random random1 = new Random();
        int accionEnemigo;

        while (personajillo.getSalud() > 0 && enderman1.getSalud() > 0){
            enderman1.recibirAtaque(personajillo.atacar());
            accionEnemigo = random1.nextInt(2);
            if(accionEnemigo == 0){
                personajillo.recibirAtaque(enderman1.atacar());
            }else{
                enderman1.moverse();
            }
            turnos++;
        }
        System.out.println("Han pasado " + turnos + " turnos");
        if (personajillo.getSalud() == 0){
            System.out.println(" Ha ganado el enderman ");
        }else{
            System.out.println(" Has ganado ");
        }
    }
}