public class Restaurante extends Edificio{
    int sillas, sillasAlquiladas;
    double ganancias, itbms;

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

    public boolean restauranteAscensor(boolean ascensor){
        this.ascensor = ascensor;
        return this.ascensor;
    }

    public double calcularPrecio(int silla){
        ganancias = ganancias + (silla*2.5);
        sillas = sillas - silla;
        sillasAlquiladas = sillasAlquiladas + silla;
        return silla*2.5;
    }

    public double calcularPrecio(int silla, double itbms){
        this.itbms = (silla*2.5)*0.07;
        return this.itbms;
    }

    public double ganancias_totales(){
        return ganancias;
    }

}
