package main.java.com.example;

public class Product {

    private String id;
    private String nombre;
    private double precio;
    private int cantidad;

    public Product(String id, String nombre, double precio, int cantidad) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getid() {
        return id;
    }

    public String getnombre() {
        return nombre;
    }

    public double getprecio() {
        return precio;
    }

    public int getcantidad() {
        return cantidad;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public void setprecio(double precio) {
        this.precio = precio;
    }

    public void setcantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "producto [id: " + id + ", nombre: " + nombre +
               ", precio: " + precio + ", cantidad: " + cantidad + "]";
    }
}
