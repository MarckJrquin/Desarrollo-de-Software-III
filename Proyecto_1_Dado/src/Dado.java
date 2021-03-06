import java.util.ArrayList;

public class Dado extends Jugador implements Comparable<Dado>{

    private int numeroCara, puntos, puntostot=0;

    public Dado(String username){
        super(username);
        this.numeroCara = 6;
    }

    public int tirarDado(){
        puntos = generaNumeroAleatorio(1, numeroCara);
        puntostot = puntostot + puntos;
        return puntos;
    }

    public int tirarDado(int numeroCara){
        puntos = generaNumeroAleatorio(1, numeroCara);
        puntostot = puntostot + puntos;
        return puntos;
    }

    public int puntosTotales(){
        return puntostot;
    }

    public void reseteoPuntosTotales(boolean reset){
        if(reset){
            puntostot=0;
        }
    }

    private int generaNumeroAleatorio(int minimo,int maximo){
        int num = (int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }

    public String toString(){
        return " -  Usuario: " + getUsername() + "  |  puntos: "+puntostot;
    }

    @Override
    public int compareTo(Dado o) {
        if(o.puntosTotales()>puntostot){
            return 1;
        }else if(o.puntosTotales()==puntostot){
            return 0;
        }else{
            return -1;
        }
    }
}

