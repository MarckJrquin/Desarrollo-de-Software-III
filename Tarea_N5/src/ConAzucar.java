public class ConAzucar extends SinAzucar{
    protected int cucharadas, vasos_cav=0;

    ConAzucar(){
        cucharadas=80;
    }

    public int mostrarCucharadas(){
        return cucharadas;
    }

    public int total_cucharadas_utilizados(){
        return 80-cucharadas;
    }

    public int total_Vasos_ConAzucar_vendidos(){
        return vasos_cav;
    }

    public double ganancias_totales(){
        return ganancias;
    }

    public double calcularPrecio(int ventaVasos, int ventaCucharadas){
        ganancias = ganancias + (ventaVasos*0.50);
        vasos = vasos - ventaVasos;
        vasos_cav = vasos_cav + ventaVasos;
        cucharadas = cucharadas - (ventaVasos*ventaCucharadas);
        return ventaVasos*0.5;
    }

}
