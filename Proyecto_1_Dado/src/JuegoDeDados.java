import java.util.InputMismatchException;
import java.util.Scanner;

public class JuegoDeDados {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario
        while (!salir) {
            System.out.println("[ Proyecto N°1 --------------------------------------- ]");
            System.out.println("[ Proyecto de Herencia y Polimorfismo - Juego de Dados ]\n");
            System.out.println("[1] Agregar jugador");
            System.out.println("[2] Lista de jugadores");
            System.out.println("[3] Partida");
            System.out.println("[4] Salir");
            System.out.print(" -  Escribe una de las opciones: ");
            opcion = sn.nextInt();

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println(" -- Solo números entre 1 y 4 --\n\n");
            }
        }

        /*Dado dado = new Dado();

        System.out.println("[ Proyecto N°1 --------------------------------------- ]");
        System.out.println("[ Proyecto de Herencia y Polimorfismo - Juego de Dados ]\n");

        int puntosJ1=0;
        int puntosJ2=0;
        int aux1=0;
        int aux2=0;

        for(int i = 0; i < (2*2); i++){
            if(i%2==0){
                aux1=puntosJ1;
                puntosJ1 += dado.tirarDado();
                System.out.println("[ ] Lazamiento del jugador 1: "+(puntosJ1-aux1));
            }else{
                aux2=puntosJ2;
                puntosJ2 += dado.tirarDado();
                System.out.println("[ ] Lazamiento del jugador 2: "+(puntosJ2-aux2));
            }
        }

        System.out.println("\n - Puntos de Jugador 1: "+puntosJ1);
        System.out.println(" - Puntos de Jugador 2: "+puntosJ2);

        if(puntosJ1 == puntosJ2){
            System.out.println("\nEmpate!");
        }else if(puntosJ1 > puntosJ2){
            System.out.println("\nGanador: Jugador 1");
        }else{
            System.out.println("\nGanador: Jugador 2");
        }*/
    }
}
