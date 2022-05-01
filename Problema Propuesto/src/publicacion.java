public class publicacion {
    private String titulo;
    private double precio;

    public publicacion(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getPrecio() {
        return precio;
    }


    public String toString(){
        return  " - Titulo: "+getTitulo() + "\n - precio: "+getPrecio();
    }

}
