public class Restaurante extends Edificio{
    int sillas, sillasAlquiladas;
    double ganancias;

    Restaurante(){
        super();
        sillas = 30;
    }

    public int mostrarSillas(){
        return sillas;
    }

    public int totalSillasUtilizados(){
        return 80-sillas;
    }

    public int totalSillasAlquiladas(){
        return sillasAlquiladas;
    }


    public double calcularPrecio(int sillas){
        ganancias = ganancias + (sillas*2.5);
        this.sillas = this.sillas - sillas;
        sillasAlquiladas = sillasAlquiladas + sillas;
        return sillas*2.5;
    }

}
