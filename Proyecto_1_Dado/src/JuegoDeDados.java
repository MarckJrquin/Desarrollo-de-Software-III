import java.util.*;

public class JuegoDeDados {

    public static ArrayList<Dado> Lista_Jugadores = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        while (!salir) {
            System.out.println("\n[ Proyecto N°1 --------------------------------------- ]");
            System.out.println("[ Proyecto de Herencia y Polimorfismo - Juego de Dados ]\n");
            System.out.println("[1] Registrar jugador");
            System.out.println("[2] Lista de jugadores");
            System.out.println("[3] Partida");
            System.out.println("[4] Ranking de jugadores");
            System.out.println("[5] Salir");
            try{
                System.out.print(" -  Escribe una de las opciones: ");
                opcion = sn.nextInt(); sn.nextLine();
                switch (opcion) {
                    case 1 -> registroJugador();
                    case 2 -> jugadoresRegistrados();
                    case 3 -> partidaDados();
                    case 4 -> rankingJugadores();
                    case 5 -> salir = true;
                    default -> System.out.println(" -- Solo números entre 1 y 4 --\n\n");
                }
            }catch (InputMismatchException e){
                System.out.println(" -- Debes insertar un número --\n\n");
                sn.next();
            }
        }
    }


    static void registroJugador(){
        Scanner sn = new Scanner(System.in);
        String username;
        System.out.println("\n[ -  Resgistro de Usuario  ----------------------- ]");
        System.out.print("  -  Ingrese su username: "); username = sn.nextLine();
        Jugador jugador = new Dado(username);
        Lista_Jugadores.add((Dado) jugador);
        System.out.println();
    }


    static void jugadoresRegistrados(){
        System.out.println("\n[ -  Usuarios Registrados  ----------------------- ]");

        if(Lista_Jugadores.size()==0){
            System.out.println("  -- No hay usuarios registrado --");
        }

        for(int i = 0; i < Lista_Jugadores.size(); i++) {
            System.out.println("[ ]  " + Lista_Jugadores.get(i).getUsername());
        }
        System.out.println();
    }


    static void partidaDados(){
        Scanner sn = new Scanner(System.in);
        int rondas, caraDados;

        if(Lista_Jugadores.size()==0){
            System.out.println(" -- Deben haber jugadores para empezar la partida --");
        } else if (Lista_Jugadores.size()==1) {
            System.out.println(" -- Debe haber un jugador mas para empezar la partida --");
        }else {
            System.out.println("\n[ -  Partida de Juego  --------------------------- ]");
            try{
                System.out.print("  -  Ingrese la cantidad de rondas (Max 10): "); rondas = sn.nextInt();
                if(rondas>0 && rondas<=10){
                    try{
                        System.out.print("  -  Ingrese la cantidad de caras del dado (Min:4 - Max:20): "); caraDados = sn.nextInt();
                        if(caraDados>=4 && caraDados<=20){
                            if(caraDados==6){
                                for (int k=0; k<Lista_Jugadores.size();k++){
                                    Lista_Jugadores.get(k).reseteoPuntosTotales(true);
                                }
                                for (int i=0; i<rondas; i++){
                                    System.out.println("[ ] Ronda N°"+(i+1));
                                    for(int j=0; j < Lista_Jugadores.size(); j++){
                                        System.out.println(" -  Usuario: " +Lista_Jugadores.get(j).getUsername()+"  |  puntos: "+Lista_Jugadores.get(j).tirarDado());
                                    }
                                }
                            }else {
                                for (int k=0; k<Lista_Jugadores.size();k++){
                                    Lista_Jugadores.get(k).reseteoPuntosTotales(true);
                                }
                                for (int i=0; i<rondas; i++){
                                    System.out.println("[ ] Ronda N°"+(i+1));
                                    for(int j=0; j < Lista_Jugadores.size(); j++){
                                        System.out.println(" -  Usuario: " +Lista_Jugadores.get(j).getUsername()+"  |  puntos: "+Lista_Jugadores.get(j).tirarDado(caraDados));
                                    }
                                }
                            }
                            rankingJugadores();
                        }else {
                            System.out.println("  -- Debes insertar un número entre 4 y 20 --\n\n");
                        }
                    }catch (InputMismatchException e){
                        System.out.println("  -- Debes insertar un número --\n\n"); sn.next();
                    }
                }else{
                    System.out.println("  -- Debes insertar un número entre 1 y 10 --\n\n");
                }
            }catch (InputMismatchException e){
                System.out.println("  -- Debes insertar un número --\n\n"); sn.next();
            }
        }
        System.out.println();
    }


    static void rankingJugadores(){
        Collections.sort(Lista_Jugadores);
        System.out.println("\n[ ] Ranking de Puntos");
        for(Dado aux: Lista_Jugadores){
            System.out.println(aux);
        }

        if(Lista_Jugadores.size()==0) {
            System.out.println(" -  Aun no hay datos :c");

        }else if ((Lista_Jugadores.size()>=3) && ((Lista_Jugadores.get(0).puntosTotales() == Lista_Jugadores.get(1).puntosTotales()) && (Lista_Jugadores.get(1).puntosTotales() == Lista_Jugadores.get(2).puntosTotales())) && (Lista_Jugadores.get(0).puntosTotales()!=0)) {
            System.out.println("\n -  Los jugadores "+Lista_Jugadores.get(0).getUsername()+" y "+Lista_Jugadores.get(1).getUsername()+" y "+Lista_Jugadores.get(2).getUsername()+" han empatado!");

        }else if ((Lista_Jugadores.size()>=2) && (Lista_Jugadores.get(0).puntosTotales() == Lista_Jugadores.get(1).puntosTotales()) && (Lista_Jugadores.get(0).puntosTotales()!=0)) {
            System.out.println("\n -  Los jugadores "+Lista_Jugadores.get(0).getUsername()+" y "+Lista_Jugadores.get(1).getUsername()+" han empatado!");

        }else if ((Lista_Jugadores.get(0).puntosTotales()!=0)) {
            System.out.println("\n -  El ganador es el jugador "+Lista_Jugadores.get(0).getUsername()+"!");

        }else{
            System.out.println();
        }
        System.out.println();
    }
}
