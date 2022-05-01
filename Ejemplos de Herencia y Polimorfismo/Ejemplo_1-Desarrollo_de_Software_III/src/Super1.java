/* clase base */
class Vehicle {
    int maxSpeed = 180;
}

/* subclase */
class Car extends Vehicle {
    int maxSpeed = 160;
    int display () {
        int vm= super.maxSpeed;
        return vm;
    }
}

/* Programa de controlador Test */
class Super1 {
    public static void main(String[] args) {
        Car small = new Car();
        System.out.println("Velocidad máxima: " + small.display());
    }
}