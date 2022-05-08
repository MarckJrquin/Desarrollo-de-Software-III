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
                    case 1:
                        registroJugador();
                        break;
                    case 2:
                        jugadoresRegistrados();
                        break;
                    case 3:
                        partidaDados();
                        break;
                    case 4:
                        rankingJugadores();
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println(" -- Solo números entre 1 y 4 --\n\n");
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
        Dado jugador = new Dado(username);
        Lista_Jugadores.add(jugador);
    }

    static void jugadoresRegistrados(){
        System.out.println("\n[ -  Usuarios Registrados  ----------------------- ]");
        for(int i = 0; i < Lista_Jugadores.size(); i++) {
            System.out.println("[ ]  " + Lista_Jugadores.get(i).getUsername());
        }
    }

    static void partidaDados(){
        Scanner sn = new Scanner(System.in);
        int rondas;
        System.out.println("\n[ -  Partida de Juego  --------------------------- ]");
        try{
            System.out.print("  -  Ingrese la cantidad de rondas (Max 10): "); rondas = sn.nextInt();
            System.out.println();
            if(rondas>0 && rondas<=10){
                for (int i=0; i<rondas; i++){
                    System.out.println("[ ] Ronda N°"+(i+1));
                    for(int j=0; j < Lista_Jugadores.size(); j++){
                        System.out.println(" -  Usuario: " +Lista_Jugadores.get(j).getUsername()+"  |  puntos: "+Lista_Jugadores.get(j).tirarDado());
                    }
                }
                rankingJugadores();
            }else{
                System.out.println(" -- Debes insertar un número entre 1 y 10 --\n\n");
            }
        }catch (InputMismatchException e){
            System.out.println(" -- Debes insertar un número --\n\n");
            sn.next();
        }
    }

    static void rankingJugadores(){
        Collections.sort(Lista_Jugadores);
        System.out.println("\n[ ] Ranking de Puntos");
        for(Dado aux: Lista_Jugadores){
            System.out.println(aux);
        }
    }

}
