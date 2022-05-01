public class JuegoDeDados {
    public static void main(String[] args) {

        Dado dado = new Dado();

        int puntosJ1=0;
        int puntosJ2=0;

        for(int i = 0; i < (2*2); i++){
            if(i%2==0){
                puntosJ1 += dado.tirarDado();
                System.out.println("Lazamiento del jugador 1: "+puntosJ1);
            }else{
                puntosJ2 += dado.tirarDado();
                System.out.println("Lazamiento del jugador 2: "+puntosJ2);
            }
        }

        System.out.println("Puntos de Jugador 1: "+puntosJ1);
        System.out.println("Puntos de Jugador 2: "+puntosJ2);

        if(puntosJ1 == puntosJ2){
            System.out.println("Empate");
        }else if(puntosJ1 > puntosJ2){
            System.out.println("Jugador 1 Gana");
        }else{
            System.out.println("Jugador 2 Gana");
        }

    }
}
