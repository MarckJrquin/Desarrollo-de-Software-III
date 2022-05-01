public class Dado {
    private int numeroCara;

    public Dado(){
        this.numeroCara = 6;
    }

    public Dado(int numeroCara){
        this.numeroCara = numeroCara;
    }

    public int tirarDado(){
        return this.generaNumeroAleatorio(1, numeroCara);
    }

    public int[] tirarDadoNVeces(int n){
        int[] valores = new int[n];
        for(int i=0;i<valores.length;i++){
            valores[i]=tirarDado();
        }
        return valores;
    }

    private int generaNumeroAleatorio(int minimo,int maximo){
        int num = (int)Math.floor(Math.random()*(maximo-minimo+1)+(minimo));
        return num;
    }

}

