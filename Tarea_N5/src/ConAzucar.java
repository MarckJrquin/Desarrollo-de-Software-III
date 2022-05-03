public class ConAzucar extends SinAzucar{
    private int cucharadas;

    ConAzucar(){
        super();
        cucharadas=80;
    }

    public int mostrarCucharadas(){
        return cucharadas;
    }

    public int total_cucharadas_utilizados(){
        return 80-cucharadas;
    }

    public double calcularPrecio(int ventaVasos, int cucharadas){
        return ventaVasos*0.5*cucharadas;
    }


}
