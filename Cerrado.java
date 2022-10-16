package ejercicioCarrito;

public class Cerrado implements EstadoCarrito {

    Carrito carrito;

    public Cerrado(Carrito carrito) {
        System.out.println("Estado: Cerrado");
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("Error: El carrito esta cerrado");
    }

    @Override
    public void cancelarCompra() {
        System.out.println("Error: La compra ya finalizó");
    }

    @Override
    public void siguienteEstado() {
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void anteriorEstado() {
        System.out.println("Error: Ya pagaste esta compra");
    }
}
