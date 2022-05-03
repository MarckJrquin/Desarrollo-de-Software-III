public class SinAzucar {
    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    private int vasos;

    SinAzucar(){
        vasos=100;
    }

    public int mostrarVasos(){
        return vasos;
    }

    public int total_vasos_utilizados(){
        return 100-vasos;
    }

    public double calcularPrecio(int ventaVasos){
        vasos = vasos - ventaVasos;
        return ventaVasos*0.45;
    }

}
