// Herencia y sobreescritura
//Enunciado: Existe una clase que permite duplicar un numero
// Aplique herencia para construir una subclase que 
// permita triplicar un numero

class Duplicar {
    protected int n;
    public void asignar (int nf) {
        n=nf;
    }
    public int operacion() {
        return n+n;
    }
}

class Triplicar extends Duplicar {
    public int operacion() {
        return super.operacion()+n;
    }
}

class Duplica_triplica {
    public static void main (String arg[]) {
        Triplicar objeto = new Triplicar();
        objeto.asignar(3);
        System.out.print ("\n\nEl valor triplicado es "+objeto.operacion());
    }
}