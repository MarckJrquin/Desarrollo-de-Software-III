public class Hotel extends Edificio{
    int habitaciones, habitacionesAlquiladas=0;
    double ganancias, itbms;

    Hotel(){
        super();
        habitaciones=100;
    }

    public int mostrarHabitaciones(){
        return habitaciones;
    }

    public int totalHabitacionesUtilizados(){
        return 100-habitaciones;
    }

    public int totalHabitacionesAlquiladas(){
        return habitacionesAlquiladas;
    }

    public double ingresosTotales(){
        return ganancias;
    }

    public boolean hotelAscensor(boolean ascensor){
        this.ascensor = ascensor;
        return this.ascensor;
    }

    public double calcularPrecio(int habitaciones){
        ganancias = ganancias + (habitaciones*150);
        this.habitaciones = this.habitaciones - habitaciones;
        habitacionesAlquiladas = habitacionesAlquiladas + habitaciones;
        return (habitaciones*150);
    }

    public double calcularPrecio(int habitaciones, double itbms){
        this.itbms = (habitaciones*150)*0.07;
        return this.itbms;
    }

    public double ganancias_totales(){
        return ganancias;
    }

}
