package ejercicioCarrito;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> productos;

    private EstadoCarrito estado;

    public Carrito() {
        productos = new ArrayList<>();
        estado = new Vacio(this);
    }

    public void agregarProducto(Producto producto) {
        estado.agregarProducto(producto);

    }


    public void cancelarCompra() {
        estado.cancelarCompra();
    }


    public void siguienteEstado() {
        estado.siguienteEstado();
    }


    public void anteriorEstado() {
        estado.anteriorEstado();
    }


    public List<Producto> getProductos() {
        return productos;
    }

    public EstadoCarrito getEstado() {
        return estado;
    }

    public void setEstado(EstadoCarrito estado) {
        this.estado = estado;
    }


    public void mostrarProductos(){
        System.out.println("Lista de productos hasta el momento");
        for (Producto producto: productos
             ) {
            System.out.println(producto.toString());
        }
    }
    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                ", estado=" + estado +
                '}';
    }
}
