public class Dado {
    private int numeroCara;

    public Dado(){
        this.numeroCara = 6;
    }

    public int tirarDado(){
        return this.generaNumeroAleatorio(1, numeroCara);
    }

    private int generaNumeroAleatorio(int minimo,int maximo){
        int num = (int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }

}

