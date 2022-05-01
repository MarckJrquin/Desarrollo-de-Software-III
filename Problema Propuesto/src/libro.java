public class libro extends publicacion{
    private int n_paginas;

    public libro(String titulo, double precio, int n_paginas) {
        super(titulo, precio);
        this.n_paginas = n_paginas;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public String toString(){
        return super.toString()+ "\n - Numero de paginas: "+getN_paginas();
    }

}
