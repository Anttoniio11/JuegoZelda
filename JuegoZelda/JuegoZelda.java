
package JuegoZelda;

import java.util.Scanner;

public class JuegoZelda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int dadoEmpezarJ1, dadoEmpezarJ2, dado20j1, dado20j2, dadoEspecial;
        
        
        System.out.println("Jugador 1 elige un personaje: (1:Link, 2:Princesa Zelda, 3:Ganondorf, 4:Skull Kid, 5:Sheik):");
        int seleccionJugador1 = sc.nextInt();

        System.out.println("Jugador 2 elige un personaje: (1:Link, 2:Princesa Zelda, 3:Ganondorf, 4:Skull Kid, 5:Sheik):");
        int seleccionJugador2 = sc.nextInt();

        //(String nombre, int salud, int ataque)
        Personaje jugador1;
        Personaje jugador2;

        switch (seleccionJugador1) {
            case 1:
                jugador1 = new Link("J1 Link");
                break;
            case 2:
                jugador1 = new PrincesaZelda("J1 PrincesaZelda");
                break;
            case 3:
                jugador1 = new Ganondorf("J1 Ganondorf");
                break;
            case 4:
                jugador1 = new SkullKid("J1 SkullKid");
                break;
            case 5:
                jugador1 = new Sheik("J1 Sheik");
                break;
            default:
                System.out.println("Seleccione un personaje correcto");
                return;
        }

        switch (seleccionJugador2) {
            case 1:
                jugador2 = new Link("J2 Link");
                break;
            case 2:
                jugador2 = new PrincesaZelda("J2 PrincesaZelda");
                break;
            case 3:
                jugador2 = new Ganondorf("J2 Ganondorf");
                break;
            case 4:
                jugador2 = new SkullKid("J2 SkullKid");
                break;
            case 5:
                jugador2 = new Sheik("J2 Sheik");
                break;
            default:
                System.out.println("Seleccione un personaje correcto");
                return;
        }

        System.out.println(" -----K.O----- ");
        
        dadoEmpezarJ1 = (int) (Math.random() * (6 - 1+1));
        dadoEmpezarJ2 = (int) (Math.random() * (6 - 1+1));
        System.out.println("Dado Jugador 1: " + dadoEmpezarJ1);
        System.out.println("Dado Jugador 2: " + dadoEmpezarJ2);
        System.out.println(" ");

        while (jugador1.salud > 0 && jugador2.salud > 0) {
   
            //if(dadoEmpezarJ1 > dadoEmpezarJ2){
                
            System.out.println("Turno de " + jugador1.nombre);
            
            dado20j1 = (int) (Math.random() * (20 - 1+1));
            System.out.println("El dado del jugador 1 tiene un valor de: " + dado20j1);
            
            if(dado20j1 < 10){
                jugador1.atacar(jugador2);
            }else if(dado20j1 > 10 && dado20j1 < 16){
                jugador1.usarHabilidad(jugador2);
            }else if(dado20j1 > 15){
                jugador1.usarHabilidadEspecial(jugador2);
            }
            System.out.println(" ");
            
            //}else{
            
            System.out.println("Turno de " + jugador2.nombre);
            
            dado20j2 = (int) (Math.random() * (20 - 1+1));
            System.out.println("El dado del jugador 2 tiene un valor de: " + dado20j2);
            
            if(dado20j2 < 10){
                jugador2.atacar(jugador1);
            }else if(dado20j2 > 10 && dado20j2 < 16){
                jugador2.usarHabilidad(jugador1);
            }else if(dado20j2 > 15){
                jugador2.usarHabilidadEspecial(jugador1);
            }
            System.out.println(" ");
            //}
            System.out.println("Salud de " + jugador1.nombre + ": " + jugador1.salud);
            System.out.println("Salud de " + jugador2.nombre + ": " + jugador2.salud);
            System.out.println(" ");
            
        }
        
        //dadoEspecial = (int) (Math.random() * (200 - 1+1));
            //Laberinto del tiempo - vuelven a empezar 
            //Alianza de enemigos pasados - se acaba el juego
            //Despertar del dragon - se acaba el juego
            //La profesia rota - muere link
            //Diosas utilizan la trifuerza - +200vida para los jugadores
            //Destruccion de Hyrule - se acaba el juego
            //Shigeru Miyamoto y Takashi Tezuka deciden acabar su juego
            //Nintendo decide ....
            //Skull kid logra hacer caer la luna sobre la tierra y la destruye - Se acaba el juego

         if (jugador1.salud <= 0) {
                System.out.println(jugador2.nombre + " gana la partida.");
            } else {
                System.out.println(jugador1.nombre + " gana la partida.");
            }

    }
}
