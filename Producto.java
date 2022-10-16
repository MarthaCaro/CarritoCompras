package ejercicioCarrito;

public class Producto {

    private double precio;
    private String descripcion;

    public Producto(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
