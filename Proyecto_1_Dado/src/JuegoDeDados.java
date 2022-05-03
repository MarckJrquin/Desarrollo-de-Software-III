import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class JuegoDeDados {

    public static ArrayList<Dado> Lista_Jugadores = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Opcion del usuario

        while (!salir) {
            System.out.println("\n[ Proyecto N°1 --------------------------------------- ]");
            System.out.println("[ Proyecto de Herencia y Polimorfismo - Juego de Dados ]\n");
            System.out.println("[1] Registrar jugador");
            System.out.println("[2] Lista de jugadores");
            System.out.println("[3] Partida");
            System.out.println("[4] Salir");
            System.out.print(" -  Escribe una de las opciones: ");
            opcion = sn.nextInt(); sn.nextLine();

            switch (opcion) {
                case 1:
                    String username;
                    System.out.println("\n[ -  Resgistro de Usuario  ----------------------- ]");
                    System.out.println("Registro de usuario");
                    System.out.print("[ ] username: "); username = sn.nextLine();
                    Dado jugador = new Dado(username);
                    Lista_Jugadores.add(jugador);
                    break;
                case 2:
                    System.out.println("\n[ -  Usuarios Registrados  ----------------------- ]");
                    System.out.println("[ ] Usuarios Registrados");
                    for(int i = 0; i < Lista_Jugadores.size(); i++) {
                        System.out.println(Lista_Jugadores.get(i).getUsername());
                    }
                    break;
                case 3:
                    int rondas;
                    System.out.println("\n[ -  Partida de Juego  --------------------------- ]");
                    System.out.print("[ ] Ingrese la cantidad de rondas: "); rondas = sn.nextInt();

                    for (int i=0; i<rondas; i++){
                        System.out.println("[ ] Ronda N°"+(i+1));
                        for(int j=0; j < Lista_Jugadores.size(); j++){
                            System.out.println(" -  Usuario: "+Lista_Jugadores.get(j).getUsername()+" puntos: "+Lista_Jugadores.get(j).tirarDado());
                        }
                    }

                    Collections.sort(Lista_Jugadores);
                    System.out.println("\n[ ] Ranking de Puntos");
                    for(Dado aux: Lista_Jugadores){
                        System.out.println(aux);
                    }

                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println(" -- Solo números entre 1 y 4 --\n\n");
            }
        }
    }
}
