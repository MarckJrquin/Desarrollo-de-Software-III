public class JuegoDeDados {
    public static void main(String[] args) {

        Dado dado = new Dado();

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
        }
    }
}
