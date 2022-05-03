import java.util.ArrayList;

public class Dado extends Jugador{

    private int numeroCara, valor;

    public Dado(String username){
        super(username);
        this.numeroCara = 6;
    }

    public Dado(String username, int numeroCara){
        super(username);
        this.numeroCara = numeroCara;
    }

    public int tirarDado(){
        return this.generaNumeroAleatorio(1, numeroCara);
    }

    private int generaNumeroAleatorio(int minimo,int maximo){
        int num = (int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }

    public String toString(){
        return "Lanzamiento del " + super.toString() + ": "+tirarDado();
    }

}

