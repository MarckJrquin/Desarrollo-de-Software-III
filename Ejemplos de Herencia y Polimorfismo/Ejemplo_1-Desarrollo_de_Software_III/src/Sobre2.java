class A {
    private int i,j;
    public void asignar (int a, int b) {
        i=a;
        j=b;
    }

    public int mostrar_i() {
        return (i);
    }

    public int mostrar_j() {
        return (j);
    }
}

//Creación de la subclase por extensión de la clase
class B extends A {
    private int k;
    public void asignar (int a, int b,int c) {
        asignar (a,b);
        k=c;
    }

    public int mostrar_k() {
        return (k);
    }

    public int sum () {
        return (mostrar_i()+mostrar_j()+k);
    }
}

class Sobre2 {
    public static void main (String arg[]) {
    B obj = new B();
    obj.asignar (7,8,9);
    System.out.print("i="+obj.mostrar_i());
    System.out.println (" Contenido del objeto obj");
    System.out.println ("i y j : " + obj.mostrar_i() + " "+obj.mostrar_j());
    System.out.println ("k : "+obj.mostrar_k());
    System.out.println ("Suma de i,j y k : "+obj.sum());
    }
}