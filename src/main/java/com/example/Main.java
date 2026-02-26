package main.java.com.example;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product("P001", "Laptop", 1200.0, 50);
        Product p2 = new Product("P002", "Celular", 800.0, 30);

        p1.setPrecio(1100.0);
        p2.setCantidad(25);

        System.out.println("Producto 1 - Nombre: " + p1.getNombre() + ", Precio: " + p1.getPrecio());
        System.out.println("Producto 2 - Nombre: " + p2.getNombre() + ", Cantidad: " + p2.getCantidad());

        System.out.println(p1);
        System.out.println(p2);
    }
}
