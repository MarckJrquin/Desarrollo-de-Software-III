public class Hotel extends Edificio{
    int habitaciones, habitacionesAlquiladas=0;
    double ganancias;

    Hotel(){
        super();
        habitaciones=100;
    }

    public int mostrarHabitaciones(){
        return habitaciones;
    }

    public int totalHabitacionesUtilizados(){
        return 80-habitaciones;
    }

    public int totalHabitacionesAlquiladas(){
        return habitacionesAlquiladas;
    }

    public double ingresosTotales(){
        return ganancias;
    }

    public double calcularPrecio(int habitaciones){
        ganancias = ganancias + (habitaciones*150);
        this.habitaciones = this.habitaciones - habitaciones;
        habitacionesAlquiladas = habitacionesAlquiladas + habitaciones;
        return habitaciones*150;
    }

}
