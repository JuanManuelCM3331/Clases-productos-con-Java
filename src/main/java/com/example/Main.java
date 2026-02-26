package main.java.com.example;

public class Main {
    public static void main(String[] args) {
        producto p1 = new producto("p001", "laptop", 1200.0, 50);
        producto p2 = new producto("p002", "celular", 800.0, 30);

        p1.setprecio(1100.0);
        p2.setcantidad(25);

        System.out.println("producto 1 - nombre: " + p1.getnombre() + ", precio: " + p1.getprecio());
        System.out.println("producto 2 - nombre: " + p2.getnombre() + ", cantidad: " + p2.getcantidad());

        System.out.println(p1);
        System.out.println(p2);
    }
}
