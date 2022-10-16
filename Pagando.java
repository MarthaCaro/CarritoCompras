package ejercicioCarrito;

public class Pagando implements EstadoCarrito{

    Carrito carrito;

    public Pagando(Carrito carrito) {
        System.out.println("Estado: Pagando");
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Error: Ya estas pagando");
    }

    @Override
    public void cancelarCompra() {
        System.out.println("Compra cancelada");
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cerrado(carrito));
    }

    @Override
    public void anteriorEstado() {
        carrito.setEstado(new Cargando(carrito));
    }
}
