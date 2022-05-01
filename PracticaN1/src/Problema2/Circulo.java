package Problema2;

public class Circulo {
    protected double Radio;

    public Circulo(double Radio) {
        this.Radio = Radio;
    }

    public double calcularArea() {
        return (Radio * Radio * 3.14159);
    }
}
