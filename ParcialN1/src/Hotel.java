public class Hotel extends Edificio{
    int habitaciones, habitacionesAlquiladas;
    double ganancias, itbms;

    Hotel(){
        super();
        habitaciones=100;
    }

    public boolean hotelAscensor(boolean ascensor){
        this.ascensor = ascensor;
        return this.ascensor;
    }

    public int mostrarHabitaciones(){
        return habitaciones;
    }

    public int totalHabitacionesAlquiladas(){
        return habitacionesAlquiladas;
    }

    public double calcularPrecio(int habitaciones){
        ganancias = ganancias + (habitaciones*150);
        this.habitaciones = this.habitaciones - habitaciones;
        habitacionesAlquiladas = habitacionesAlquiladas + habitaciones;
        return (habitaciones*150);
    }

    public double calcularPrecio(int habitaciones, double itbms){
        this.itbms = (habitaciones*150)*itbms;
        return this.itbms;
    }

    public double ingresosTotales(){
        return ganancias+itbms;
    }

}
