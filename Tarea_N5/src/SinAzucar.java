public class SinAzucar {
    protected int vasos, vasos_sav=0;
    protected double ganancias;

    SinAzucar(){
        vasos=100;
    }

    public int mostrarVasos(){
        return vasos;
    }

    public int total_vasos_utilizados(){
        return 100-vasos;
    }

    public int total_Vasos_SinAzucar_vendidos(){
        return vasos_sav;
    }

    public double calcularPrecio(int ventaVasos){
        ganancias = ganancias + (ventaVasos*0.45);
        vasos = vasos - ventaVasos;
        vasos_sav = vasos_sav + ventaVasos;
        return ventaVasos*0.45;
    }

}
