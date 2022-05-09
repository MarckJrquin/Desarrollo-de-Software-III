public class Restaurante extends Edificio{
    int mesas, sillas, sillasAlquiladas;
    double ganancias, itbms;

    Restaurante(){
        super();
        sillas = 30;
    }

    public boolean restauranteAscensor(boolean ascensor){
        this.ascensor = ascensor;
        return this.ascensor;
    }

    public int mostrarSillas(){
        return sillas;
    }

    public int totalSillasAlquiladas(){
        return sillasAlquiladas;
    }

    public double calcularPrecio(int silla){
        ganancias = ganancias + (silla*2.5);
        sillas = sillas - silla;
        sillasAlquiladas = sillasAlquiladas + silla;
        return silla*2.5;
    }

    public double calcularPrecio(int silla, double itbms){
        this.itbms = (silla*2.5)*itbms;
        return this.itbms;
    }

    public double ingresosTotales(){
        return ganancias+itbms;
    }

}
