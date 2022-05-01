public class cd extends libro{
    private int t_reproduccion;

    public cd(String titulo, double precio, int n_paginas, int t_reproduccion) {
        super(titulo, precio, n_paginas);
        this.t_reproduccion = t_reproduccion;
    }

    public int getT_reproduccion() {
        return t_reproduccion;
    }

    public String toString(){
        return  super.toString() + "\n - Tiempo de reproduccion: "+getT_reproduccion();
    }

}
