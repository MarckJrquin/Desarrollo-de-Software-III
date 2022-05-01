package Problema2;

public class SectorCircular extends Circulo {
    private double Angulo;

    public SectorCircular(double Radio, double Angulo) {
        super(Radio);
        this.Angulo = Angulo;
    }

    public double calcularArea() {
        return ( ((Angulo * super.calcularArea()) / 360) );
    }

}
