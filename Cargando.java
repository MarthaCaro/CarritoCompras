package ejercicioCarrito;

public class Cargando implements EstadoCarrito {

    Carrito carrito;

    public Cargando(Carrito carrito) {
        System.out.println("Estado: Cargando");
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        System.out.println("se agrega producto con exito: "+producto.toString());
        carrito.getProductos().add(producto);
    }

    @Override
    public void cancelarCompra() {
        System.out.println("Compra cancelada");
        carrito.getProductos().clear();
        carrito.setEstado(new Vacio(carrito));
    }

    @Override
    public void siguienteEstado() {
        if (carrito.getProductos().size() > 0) {
            carrito.setEstado(new Pagando(carrito));
        } else {
            System.out.println("Error: El carrito no tiene productos");
        }
    }

    @Override
    public void anteriorEstado() {
        cancelarCompra();
    }
}
